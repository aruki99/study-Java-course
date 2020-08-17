import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
		 * ����ԭ��
		 * 1����httpЭ�������ļ����ļ����������ļ����Ի������ķ�ʽ��ȡ���ڴ���
		 * 	InputStream -> BufferedinputStream
		 * 2���������е����ݷֿ�д��Ӳ���ϣ�ʹ��RandomAcessFile��ʵ�֣�
		 * ��ǰ������Ҫ��http�������ļ�
		 */
public class xiazaiqi {
	//���ص���9ѧ������Ƭ 146M
	public static final String Strurl = "http://www.xuetang9.com/video/xuetang9_intro.mp4";
	//��������ʱ�Ļ����С 1M = 10k
	public static final int MAX_BUFFER_SIZE = 10240;
	public static void main(String[] args) {
		//1����http���ӣ���ȡ�������ݳ��ȣ��������ݣ���ʽ�̶���
		//2������RandomAccessFile����
		//3�����������ݻ��浽�ֽ�������
		//4�������ֽ�����ͨ��RandomAccessFile����д�뵽�ļ��У��漰��һ���ļ�ָ��Ĳ�����
		
		HttpURLConnection connection = null;
		BufferedInputStream binstream = null;
		try {
			URL url = new URL(Strurl);		//����url'���󣬻���ļ���
			connection = (HttpURLConnection)url.openConnection();
			//������������-Raangeָ�ӷ��������������ļ����ֽڷ�Χ 0-   ��ʾ��ָ����ֹ����
			connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();	//���ӵ��˷�����
			//�ж��Ƿ����ӳɹ���һ�����ӳɹ��󣬷��صĴ���Ӧ����200�ķ�Χ��
			/**
			 * 1XX��ָʾ��Ϣ����ʾ�����Ѿ����ܣ���������
			 * 2XX���ɹ�����ʾ�����Ѿ��ɹ����ܣ���⣬����
			 * 3XX���ض��򣬱�ʾҪ���������Ҫ��һ������
			 * 4XX���ͻ��˴��󣬱�ʾ�������﷨���󣬻������޷�ʵ��
			 * 5XX���������󣬷�����δ��ʵ�ֺϷ�����
			 */
			System.out.println(connection.getResponseCode());
			if(connection.getResponseCode() / 100 != 2){
				System.err.println("���Ӵ��������ԣ�");
				return;
			}else{
				System.out.println("���ӳɹ�");
			}
			int filesize = connection.getContentLength();		//���Ҫ�����ļ���С���ֽ�����
			binstream = new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded = 0;		//�������������صİٷֱ�
			String filename = url.getFile();		//��������ļ���
			//��ȡ�ַ����������һ��б��+1��λ�ÿ�ʼ��ȡ
			filename = filename.substring(filename.lastIndexOf("/") + 1);
			RandomAccessFile file = new RandomAccessFile(filename, "rw");
			file.setLength(0);	//�ļ����
			file.seek(0);		//�ļ�ָ�����
			while(downloaded < filesize){
				byte[] buffer = null;		//�����ػ�������
				//�ж�Ϊ���ش�С�Ƿ���뻺��
				if(filesize - downloaded > MAX_BUFFER_SIZE){
					buffer = new byte[MAX_BUFFER_SIZE];
				}else{
					buffer = new byte[filesize - downloaded];
				}
				//�������е����ݶ�ȡ����
				int read = binstream.read(buffer);
				if(read == -1)break;	//�������
				//����ǰ���صĻ���д�뵽�ļ���
				file.seek(downloaded);//�����ļ�ָ��
				file.write(buffer,0,read);
				downloaded += read;
				System.out.println("��ǰ���ؽ��ȣ�" + downloaded * 1.0 / filesize * 10000/100/*����10000/100�İٷ���������λС��*/  + "%");
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			connection.disconnect();
			try {
				binstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
