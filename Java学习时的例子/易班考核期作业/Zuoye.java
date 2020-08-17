import java.util.Scanner;//导入扫描仪

public class Zuoye  {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("请输入你想要了解的数字(不大于五位数)；");
		
		int a ;
		a = (int) input.nextFloat();//接收数字
		if(a > 100000) //设定五位数的范围
		System.out.println("非法输入！");else{
		while(a >= -999999 ){
		
		int wangwei = 0;
		int qianwei = 0;
		int baiwei = 0;
		int shiwei = 0;
		int gewei = 0;
		wangwei = a / 10000;
		qianwei = (a %10000) / 1000;
		baiwei = (a % 1000) / 100;
		shiwei = (a / 10) % 10;
		gewei = (a % 100) % 10;
		
		if(a < 10){
			System.out.println("此数位1位数");
		}
			else if(a < 100){
			System.out.println("此数位2位数");
		}
			else if(a < 1000){
			System.out.println("此数位3位数");
		}	else if(a < 10000){
			System.out.println("此数位4位数");
		}
			else if(a <100000 ){
			System.out.println("此数位5位数");
		}
		System.out.println("此数字的每个位数分别为" + "万位" + wangwei + "." + "千位" + qianwei + "." + "百位" + baiwei + "." + "十位" + shiwei + "." + "个位" + gewei);
		System.exit(0);
		
		}
		}	
	}
}
	
		



