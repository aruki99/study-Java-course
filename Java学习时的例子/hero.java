
public class hero {
	/**
	 * 游戏中的英雄
	 * 
	 * 玩家id 
	 *  名称 
	 *  等级 
	 *  经验值
	 */
	
	
	/**
	 * 玩家名称创建后 无法更改
	 * 级别在1 ~ 999之间
	 * 玩家每级升级所需要的经验公式
	 * （（等级 - 1）^ 3  + 60 ）/ 5 * ((等级 - 1) * 2 + 60)
	 */
	public long id;
	public String name;
	public int level;
	public long nowexp;   //当前经验
	public long exp;	  //当前级别升级所需的经验值 固定的 為 （（等级 - 1）^ 3  + 60 ）/ 5 * ((等级 - 1) * 2 + 60) 

	
	
	
	public hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public hero(String name){
		this.setName(name);
	}
	
	public hero(long id, String name, int level, long exp) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		else
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void name() {
		
	} void setName(String name) {
		if(null == name){
			name = "未知英雄";
		}else{
		this.name = name;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 1 || level > 999){
			this.level = 1;
		}else{
		this.level = level;
		}
	}
		
	

	public long getNowexp() {
		return nowexp;
	}


	public void setNowexp(long nowexp) {
		this.nowexp = nowexp;
	}


	public long getExp() {
		exp = ((long)Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60);
		return exp;
	}
	
	//因爲玩家每級 升级所需要的经验 为 固定 公式计算 不需要手动输入
//
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
