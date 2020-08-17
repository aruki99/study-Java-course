import java.util.Scanner;

public class biantai {
	//b 为10位时间戳
	//a 为13位时间戳
	//length 为 文章长度
	//baominrenshu = 4
	//i 为 用户的编号
	// bianma 为信息编码
	// s 为数组
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		final int n = 5;
		String[] s = new String[n];//时间戳数组
		
		final int m = 5;
		String[] z = new String[m];//字数数组
		
		for (int i = 1; i < n; i++) {
			
		System.out.println("请先输入你的姓名");
		System.out.println("请输入你所投稿的文章，必须小于1000字且大于100字");
		Scanner input = new Scanner(System.in);
		String wengzahng = "";
		String shuzhu = " ";
		String name = input.next();
		String wengzhang = input.next();// 获取用户输入的文章
		
		long starTime = System.currentTimeMillis();//获取时间戳
		//System.out.println(starTime);      //测试时间戳
		//String a = starTime;
		String a = String.valueOf(starTime);
		s[i] = a;
		
		//long lon = Long.parseLong(s[i]);                   //这里这里
       // System.err.println(lon + "感动感动");

		//System.out.println(a.substring(0,10)); //将13位的时间戳截取位前10位
		String b = (a.substring(0,10));
		//System.out.println(b);  //获取10位的时间戳
		int length = wengzhang.length();// 获取文章的长度
		String g = String.valueOf(length); //强制转换int 为String
		z[i] = g;
				
		if(length >= 1000 || length < 100){
			System.out.println("非法输入");
			System.exit(0);
		}
		wengzahng = wengzhang;
		System.out.println("你好" + name);
	    System.out.println("你的文章长为" + length + "字");
	    //System.out.println(wengzhang); 
	    System.out.println("你为第" + i + "位参与成功报名参赛的选手");
	    //System.out.println("当前文章信息编码为：" + b + "" + length + "" + "0000" + i);//测试信息编码
	    String bianma;
	    bianma = ("当前文章信息编码为：" + b + "" + length + "" + "0000" + i);
	    //System.out.println(bianma);//测试信息编码
	    System.out.println();
	  
		}
		
		 for (int i = 1; i < n; i++) {
			 System.out.println("第" + (i) +  "位的提交时间戳为" + s[i]);
			 System.out.println("若按提交早晚顺序排列，从早到晚为" + i +"号选手");
			 //取出每一次输入文章的信息编码			  
		}
		
		 for (int i = 1; i < n; i++) {
			
			 
//			 long lon = Long.parseLong(z[i]); 	//string的数组转为long
//			 int lon2=new Long(lon).intValue(); //long转为 int的lon2
//			 
//			 int[] nums = {lon2};//定义
//			 int t;
//			 for (int j = 0; j < nums.length - 1 ; j++) {
//				for (int j2 = 0; j2 < nums.length - j - 1; j2++) {
//					if(nums[j2] < nums[j2 + 1]){
//						t = nums[j2];
//						nums[j2] = nums[j2 + 1];
//						nums[j2 + 1] = t;
//					}	
//				}
//			}
			
			 for (int f = 1; i < n; i++) {
				 System.out.println("第" + i + "人文章字数为" + z[i]);
				 	}
//			 System.out.println("排序后：");
//				for (int k = 0; k < z.length; k++) {
//					System.out.println(z[i] + "\t");
//				}
			//取出每一次输入文章的字数
			 
		}
		 System.out.println("若根据字数的多少进行从少到多排序");
		 System.out.println("文章排序为");
		 
		 
	}

}
