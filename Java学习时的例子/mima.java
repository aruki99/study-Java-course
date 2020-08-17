import java.util.Scanner;


public class mima {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = null; //密码
		String b = "";
		//1写出循环结构
		int c = 0;
		while(c < 3){
			System.out.println("请输入正确密码：");
			b = input.next();
			//Java中不允许if（b == 123456）{}
			c++;
			if(!  "123456".equals(b)){
				System.out.println("密码输入错误,剩余" + (3 - c) + "次机会！" );
				if(c == 3){
					System.out.println("密码错误已达三次，系统强制退出！");
					System.exit(0);
				}
			}else{
				//c = 4;  如何改进？
				c = Integer.MAX_VALUE; //让c的值位整型中的最大值
 			}
		}
		System.out.println("登入成功！");
		}
		
}


