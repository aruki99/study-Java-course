import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;


public class fuzhi {

	public static void main(String[] args) throws IOException {
		BufferedInputStream instream = new BufferedInputStream(System.in);
		byte[] bytes = new byte[200];
		System.out.println("�������ַ�����");
		instream.read(bytes);
		System.out.println("�û�������ַ�����\n" + new String(bytes));
		
	}
}
