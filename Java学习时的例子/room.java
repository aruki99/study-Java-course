import java.util.Scanner;

//游戏房间
public class room {
	//属性 记分牌 道具 参与游戏的玩家，房间号，房间名称，
	
	public human player1 = null;
	public computer player2 = null;
	//房间id
	public int roomid;
	//房间名称
	public String roomname;
	//房间密码
	public String roompass;
	
	
	
	public room(String roomname,String roompass){
		if(!("ABC" == roomname && "123" == roompass)){
			System.out.println("房间密码或名称错误，游戏强制退出");
			System.exit(0);
		}
		this.setRoomname(roomname);
		intgame();
		stargame();
		endgame();
		
	}
	//方法：  开始游戏 初始化游戏 显示菜单  选着人物  判断输赢 
	
	//初始化游戏
	public void intgame(){
		//实例化游戏对象
		player1 = new human();
		player2 = new computer();
		//初始化游戏其他属性
		//如：游戏中的花花草草等
		for (int i = 0; i < 30; i++) {
			System.out.print("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("游戏加载成功！");
	}
	//开始游戏
	public void stargame(){
		showmenu();
		choicerole();
		gaming();
		//打印结果
		
	}

	//游戏的大循环
	private void gaming() {
		while(true){
		//双方出拳 
		System.out.println(player1.getName() + "请出拳");
		int quan1 = player1.getQuan();
		//玩家1
		player1.setQuan(new Scanner(System.in).nextInt());
		//电脑出拳
		player2.getQuan();
		int quan2 = player2.getQuan();
		//判断
		int jieguo = judge(quan1, quan2);//调用方法 判断结果
		//如果返回 -1，玩家1胜利 如果为0 打平，如果为 1，玩家2胜利
		if(jieguo == -1){
			System.out.println("【裁判：】" + player1.getName() + "胜利");
			System.out.println(player1.getName() + ":");
			player1.sendxinxi(human.typewin);
			System.out.println(player2.getName() + ":");
			player2.sendxinxi(computer.typelose);
		}else if(jieguo == 1){
			System.out.println("【裁判：】" + player2.getName() + "胜利");
			System.out.println(player1.getName() + ":");
			player1.sendxinxi(human.typelose);
			System.out.println(player2.getName() + ":");
			player2.sendxinxi(computer.typewin);
		}else if(jieguo == 0){
			System.out.println("【裁判：平局哦~】");
			player1.sendxinxi(human.typefist);
			player2.sendxinxi(computer.typefist);
		}
		System.out.println("是否继续游戏！\t y/n");
		String answer = new Scanner(System.in).next();
		if("y".equals(answer)){
			System.out.println("那我们继续");
		}else{
			System.out.println("已退出房间");
			return;
		}
	}
	}
	//展示菜单
	public void showmenu(){
		System.out.println("欢迎进入\t" + roomname + "房间");
		System.out.println("选着出拳:1 石头\t2 剪刀\t3 布");
	}
	//选着人物
	public void choicerole(){
		System.out.println("请选择对手:1 风间\t2 妮妮\t3 正南\t4 阿呆 \n请选择对手：");
		int choice = new Scanner(System.in).nextInt();
		String[] namearray = {"风间","妮妮","正南","阿呆"};
		//省略对用户输入的验证
		player2.setName(namearray[choice - 1]);
		player1.setName("野原新之助");
		System.out.println(player1.getName() + "vs" + player2.getName());
	}
	//判断输赢
	public int judge(int quan1, int quan2){
		if(quan1 == quan2) return 0;
		if(quan1 ==1 && quan2 == 2 || quan1 == 2 && 
				quan2 == 3 || quan1 == 3 && quan2 == 1) {
			//玩家1分数 + 1，玩家2 分数 - 1 
			player1.setFenshu(player1.getFenshu() + 1);
			player2.setFenshu(player2.getFenshu() - 1);
			return -1;	//玩家1胜利
		}else{
			//玩家1分数 - 1，玩家2 分数 + 1 
			player1.setFenshu(player1.getFenshu() - 1);
			player2.setFenshu(player2.getFenshu() + 1);
			return 1;
		}
	}
	
	//结束游戏
	public void endgame(){
		System.out.println();
		System.out.println(player1.getName() + "\t" + player2.getName());
		System.out.println(player1.getFenshu() + "\t" + player2.getFenshu());
		System.out.println("游戏已结束，欢迎你再来。");
	}
	
	
	
	
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getRoompass() {
		return roompass;
	}
	public void setRoompass(String roompass) {
		this.roompass = roompass;
	}
	
	
}
