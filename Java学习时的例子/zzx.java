import java.util.Scanner;

public class zzx {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("计算1到n的累加值");
		System.out.println("输入正整数n：");
		int n , summ = 0;
		n = (int) input.nextFloat();//接收数字
		if(n < 0){
			System.err.println("非法输入");
			System.exit(0); //判断n是否为正数
		}
		
		for (int i = 1; i <= n; i++) {
			summ = summ + i;
		}
		System.out.println("1到n的累加值为：" + summ);
	}
	
}
