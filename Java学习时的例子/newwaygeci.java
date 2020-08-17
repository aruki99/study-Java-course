import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;


public class newwaygeci {
	static final String filepath = "D:/����/���.txt"; 
		/**
		 * �ַ���
		 * ����ȡ�ļ��ķ�����װ�ڷ����У�����ʹ��
		 * @param filepath
		 * @return
		 */
		public static String filebyreader(String filepath){
		StringBuffer content = new StringBuffer();
		Reader reader = null;
		BufferedReader breader = null;
		try {
			reader = new FileReader(filepath);
			breader = new BufferedReader(reader);
			String line = null;
			while((line = breader.readLine()) != null){
				content.append(line);
				content.append(System.getProperty("line.separator"));	//ƴ���Ը�ϵͳĬ�ϵķָ���	win-r\n
			}
			//ɾ������ϵͳ�ָ���
			content.delete(content.toString().lastIndexOf(System.getProperty("line.separator")), content.toString().length());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				breader.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return content.toString();
		
	}
		
		/**
		 * ʹ��printwriter����д���ļ�
		 * �ŵ㣺������
		 * @param args
		 */
		public static void filebyprintwriter(String content,String filepath,boolean isappend){
			try(	//jdk1.7�Ժ��д���������Զ��ر���Դ
					FileOutputStream outstream = new FileOutputStream(filepath,isappend);
					PrintWriter writer = new PrintWriter(outstream);
					){
				writer.print(content);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			//���÷�������ļ��е���������
			String content = filebyreader(filepath);
			//���÷�������content�ַ���д���ļ���
			filebyprintwriter(content, filepath, true);
		}
}
