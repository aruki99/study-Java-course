import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;


public class fuzhi {

	public static void main(String[] args) throws IOException {
		BufferedInputStream instream = new BufferedInputStream(System.in);
		byte[] bytes = new byte[200];
		System.out.println("请输入字符串：");
		instream.read(bytes);
		System.out.println("用户输入的字符串是\n" + new String(bytes));
		
	}
}
