import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class geci {
		static final String filepath = "D:/����/���.txt"; 
	public static void main(String[] args) {
		
		
		/*
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //�̶��Ķ�ȡ��ʽ
		 //�̶��Ķ�ȡ��ʽ
		 //�̶��Ķ�ȡ��ʽ
		String line = null;
		try {
			while((line = bReader.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		Reader reader = null;
		BufferedReader breader = null;
		Writer writer = null;
		BufferedWriter bwriter = null;
		StringBuffer ��� = new StringBuffer();
		try {
			reader = new FileReader(filepath);
			breader = new BufferedReader(reader);
			String line = null;
			try {
				while((line = breader.readLine()) != null){
					���.append(line);
					���.append(System.getProperty("line.separator"));	//ƴ���Ը�ϵͳĬ�ϵķָ���	win-r\n
				}
				//����ʸ��ģ�����¸��
				String new��� = ���.toString().replaceAll("Ů", "Ů��").replaceAll("��", "����");
				//���¸��д���ļ�
				writer = new FileWriter(filepath);
				bwriter = new BufferedWriter(writer);
				bwriter.write(new���);
				System.out.println("�滻�ɹ���");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				breader.close();
				reader.close();
				bwriter.flush();
				bwriter.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
