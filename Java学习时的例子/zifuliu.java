import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	/**
	 * 使用字符流，对文件进行操作
	 * @author 喻嘉兴
	 *
	 */
public class zifuliu {
	//对其进行读取操作
	private static final String FilePath1 = "D:/java2/try/src/二的十次方.java";
	private static final String FilePath2 = "D:/java2/try/src/二的十次方.java";

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new FileReader(FilePath1));
		 //固定的读取格式
		 //固定的读取格式
		 //固定的读取格式
		String line = null;
		while((line = bReader.readLine()) != null){
			System.out.println(line);
		}
		
		//要写入的字符串
		String a = "hhhhhh";
		a += "";
		a += "";
		BufferedWriter bwriter = null;
		bwriter = new BufferedWriter(new FileWriter(FilePath2));
		bwriter.write(a);//将字符串写入到缓存中
		
		bwriter.close(); 
		
	}
}
