import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;


public class newwaygeci {
	static final String filepath = "D:/桌面/歌词.txt"; 
		/**
		 * 字符流
		 * 将读取文件的方法封装在方法中，方便使用
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
				content.append(System.getProperty("line.separator"));	//拼接以个系统默认的分隔符	win-r\n
			}
			//删除最后的系统分隔符
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
		 * 使用printwriter对象写入文件
		 * 优点：代码简洁
		 * @param args
		 */
		public static void filebyprintwriter(String content,String filepath,boolean isappend){
			try(	//jdk1.7以后的写法，可以自动关闭资源
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
			//调用方法获得文件中的所有内容
			String content = filebyreader(filepath);
			//调用方法，将content字符串写入文件中
			filebyprintwriter(content, filepath, true);
		}
}
