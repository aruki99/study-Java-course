import java.util.Scanner;

//import java.util.Scanner;

public class choujiang {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//用户要猜的次数
		//用户需要猜中的次数
		int a = 0;	//用户猜测次数
		//int b = 5000;  //商品价格
		int b = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;    //常量 1000 - 9000
	

		System.out.println(b);   //偷看答案
		int c = -1;  //用户猜测的价格
		String d = null; //商品名称
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入你认为正确的价格:" + ++a +  "次");
			c = new Scanner(System.in).nextInt();
			if(c == b){//在猜测正确的情况下
				if(a == 1){
					System.out.println("牛逼了，一次就猜中了");
					d = "iphone 11 ";
					//System.out.println("奖品:iphone 11");
					
				}else if(a >= 2 && a <= 3){
					System.out.println("还可以哦！小伙子");
					d = "小米手环4";
					//System.out.println("奖品：小米手环4");
				}else if(a >= 3 && a <= 4){
					System.out.println("勉为其难的给你个小礼品吧");
					d = "32g U盘";
					//System.err.println("奖品：32G U盘");
				}
				break;
				}else if(c < b){
					System.out.println("小了");
				}else if(c > b){
					System.out.println("大了");
				}
			
		}if(null == d){
				System.out.println("很抱歉，次数已用光！你还是回家洗洗睡吧，哈哈哈！");
			}else if(null != d){
			System.out.println("恭喜你。中奖了！");
			System.out.println(d);
				}

			}
		}
		
		
	


