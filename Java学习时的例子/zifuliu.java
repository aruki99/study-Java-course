import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	/**
	 * ʹ���ַ��������ļ����в���
	 * @author ������
	 *
	 */
public class zifuliu {
	//������ж�ȡ����
	private static final String FilePath1 = "D:/java2/try/src/����ʮ�η�.java";
	private static final String FilePath2 = "D:/java2/try/src/����ʮ�η�.java";

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader(FilePath1));
		 //�̶��Ķ�ȡ��ʽ
		 //�̶��Ķ�ȡ��ʽ
		 //�̶��Ķ�ȡ��ʽ
		String line = null;
		while((line = bReader.readLine()) != null){
			System.out.println(line);
		}
		
		//Ҫд����ַ���
		String a = "hhhhhh";
		a += "";
		a += "";
		BufferedWriter bwriter = null;
		bwriter = new BufferedWriter(new FileWriter(FilePath2));
		bwriter.write(a);//���ַ���д�뵽������
		
		bwriter.close(); 
		
	}
}
