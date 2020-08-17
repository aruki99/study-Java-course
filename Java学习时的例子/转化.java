import java.util.Scanner;

public class 转化 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//让让用户输入一个10进制的数字
		System.out.println("请输入一个数字：");
		int a = input.nextInt();
		//2 调用方法将10进制转化成16进制
		System.out.println(hexToDec(a));
		//3 再将16进制转化为10进制
		
	}
	//调用方法 将10进制转化成16进制
	//s 要转化的10进制数字
	//return 转化成16进制 的数字（以字符串方式返回）
	public static String hexToDec (int a) {
		String c = "";//转化好的16进制字符串
		while(a != 0){
			int temp = a % 16;//取余数
			//但是余数可能为0~9之间的数字或是10~15之间的数字
			if (temp >= 0 && temp <= 9) {
				c = temp + c;//每取一个余数，就往前拼接
			}
			else if(temp >= 10 && temp <=15){
				//把数字转化成字符再拼接
				c = (char)(temp - 10 + 'A') + c;
			}
			a /= 16;
		}
		
		return c;
		
	}
}
