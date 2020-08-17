
import java.applet.Applet;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//public class text4 {
//
//	public static void main(String[] args) {
		public class text4{
			public static void main(String[] args)throws MalformedURLException,InterruptedException{
				Scanner input = new Scanner(System.in);
				
				int count = 5; 			//存放当前娘娘数量
				int currday = 0;		//游戏当前天数
				final int day_count = 10;	//游戏一共
				int choice;				//用来存放用户的选择
				int tempcount = 0;			//临时变量，用来存放好感度低于60的个数
				int index = -1;			//用来存放删除，查找时的索引
				String name;			//用来存放用户输入放入姓名
				
				//姓名数组，最多容纳6个字符串，每个字符串的最大长度位8 个字符 （英文）
				String[] names = {"西施","貂蝉","王昭君","杨玉环","赵飞燕",""} ;
				//级别数组，最多容纳5个字符串，每个字符串的最大长度位8个字符（英文）
				String[] levelnames = {"贵人","嫔妃","贵妃","皇贵妃","皇后",""};
				//用来存放每个妃子的登记，与levelnames联用， -1 表示未启用
				int level[] = {0,2,0,0,0,-1};
				//用来存放每个妃子的好感度，-1表示未启用
				int loves[] = {100,100,100,100,100,-1};
				JOptionPane.showMessageDialog(null, "陛下你来啦?", "欢迎来到后宫", 1, new ImageIcon("D:/桌面/images/title.jpg"));
				

				do{
					System.out.printf("第%d天\n", ++currday);
					System.out.printf("1、皇帝下旨选妃\t(增加)\n");
					Thread.sleep(500);
					System.out.printf("2、翻牌宠幸\t（修改状态）\n");
					Thread.sleep(500);
					System.out.printf("3、 打入冷宫!\t(删除)\n");
					Thread.sleep(500);
					System.out.printf("4、 朕的爱妃呢？\t(查找)\n");
					Thread.sleep(500);
					System.out.printf("请陛下选择");
					Object strMenu = null;
//					JOptionPane.showInputDialog(null, strMenu, "游戏进行到第" + currday + "天",
//							0, new ImageIcon("D:/桌面/images/宝座.jpg"), new String[] {
//									"1","2","3","4"},4);
					choice = input.nextInt();
					switch (choice) {
					case 1: //新增妃子，其他妃子好感度 - 10
						//判断数组长度是否可以增加元素
						if(count > level.length){
							System.out.println("\n后宫已经人满为患了，陛下还是等等吧！\n\n");
							break;
						}
						System.out.println("爱江山更爱美人，万千佳丽一点红！\n");
						System.out.println("娘娘名讳：");
						name = input.next();
						//将新增元素放入count处
						names[count] = name;
						level[count] = 0;
						loves[count] = 100;
						System.out.println("\n新增妃子,其他人好感度 - 10\n\n");
						for (int i = 0; i < count; i++) {
							loves[i] -= 10;
						}
						count++;
						break;

					case 2:   	//翻牌宠幸，被宠幸的好感度+20，其他好感度 -10
						
						System.out.println("陛下请输入要宠幸的姓名：");
						name  = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								index = i;
								continue;
							}
							
							loves[i] -= 10; 
						}
						if(index == -1){  //没有找到
							System.out.println("\n祖国尚未统一怎能儿女情长！\n\n");
						}
						else{
							loves[count] += 20;
							//每次的宠幸后，级别提高一级，最高为4级的皇后
							if(level[index] == 4){
								level[index] = 4;
							}else{
									level[index]++;
								}
							System.out.printf("\n********************************\n");
							System.out.printf("duang~ %s提升等级为：%s\n",names[index],levelnames[level[index]]);
							System.out.printf("\n********************************\n");
							System.out.printf("所有娘娘好感度 -10\n\n");
							}
						index -= 1;
						break;
					case 3://打入冷宫，执行删除操作
						System.out.println("要将哪位娘娘打入冷宫?");
						name = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								index = i;
								break;
							}
						}
						if(index == -1){	//为找到要删除的名字
							System.out.println("\n虚惊一场，没事，该吃吃喝喝，继续！\n\n");
							break;
						}
						//执行删除操作
							for (int i = index; i < count - 1; i++) {
								names[i] = names[i + 1];
								level[i] = level[i + 1];
								loves[i] = loves[i + 1];							
							}
							count--;	//总人数 -1
							index -= 1;	//变量用完，重置为初始值，方便下次使用
							System.out.printf("\n%s已被打入冷宫 ，人情冷暖，所有娘娘好感度+10\n\n",name);
								for (int i = 0; i < count; i++) {
									loves[i] += 10;									
								}
								index = - 1;
						break;
					case 4:	//根据姓名查找，好感度+10
						System.out.println("请输入要查找的姓名：");
						name = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								System.out.printf("\n微微一笑很倾城，%s的好感度+10 \n\n",name);
								loves[i] += 10;
								break;
							}
						}
						break;
					}//end of switch
					System.out.printf("姓名\t等级\t好感度\n");
					System.out.println("--------------------------");
					for (int i = 0; i < count; i++) {
						System.out.printf("%s\t%s\t%d\n",names[i],levelnames[level[i]],loves[i]);
					}
					//每天结算好感度，一旦有一个或三个以上嫔妃好感度低于60，即发生暴乱，皇帝死！游戏结束
					tempcount = 0;
					for (int i = 0; i < count; i++) {
						if(loves[i] < 60)
							tempcount++;
					}
					if(tempcount >= 3){
						System.out.printf("觉醒的嫔妃们：走！组队刷皇上去l !\n");
						//时间函数的固定用法
						Calendar cal = Calendar.getInstance();
						System.out.printf("公元%d年%d月%d日%d，皇帝猝！ 共执政%d天\n",
								cal.get(Calendar.YEAR),
								cal.get(Calendar.MONTH) + 1,
								cal.get(Calendar.DATE),
								currday
								);
						System.exit(0);
					}
				}while(currday < day_count);
				

				System.out.printf("皇帝登基10天来，风调雨顺，妻妾成群，五谷丰登。。。。。。。。\n");
				System.out.printf("没羞没臊的继续生活着。。。。。。\n");
				System.out.printf("姓名\t等级\t好感度\n");
				System.out.printf("····························\n");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%s\t%d\n", names[i] ,levelnames[i],loves[i]);
				}
			
	}
}