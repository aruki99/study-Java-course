import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 循环输入5个玩家消费，统计消费低于500的玩家数量
		//如果消费大于等于500，则跳过，小于500则计数器+1
		//1循环输入5个玩家的消费金额
		//2录入后立判断是否小于500
		//3累加小于500的总次数
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		double money = Double.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "位玩家的消费金额：");
			money = input.nextDouble();
			
			if(money >= 500)
				continue;    //continue作用，若> 500 直接跳过下方代码，直接回到上面的for循环
			a++; 
			
			
			//if(money < 500){
				//a++;
				
			}
		
		System.out.println("消费总金额小于500的总数为：" + a);  
//		int b = 0;
//		for (int i = 0; i < 100; i++) {
//			if(i % 2 != 0)
//			continue;
//		b += i;
//		System.out.println(b);
			
		}
	}

	


