
public class warrior2  extends hero{

	
	
	public warrior2(){
		super();
		setName("默认战士");
	}
	
	public warrior2(long id, String name, int x, int y){
		super(id ,name);
		setX(x);
		setY(y);
	}
	@Override
	public boolean canfight(hero hero) {
		double juli = distance(getX(), getY(), hero.getX(), hero.getY());	//这样获得了两个任人物之间的距离
		//假设战士攻击范围为100；
		return juli < 100;
	}

	@Override
	public void fight(hero hero) {
		//1生成随机攻击力
		//2减去传入英雄的life
		int a = ((int)(Math.random() * 1000)) % 61 + 20;		//随机攻击力为0到80
		setA(a);
		hero.setLife(hero.getLife() - a);
		System.out.println(getName() + "本次攻击造成了" + a + "点伤害");
		System.out.println();
		
	}

}
