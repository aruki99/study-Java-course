
public class hanhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanhua("兴哥：","技术部" , "有机你怎么还不来啊", 10, 1);
	}
	//实现游戏中的喊话功能
	//name 喊话者名称
	//channe1name 喊话频道名称
	//neiyong 喊话内容
	//cishu 喊话次数
	//jiangge 喊话时间间隔  单位 s
	public static void hanhua(String name, String channe1name , String leirong , int cishu ,  int jiange ){
		if(jiange < 5) jiange = 5; //强制时间间隔必须为5秒或以上
		//喊话逻辑，拼接字符串并打印
		String value = String.format("【%s】 %S %S ",
				channe1name , name , leirong);
		
		for (int i = 0; i < cishu; i++) {
			System.out.println(value + "元宝-10");
			
			try {
				Thread.sleep(jiange * 1000);  //休眠多少秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

