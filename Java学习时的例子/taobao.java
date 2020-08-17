import java.util.Scanner;

//2015年双十一，的交易额为800亿，每年递增百分之25，问按此速度哪一年达到2000亿？

public class taobao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//确定循环变量
		int year = 2015;  //年份
		double menoy = 800;   //交易额
		while(menoy <= 2000){
			
			menoy = menoy * 1.25;
			year++;
		}
		System.out.println("按每年25%的速度增长，当到" + year + "年时，营业额为2000亿");
		
	}

}
