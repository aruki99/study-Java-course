import java.util.Scanner;
//三位玩家平均战斗力

public class yjx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a = 0 ; // 玩家战斗力
		double b = 0; //总战斗力
		double c = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" +  (i + 1) + "玩家的战斗力");
			a = input.nextInt();
			b = b + a;
			
			
		}
		c = b / 3;
		System.out.printf("平均值为 %.2f\n" , c);
		
		
		
	}

}
