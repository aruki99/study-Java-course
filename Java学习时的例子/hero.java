
public class hero {
	/**
	 * ��Ϸ�е�Ӣ��
	 * 
	 * ���id 
	 *  ���� 
	 *  �ȼ� 
	 *  ����ֵ
	 */
	
	
	/**
	 * ������ƴ����� �޷�����
	 * ������1 ~ 999֮��
	 * ���ÿ����������Ҫ�ľ��鹫ʽ
	 * �����ȼ� - 1��^ 3  + 60 ��/ 5 * ((�ȼ� - 1) * 2 + 60)
	 */
	public long id;
	public String name;
	public int level;
	public long nowexp;   //��ǰ����
	public long exp;	  //��ǰ������������ľ���ֵ �̶��� �� �����ȼ� - 1��^ 3  + 60 ��/ 5 * ((�ȼ� - 1) * 2 + 60) 

	
	
	
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
			name = "δ֪Ӣ��";
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
	
	//�����ÿ�� ��������Ҫ�ľ��� Ϊ �̶� ��ʽ���� ����Ҫ�ֶ�����
//
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
