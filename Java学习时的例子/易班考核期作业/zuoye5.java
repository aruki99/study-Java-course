//投胎游戏
import java.util.Scanner; //导入扫描仪
public class zuoye5 {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("你来了，你想投胎到哪个国家呢？");
		System.out.println("输入你想投胎的国家的序号");
		System.out.println("1 china免费\n 2 USA 50W\n3 Canada 1W \n4 Africe 100\n5 SouthAsia 1000\n 6 other null");
	
		int a ;
		a = (int) input.nextFloat();//接收数字
		
		if(a == 1){
			System.out.println("好的，你很爱国，哈哈!");
		}
		else if(a == 2){
			System.out.println("没钱就别想！自动投胎至中国！");
		}
		else if(a == 3){
			System.out.println("没钱就别想！自动投胎至中国！");
		}
		else if(a == 4){
			System.out.println("没钱就别想！自动投胎至中国！");
		}
		else if(a == 5){
			System.out.println("没钱就别想！自动投胎至中国！");
		}
		else if(a == 6){
			System.out.println("没钱就别想！自动投胎至中国！");
			
		}
		System.out.println("现在开始选择你想要的性别的序号！");
		System.out.println("1男生 免费\t 2女生 50币");
		int b;
		b = (int) input.nextFloat();//接收数字
		switch (b) {
		case 1:
			System.out.println("顶天立地的男子汉啊！");
			break;
			
		case 2:
			System.out.println("你的余额不足，请充值！");
			System.out.println("请做出选择：");
			System.out.println("1  老子要充钱\t2  没钱不冲！");
			int c;
			c = (int) input.nextFloat();//接收数字
			if(c == 1){
				System.out.println("你有个头钱，一边玩去，当你的男孩子吧！");
			}
			else if(c == 2){
				System.out.println("对嘛，自己都没钱，还是乖乖的去当男孩子啦");
		}
		
		default:
			break;
		}
		System.out.println("好的，你现在已经是男生了，请你选择生活难度");
		System.out.println("1 简单 1W\n2 中等 5000\n3 困难 1000\n4 深渊 免费");
		int c;
		c = (int) input.nextFloat();//接收数字
		switch (c) {
		case 1:
		case 2:
		case 3:
			System.out.println("对不起余额不足！请充值");
			System.out.println("1 没钱\t 2 给老子冲");
			int d;
			d = (int) input.nextFloat();//接收数字
			if(d == 1){
				System.out.println("没钱就甭想啦");
			}
				else if(d == 2){
					System.out.println("没钱就甭想啦");
			}
			break;
		case 4:
			if(c == 4){
				System.out.println("不错，敢于挑战！");
			}
		default:
			break;
			}
	
		System.out.println("已选择深渊模式（手动滑稽）");
		System.out.println("那你想要什么样的出生家庭呢？");
		System.out.println("1 我爸是李gang 10W\n2 富二代 5W\n3 官二代 5W\n4 军二代 5W\n5 穷逼 免费");
		int e;
		e = (int) input.nextFloat();//接收数字
		switch (e) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("对不起，你没有钱啊！");
			System.out.println("1 没钱\t 2 给老子冲");
			int f;
			f = (int) input.nextFloat();//接收数字
			if(f == 1){
				System.out.println("没钱就甭想啦");
			}
				else if(f == 2){
					System.out.println("没钱就甭想啦");
			}
			break;
		case 5:
			if(e == 5){
				System.out.println("其实白手起家，咸鱼翻身不好吗，你说对吧！");
			}

		default:
			break;
		}
		
		System.out.println("其实你要记得没有钱可以为你的人生充值的啊");
		System.out.println("所以你该想想要怎么赚钱了");
		System.out.println("来选择你想要的技能吧");
		System.out.println("1 赚钱\n2 把妹\n3 文艺\n4 技工\n5 泡面\n6 毛都不会");
		int g;
		g = (int) input.nextFloat();//接收数字
		switch (g) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("对不起，你没有钱啊！");
			System.out.println("1 没钱\t 2 给老子冲");
			int h;
			h = (int) input.nextFloat();//接收数字
			if(h == 1){
				System.out.println("没钱就甭想啦");
			}
				else if(h == 2){
					System.out.println("没钱就甭想啦");
				}
			break;
			case 6:
				if(g == 6){
					System.out.println("其实什么都可以自己再学的嘛，是不是！");
				}
		default:
			break;
		}
		System.out.println("其实技能不会可以再学嘛");
		System.out.println("但是有张漂亮的脸蛋，你的人生就会不一样的");
		System.out.println("所以来选择你最想要的颜值吧！");
		System.out.println("1 帅哥套餐\n2 帅锅套餐\n3 随机吧");
		int i;
		i = (int) input.nextFloat();//接收数字
		switch (i) {
		case 1:
		case 2:
			System.out.println("对不起，你没有钱啊！");
			System.out.println("1 没钱\t 2 给老子冲");
			int h;
			h = (int) input.nextFloat();//接收数字
			if(h == 1){
				System.out.println("没钱就甭想啦");
			}
				else if(h == 2){
					System.out.println("没钱就甭想啦");
				}
			break;
		case 3:
			if(i == 3){
				System.out.println("其实长相不重要吧，男人要有内涵");
				System.out.println("不过你好像什么才艺都没欸（小声BB）");
			}

		default:
			break;
		}
		System.out.println("游戏结束，你觉得我们的游戏怎样？\n有没有想投诉的冲动哈（手动滑稽）");
		System.out.println("1 投诉\n2 不投诉");
		int j;
		j = (int) input.nextFloat();//接收数字
		switch (j) {
		case 1:
			System.out.println("投诉不可能投诉的，为表歉意，我送你一套伤疤脸套装吧");
			break;
		case 2:
			System.out.println("感谢你的支持，我们会继续努力的！");
		default:
			break;
		}
		}
}
