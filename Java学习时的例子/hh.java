import java.util.Scanner;

public class hh{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数值，我来计算他的每个位相加值：");
		// TODO Auto-generated method stub
		//1得到要计算的整型数字		//int a = 54321;  //要进行拆分的整型数字
		int a;
		a = (int) input.nextFloat();//接收数字
		int b = a;  //临时变量
		//2声明相关变量
		int c = 0;  //循环变量
		int d = 0;   //累加和
		// 3循环操作与累加和
		while(b > 0){
			d += b % 10;  //每次循环累加个位
			b /=10;   //去掉个位数
		}
		//打印结果
		System.out.println(a + "的各个数字位之和为" + d);
	}

}
