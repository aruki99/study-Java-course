
public class herotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		hero hero1 = new warrior2(1, "曹操", 0, 0);
		hero hero2 = new warrior2(2, "宫本", 50, 50);
		while(hero1.getLife() > 0 && hero2.getLife() > 0){
		System.err.println("当前第" + i + "回合\n");
		hero1.pk(hero2);
		i++;
		System.err.print("当前第" + i + "回合");
		System.out.println();
		hero2.pk(hero1);
		i++;
		}
		if(hero2.getLife() <= 0){
			System.out.println();
			System.err.println(hero2.getName() + "生命值低于0,无法继续战斗");
			hero1.setLife(hero1.getLife() - hero2.getLife());
			hero2.setLife(0);
			System.out.println(hero1.getName() + "将额外伤害转为自己血量" + hero1.getLife());
		}else{
			System.out.println();
			System.err.println(hero1.getName() + "生命值低于0,无法继续战斗");
			hero2.setLife(hero2.getLife() - hero1.getLife());
			System.out.println(hero2.getName() + "将额外伤害转为自己血量" + hero2.getLife());
			hero1.setLife(0);
		}
		System.out.println();
		System.out.println("当前生命值");
		System.out.println(hero2.getName() + "\t" + hero1.getName());
		System.out.println(hero2.getLife() + "\t" + hero1.getLife());
	}

}
