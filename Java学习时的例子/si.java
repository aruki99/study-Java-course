import java.util.Scanner;

public class si{
	//b 为10位时间戳
	//a 为13位时间戳
	//length 为 文章长度
	//baominrenshu = 9
	//i 为 用户的编号
	// bianma 为信息编码
	// s 为数组
	
	public static void main(String[] args) {
		int baominrenshu = 10;
		// TODO Auto-generated method stub
		 
		
		for (int i = 1; i < 3; i++) {
			System.out.println("请先输入你的姓名");
		String wengzahng = "";
		String shuzhu = " ";
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String[] s = new String[i];
		for (int j = 0; j < 10; j++) {
			//String[] s = new String[i];//数组
			
			
			System.out.println("请输入你所投稿的文章，必须小于1000字且大于100字");
			
		
			String wengzhang = input.next();// 获取用户输入的文章
			
			long starTime = System.currentTimeMillis();//获取时间戳
			//System.out.println(starTime);      //测试时间戳
			//String a = starTime;
			
			String a = String.valueOf(starTime);
			s[j] = a;
			//System.out.println(a.substring(0,10)); //将13位的时间戳截取位前10位
			
			String b = (a.substring(0,10));
			
			//System.out.println(b);  //获取10位的时间戳
			
			int length = wengzhang.length();// 获取文章的长度
			if(length >= 1000 || length < 100){
				System.out.println("非法输入");
				System.exit(0);
			}
			wengzahng = wengzhang;
			System.out.println("你好" + name);
		    System.out.println("你的文章长为" + length + "字");
		    //System.out.println(wengzhang); 
		    System.out.println("你为第" + i + "位参与成功的用户");
		    //System.out.println("当前文章信息编码为：" + b + "" + length + "" + "0000" + i);//测试信息编码
		    String bianma;
		    bianma = ("当前文章信息编码为：" + b + "" + length + "" + "0000" + i);
		    //System.out.println(bianma);//测试信息编码
		    System.out.println(s[j]);
		    System.out.println();
		}
		
//	    s[i] = a;
	//    System.out.println(s[i]);
//	    String[] s = new String[i];
//	    s[i + 1] = a;
//	    System.out.println(s[i + 1]);
		}
		 
		
	
		
	   
	}

}
