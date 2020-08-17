import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class geci {
		static final String filepath = "D:/桌面/歌词.txt"; 
	public static void main(String[] args) {
		
		
		/*
		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader(new FileReader(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //固定的读取格式
		 //固定的读取格式
		 //固定的读取格式
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
		StringBuffer 歌词 = new StringBuffer();
		try {
			reader = new FileReader(filepath);
			breader = new BufferedReader(reader);
			String line = null;
			try {
				while((line = breader.readLine()) != null){
					歌词.append(line);
					歌词.append(System.getProperty("line.separator"));	//拼接以个系统默认的分隔符	win-r\n
				}
				//将歌词更改，获得新歌词
				String new歌词 = 歌词.toString().replaceAll("女", "女生").replaceAll("男", "男生");
				//将新歌词写入文件
				writer = new FileWriter(filepath);
				bwriter = new BufferedWriter(writer);
				bwriter.write(new歌词);
				System.out.println("替换成功！");
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
