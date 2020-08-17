import javax.management.loading.PrivateMLet;

public class human {
	
	//静态常量，出拳的信息
	public static final int typefist = 1;
	//静态常量，出拳的信息 赢得比赛
	public static final int typewin = 2;
	//静态常量，出拳的信息 输了比赛
	public static final int typelose = 3;
	//属性： 名称，分数，出拳，角色个性化台词
//	public static final int pyc2 = 4;
	public String name;
	public int fenshu;
	public int quan;
	
	//角色出拳时的个性化台词
	public String[] fistwords = {
			"动感光波！",
			"必杀： 露pp外星人",
			"大姐姐你喜欢青椒吗？",
			"大象大象你的鼻子为什么那么长"
	};
	
	
//	public String[] pyc = {
//			"工作\n工作\n工作\n工作\n工作",
//			"被朋友催婚\n被父母催婚\n被亲戚催婚\n一直被催婚\n从未停止",
//			"日渐消瘦\n渐消瘦\n消瘦\n瘦\n瘦",
//			"被告白\n抢着被告白\n被疯狂告白\n被中意人告白\n走路上被告白",
//			
//	};
	
	public String[] winwords = {
			"还有谁！",
			"你个菜鸡",
			"猜拳有点意思",
			"超神！！！！"
	};
	
	public String[] losewords = {
			"通往成功的道路总是在施工",
			"失败乃成功之母",
			"凉凉！！！",
			"我可能不太适合这游戏吧！"
	};
	//方法： 设置和得到名称，分数，说个性化台词，出拳
	
	
	/**
	 * 根据传入消息，随机打印出对应类型的消息
	 * xinxitype 对应着 human中的静态常量
	 * */
	public void sendxinxi(int xinxitype){
		//随机生成1~4的整数
		int index = ((int)(Math.random() * 1000)) % 5;
		String xuyao = null;
		
		switch (xinxitype) {
		case typefist:
			xuyao = fistwords[index];
			break;
			
		case typewin:
			xuyao = winwords[index];
			break;
		
		case typelose:
			xuyao = losewords[index];
			break;
//		case pyc2:
//			xuyao = pyc[index]; 
		}
		System.out.println(xuyao);
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getFenshu() {
		return fenshu;
	}



	public void setFenshu(int fenshu) {
		this.fenshu = fenshu;
	}



	public int getQuan() {
		return quan;
	}



	public void setQuan(int quan) {
		this.quan = quan;
	}
		
	
	
}
