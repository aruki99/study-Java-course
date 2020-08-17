import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class text2 {
	private static Scanner input;
	static int s = 5 ;
	//定义主播编号，主播，主播特长，粉丝数，主播介绍等 数组，并留出两个空位，给与新增主播留空位
	//1定义所需要的数组
	static String bianhao[] = {"1","2","3","4","5","",};
	static String zhubos[] = {"主播A" , "主播B" , "主播C" , "主播D" , "主播E" , "" , };
	static String techang[] = {"唱歌","跳舞","玩游戏","吃","写作业","",};
	static String fengsis[] = {"4362" , "23432" , "987" , "5464" , "99999","",};
	static long fengsis2[] = {4362 , 23432 ,987 , 5464 , 99999};
	static String jieshao[] = {"唱","跳","rap","篮球","music","",};
	//用以下定义的字符串插入 应去的数组中
	static String xinbianhao;
	static String xinzhubo = null;
	static String xintechang;
	static String xinfengsi;
	static String xinjieshao;
	public static void main(String[] args) throws IOException, InterruptedException {
			
		zhuboway();	 //调用方法！	
	}	
	
	//封装主播程序
	private static void zhuboway() {
		// TODO Auto-generated method stub

		//利用for循环，使程序多次运行
		System.out.println("欢迎来到兴兴直播间系统！");		
			for (int n = 1; n < 999; n++) {
			input = new Scanner(System.in);
			int z;
			if(n > 2){
				System.out.println("1 留在兴兴直播间     2 离开");
			}
			else if(n == 1){
					System.out.println("1 进入     2 离开");
			}
			z = (int) input.nextFloat();
				if(z == 1){
				
			//2此程序功能
			System.out.println("功能列表:");
			System.out.println("1 主播信息查看:");
			System.out.println("2 粉丝数量排序:");
			System.out.println("3 新增主播信息:");
			System.out.println("4 主播上线圈粉:");
			System.out.println("5 主播拉黑:");
			System.out.println("6 退出程序:");
				
			//SWITCH 做出基本菜单选项	
			input = new Scanner(System.in);
			int a;
			a = (int) input.nextFloat();//接收数字
			switch (a) {
			//主播列表
			case 1:
				//主播基本信息
				System.out.println("\t\t《主播信息》\t");
				for (int i = 0; i < bianhao.length; i++) {
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
					System.out.print(bianhao[i]  + "\t");
					System.out.print(zhubos[i]  + "\t");
					System.out.print(techang[i]  + "\t");
					System.out.print(fengsis[i]  + "\t");
					System.out.print(jieshao[i]  + "\t\n");
					
				}
				
				
				break;
			//主播分数查看并排序
			case 2:
				long t;
				 for (int j = 0; j < fengsis2.length - 1 ; j++) {
					for (int j2 = 0; j2 < fengsis2.length - j - 1; j2++) {
						if(fengsis2[j2] < fengsis2[j2 + 1]){
							t = fengsis2[j2];
							fengsis2[j2] = fengsis2[j2 + 1];
							fengsis2[j2 + 1] = t;
						}	// 测试时间排序
						long y;
						for (int i = fengsis2.length; i < fengsis2.length / 2; i--) {
							for (int i2 = fengsis2.length; i2 < fengsis2.length - i -1; i2--) {
								if(fengsis2[i2] < fengsis2[i2 + 1]){
									y = fengsis2[i2 + 1];
									fengsis2[i2 + 1] = fengsis2[i2];
									fengsis2[i2] = y;
								}
							}
						}
					}	
				}
				 //用for套出fengsi2 数组
				 System.out.println("\t\t主播粉丝排序\t");
					System.out.println("---------------------------------------->  ");
				 System.out.println("主播E\t主播B\t主播D\t主播A\t主播C");
					for (int k = 0; k < fengsis2.length; k++) {
						System.out.print(fengsis2[k] + "\t");
					}
					 System.out.println("\n写作业\t跳舞\t吃\t唱歌\t玩游戏");
					 System.out.println("music\t跳\t篮球\t唱\trap");
					 System.out.println("---------------------------------------->  ");
					System.out.println();
						break;
			//新增主播信息
			case 3:
				//通过下标索引，进行判断查询主播是否存在
				System.out.println("请输入需要查询主播的编号");
				int b;
				b = (int) input.nextFloat();//接收数字
				if(b == 0 || b > bianhao.length || b == 6){
					System.err.println("该主播不存在！");
					break;
				}
				//显示被查询主播的信息
				System.out.println("此主播信息为");
				System.out.print("主播编号" + "\t\t" +  bianhao[b-1] + "\t");
				System.out.print(zhubos[b-1] + "\t");
				System.out.print(zhubos[b-1] + "\t");
				System.out.print(techang[b-1]+ "\t");
				System.out.print(fengsis[b-1]+ "\t");
				System.out.print(jieshao[b-1]+ "\t");
				System.out.println();
				System.out.println("你想为我们增添新主播吗？");
				System.out.println("1 是   2 否");
				//询问是否加入新主播
				int c;
				c = (int) input.nextFloat();//接收数字
				if(c == 1){
					//插入新的主播信息
					System.out.println();
					System.out.println("请输入新主播的\t编号\t名称\t特长\t粉丝数\t介绍");
					System.out.println("主播编号必须为当前主播数+1，当前主播数为" + (bianhao.length - 1));
					
					xinbianhao = input.next();
					bianhao[s] = xinbianhao;
					//判断新主播编号是否按照正常逻辑输入
					long lon = Long.parseLong(bianhao[s]);
					if(lon <= (bianhao.length-1)){
						System.err.println("非法输入");
						break;
					}
					
					xinzhubo = input.next();
					zhubos[s] = xinzhubo;
					
					xintechang = input.next();
					techang[s] = xintechang;
					
		
					xinfengsi = input.next();
					fengsis[s] = xinfengsi;
					
					xinjieshao = input.next();
					jieshao[s] = xinjieshao;
					
					System.out.println("恭喜新主播上线");
					System.out.println("编号为" + bianhao[s] +"\t\t" + "名称为"+ zhubos[s] +"\t\t" + 
					"拥有特长为" + techang[s] + "\t" + "粉丝数为" + fengsis[s]+"\t" +  "基本介绍：" +jieshao[s]);
					System.out.println();
					System.out.println();
				}
				if(c == 2){
					System.out.println("那就不添加新主播吧！");
					
				}
				else if(c > 2){
					System.err.println("非法输入！");
					break;
				}
				for (int i = 0; i < bianhao.length; i++) {    //测试新主播是否录入数组中
					System.out.print("目前拥有的主播有");
					System.out.print(bianhao[i]+"\t");
					System.out.print(zhubos[i]+"\t");
					System.out.print(techang[i]+"\t");
					System.out.print(fengsis[i]+"\t");
					System.out.println(jieshao[i]+"\t");
				}
				break;
			//主播上线圈粉
			case 4:
				//主播上线圈粉
				//查询主播  利用索引
				System.out.println("输入你想查看的主播的编号");
				int d ;
				d = (int) input.nextFloat();//接收数字
				//判断是否在主播列表中
				if(d >= bianhao.length){
					System.err.println("非法输入");
					break;
				}else {
				System.out.println("该主播原先粉丝数为" + fengsis[d - 1]);
				System.out.println();
				//需要生成随机数字
				int suiji = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;    //常量 1000 - 9000
				System.out.println("通过此次直播，他的粉丝数增加了" + suiji);
				long lon = Long.parseLong(fengsis[d - 1]);  
				System.out.println();
				System.out.println("所以现在这位主播分数总数为" +  (lon +  suiji));  
				}
				break;
			//主播拉黑
			case 5:
				//删除数组中的某一个元素
				//接受需要被删除主播的编号（下标）
				System.out.println("你想拉黑哪个主播？他将再也不会出现在你能看到的直播间中");
				System.out.println("请输入你想拉黑主播的编号");
				int e ;
				e = (int) input.nextFloat();//接收数字
				
				if(e >= bianhao.length){
					System.err.println("非法输入");
				}else{
					System.out.println("你想拉黑的主播，编号为：" + bianhao[e-1]+"\t" + zhubos[e-1]+"\t"+ techang[e-1]+"\t" 
							+ fengsis[e-1]+"\t" + (jieshao[e-1]));
				System.out.println();
				System.out.println("你确定要拉黑该主播吗？");
				System.out.println("1 是,2 否");
					int f ;
					f = (int) input.nextFloat();//接收数字	
					if(f == 1){
					}else if(f == 2){
						System.out.println("好的，已取消拉黑");
							break;
					}
					else{
						System.err.println("非法输入");
						break;
					}
					//因为java中数组无法删除元素，只能用新的数组来代替被删除后的数组 
					//需要将被删除的主播移至最后一位元素，再进行删除
					//e = (int) input.nextFloat();//接收数字  //没用
					
					
					//删除编号
					if(e > 6){
						System.err.println("非法输入");
					}else{
					String h = bianhao[bianhao.length - 1];
					bianhao[bianhao.length -1] = bianhao[e-1];
					bianhao[e-1] = h;
					
					//目前为删除最后一个元素
					int l = bianhao.length-2;          
					String[] p = new String[bianhao.length - 1];       //p为代替旧数组的新数组
					for (int j = 0; j < p.length; j++) {
						//判断元素是否越界
						if(l < 0 || l > bianhao.length){
							throw new RuntimeException("元素越界... ");
						}
						if(j < l){
							p[j] = bianhao[j];
						}
						else{
							p[j] = bianhao[j];
						}
					}
					
					
					//删除主播
					if(e > 6){
						System.err.println("非法输入");
					}else{
					String j = zhubos[zhubos.length - 1];
					zhubos[zhubos.length -1] = zhubos[e-1];
					zhubos[e-1] = j;
					
					//目前为删除最后一个元素
					int k = zhubos.length-2;          
					String[] p2 = new String[zhubos.length - 1];       //p为代替旧数组的新数组
					for (int j2 = 0; j2 < p2.length; j2++) {
						//判断元素是否越界
						if(l < 0 || l > zhubos.length){
							throw new RuntimeException("元素越界... ");
						}
						if(j2 < l){
							p2[j2] = zhubos[j2];
						}
						else{
							p2[j2] = zhubos[j2];
						}
					}
					
					
					//删除特长
					if(e > 6){
						System.err.println("非法输入");
					}else{
					String j2 = techang[techang.length - 1];
					techang[techang.length -1] = techang[e-1];
					techang[e-1] = j;
					
					//目前为删除最后一个元素
					int ll = techang.length-2;          
					String[] p3 = new String[techang.length - 1];       //p为代替旧数组的新数组
					for (int j3 = 0; j3 < p3.length; j3++) {
						//判断元素是否越界
						if(l < 0 || l > techang.length){
							throw new RuntimeException("元素越界... ");
						}
						if(j3 < l){
							p3[j3] = techang[j3];
						}
						else{
							p3[j3] = techang[j3];
						}
					}
					//删除粉丝数
					if(e > 6){
						System.err.println("非法输入");
					}else{
					String j3 = fengsis[fengsis.length - 1];
					fengsis[fengsis.length -1] = fengsis[e-1];
					fengsis[e-1] = j;
					
					//目前为删除最后一个元素
					int lll = fengsis.length-2;          
					String[] p4 = new String[fengsis.length - 1];       //p为代替旧数组的新数组
					for (int j4 = 0; j4 < p4.length; j4++) {
						//判断元素是否越界
						if(l < 0 || l > fengsis.length){
							throw new RuntimeException("元素越界... ");
						}
						if(j4 < l){
							p4[j4] = fengsis[j4];
						}
						else{
							p3[j4] = fengsis[j4];
						}
					}
					//删除介绍
					if(e > 6){
						System.err.println("非法输入");
					}else{
					String j4 = jieshao[jieshao.length - 1];
					jieshao[jieshao.length -1] = jieshao[e-1];
					jieshao[e-1] = j;
					
					//目前为删除最后一个元素
					int llll = jieshao.length-2;          
					String[] p5 = new String[jieshao.length - 1];       //p为代替旧数组的新数组
					for (int j5 = 0; j5 < p5.length; j5++) {
						//判断元素是否越界
						if(l < 0 || l > jieshao.length){
							throw new RuntimeException("元素越界... ");
						}
						if(j5 < l){
							p5[j5] = jieshao[j5];
						}
						else{
							p5[j5] = jieshao[j5];
						}
					}
					//System.out.println(Arrays.toString(bianhao));//删除前的主播
					bianhao = p;
					System.out.println("目前在线主播编号为" + Arrays.toString(bianhao));
					System.out.println(e + "号主播已被拉黑" );
				}
				}
				}
				}
				}
				}
				break;
			
			case 6:
				//退出系统
				int g;
				System.out.println("是否退出系统");
				System.out.println("1 是\t 2否");
				g = (int) input.nextFloat();//接收数字
				if (g ==1) {
					System.out.println("你已成功退出系统！");
					System.exit(0);
				}else if(g == 2){
					System.out.println("感谢您选择兴兴直播间！");
					System.out.println("祝您生活愉快！");
				}	else{
					System.err.println("非法输入");
				}
			default:
				break;
			}
			
		}
			else if(z == 2){
				System.exit(0);
			}else{
				System.err.println("非法输入");
			}
			n++;
		}
		}
		}
				