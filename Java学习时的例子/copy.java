import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.swing.plaf.synth.SynthSeparatorUI;


public class copy {
	private static final String FilePath1 = "D:/��Ӱ/�޸ĺ�������ٴ�Ƭ.mp4";			//�������ļ�·��
	private static final String FilePath2 = "D:/��Ӱ/���ƺ�.mp4";					//���ƻ���к��ļ�·��
	
	public static void main(String[] args) throws IOException {
		
	long time = copyway();
	System.out.println("������ʱ��" + time + "����");
	
	
	}
	//ʹ�û����������ļ�
	//��������ʱ�� ��λ����
	private static long copyway(){
		File file = new File(FilePath1);
		
		if(!file.exists()){
			System.out.println("Ҫ���Ƶ��ļ�������");
			return 0;
		}
	long startime = System.currentTimeMillis();	//��ʼʱ��
	
	InputStream instream = null;			//�ⲿ����
	BufferedInputStream binstream = null;		
	
	OutputStream outstream = null;
	BufferedOutputStream boutstream = null;
	
	try {
		instream = new FileInputStream(file);				//������
		binstream = new BufferedInputStream(instream);
		
		outstream = new FileOutputStream(FilePath2);		//�����
		boutstream = new BufferedOutputStream(outstream);
		
		int i = -1; //��ȡ������ʱ����
		while((i = binstream.read()) != -1){
			boutstream.write(i);		//��ȡһ���ֽھ�д���˻�����
			//��󽫻����е����ݣ�д���ļ��У�	������Ҫ��ջ�����������д���ļ��� - flush
		}
		
		System.out.println("�ļ����Ƴɹ�");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally{
			try {
				//boutstream��flush();
				boutstream.close();	//����ֱ�ӵ���close�����������ǰ������Զ�������flush����
				outstream.close();
				binstream.close();
				instream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	//file.delete();														//�������е��÷�����
	//System.out.println("���гɹ�");
	long endtime = System.currentTimeMillis();	//����ʱ��
	return endtime - startime;
		
	}
}