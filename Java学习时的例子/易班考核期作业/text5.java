
import java.util.Date;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class text5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] yesheng = {"褒姒","虞姬","蔡徐坤","春哥","鱼"};//待选
		int newCOUNT = yesheng.length;
		String[] nnname = {"西施","貂蝉","王昭君","钟无艳","苏一一","","","","",""};
		String[] levelname = {"贵人","嫔妃","贵妃","皇贵妃","皇后"};
		int[] level = new int [10];
		int[] loves = new int [10];
		
		int nncount = 5;          //当前娘娘数量
		int gameday = 1;
		
		for (int i = 0; i < nncount; i++) {
			loves[i] = 100;
		}
		JOptionPane.showMessageDialog(null, "陛下你来啦?", "欢迎来到后宫", 1, new ImageIcon("D:/桌面/images/title.jpg"));
		while(gameday <= 10){

			
			String menu ="1、皇帝下旨选妃(增加)\n";
			menu += "2、翻牌宠幸（修改状态)\n";
			menu += "3、 打入冷宫!(删除)\n";
			menu += "4、 朕的爱妃呢？(查找)\n";
			menu += "请选择";
			Object objResult = JOptionPane.showInputDialog(null, menu, "游戏进行到第" + gameday + "天",
					0, new ImageIcon("D:/桌面/images/宝座.jpg"), new String[] {
							"1","2","3","4"},4);

			int choice =  Integer.parseInt(objResult.toString());
			switch (choice) {
			
			
			case 1:
				if(nncount == nnname.length){
					System.out.println("皇帝陛下，后宫已经人满为患了！");
					break;
				}

				objResult = JOptionPane.showInputDialog(null, "请选择秀女", "选妃",0 ,
						new ImageIcon("D:/桌面/images/选妃.jpg"), 
						yesheng, 
						null);
					if(objResult == null){
						break;
					}
					JOptionPane.showMessageDialog(null, objResult , "选择的嫔妃" ,0, new ImageIcon("D:/桌面/images/"+ yesheng +".jpg"));
				nnname[nncount] = yesheng.toString();
				
				loves[nncount++] = 100;
				
				for (int i = 0; i < nncount; i++) {
					loves[i] -= 10;
				}
				break;
			case 2:

				
				objResult = JOptionPane.showInputDialog(null, "陛下请选择", "翻牌", 0,
						new ImageIcon("D:/桌面/images/选妃翻牌.jpg"), nnname, null);
					if(objResult == null){
						break;
					}
					String name = objResult.toString();
				int s = -1;
				for (int i = 0; i < nncount; i++) {
					if(name.compareTo(nnname[i]) == 0){   //姓名相等的情况
						s = i;
						break;	
					}
				}
				if(s == -1){
					System.out.println("陛下不要活在梦中！");
					break;
				}
				loves[s] += 20;
				if(s == levelname.length - 1){
					System.out.println(nnname[s] + "升级失败");
					loves[s] += 10;
					//break;
					
				}else{
					level[s] ++;
					for (int i = 0; i < nncount; i++) {
						if(i == s){
							continue;
						}
						loves[i] -= 10;
					}
					System.out.println("宠幸" + nnname[s] + "好感度 + 10,升级为" +levelname[level[s]] +  "，其他娘娘好感度 - 10");
					JOptionPane.showMessageDialog(null,"宠幸" + nnname[s] + "好感度 + 10,升级为" +levelname[level[s]] +  "，其他娘娘好感度 - 10" , 
							"翻牌结果", 0, new ImageIcon("D:/桌面/images/" +  nnname[s] + ".jpg"));
				}
				
				break;
			case 3:
				JOptionPane.showInputDialog(null, "你不爱谁了？", "打入冷宫",
						0, new ImageIcon("D:/桌面/images/打入冷宫.jpg"), nnname, 4);
				String name2 = objResult.toString();
				int index = -1;
				for (int i = 0; i < nncount; i++) {
				//if(name2.equals(nnname[i])){
					/*
					 * 我tm的为什么if不运行？？
					 * 都是按着上面的复制下来的
					 * 没看懂
					 * 重点
					 */
						index = i;
						break;
					//}
				}
				System.err.println(index);
				if(index == -1){	//为找到要删除的名字
					System.out.println("\n虚惊一场，没事，该吃吃喝喝，继续！\n\n");
					break;
				}
				//执行删除操作
					for (int i = index; i < nncount - 1; i++) {
						System.err.println(i);
						nnname[i] = nnname[i + 1];
						level[i] = level[i + 1];
						loves[i] = loves[i + 1];							
					}
					nncount--;	//总人数 -1
					index -= 1;	//变量用完，重置为初始值，方便下次使用
					
					JOptionPane.showMessageDialog(null, "已被打入冷宫 ，人情冷暖，所有娘娘好感度+10\n\n","~冷宫~", 0,new ImageIcon("D:/桌面/images/成功打入冷宫.jpg"));
					//System.out.printf("\n%s已被打入冷宫 ，人情冷暖，所有娘娘好感度+10\n\n",nnname,level,loves);
						for (int i = 0; i < nncount; i++) {
							loves[i] += 10;									
						}
						index = - 1;
				break;
			case 4:
				JOptionPane.showInputDialog(null, "朕的爱妃呢？", "查找",
						0, new ImageIcon("D:/桌面/images/朕的爱妃呢.jpg"), nnname,4);
//				if(objResult == null){
//					break;
//				}
				String name3 = objResult.toString();
				int s3 = -1;
				for (int i = 0; i < nncount; i++) {
					//if(name3.compareTo(nnname[i]) == 0){ 
						s3 = i;
						loves[s3] +=20;//姓名相等的情况
						
						break;	
				//	}
				}
				default:
			}

			//如果三个以上的嫔妃好感度低于 60，则暴乱
			int count = 0;
			for (int i = 0; i < nncount; i++) {
				if(loves[i] < 60){
					count++;
				}
			}
			String rvalue = "后宫有三个以上的嫔妃好感度低于 60,发生暴乱";
			rvalue += new Date().toLocaleString();
			if(count >= 3){
				JOptionPane.showMessageDialog(null, "后宫有三个以上的嫔妃好感度低于 60,发生暴乱", "boom！", 0,new ImageIcon("D:/桌面/images/皇上被害.jpg"));
				System.exit(0);
			}
			String value = "没羞没臊的继续生活着。。。。。。\n";
			
			for (int i = 0; i < nncount; i++) {
				value += String.format("%s	%s	%d\n", nnname[i],levelname[level[i]],loves[i]);
			}	
			JOptionPane.showMessageDialog(null, value, "每日结算", 0,new ImageIcon("D:/桌面/images/嬉戏.jpg"));
			gameday++;
		}
		
	}
}