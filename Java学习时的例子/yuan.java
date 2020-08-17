import java.util.Scanner;

public class yuan {
	
	
		
	// TODO Auto-generated method stub
	//圆的半径
		public double r;
	//圆的周长
		public double c;
	//圆的面积
		public double s;
		
		//输入半径
		public void input(){
			System.out.println("请输入半径:");
			Scanner input = new Scanner(System.in);
			r = input.nextDouble();
			
		}
		//打印周长
		public void showc(){
			if(r <= 0){
				System.err.println("请输入半径");
				input();
			}
			c = 2 * Math.PI * r;
			System.out.println("周长为" + c);
			
		}
		//打印面积
		public void shows(){
			if(r <= 0){
				System.err.println("请输入半径");
				input();
			}
			s = Math.PI * r * r;
			System.out.println("面积为" + s);
			
		}
		}
		
			
		
	


