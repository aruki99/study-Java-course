import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class url {
	static final String filepath = "src/163.html ";
	public static void main(String[] args) throws MalformedURLException {
		URL url1 = new URL("http://www.163.com/index,html");
		//将inputstream转化为reader的套路，使用装饰器类inputstreamreader
		StringBuffer leirong = new StringBuffer();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream()))){
			String line = null;
			
			while((line = reader.readLine()) != null){
				leirong.append(line);
				leirong.append(System.getProperty("line.separator"));
			}
			
			newwaygeci.filebyprintwriter(leirong.toString(), filepath, false);	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
