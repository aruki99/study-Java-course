
public class hero2数组{
	String a;
	int b, c;
	hero2数组(String d){
		a = d;
		init();
	}
	
	void init() {
		// TODO Auto-generated method stub
		b =2;
		c =2;
		System.out.println(a + "\t有" +  b +"手\t" +  c + "腿" + a);
	}
	public static void main(String[] args) {
		hero2数组 yjx = new hero2数组("喻嘉兴");
		
		
		
		
		// TODO Auto-generated method stub
		warrior 战士1 = new warrior();
		warrior 战士2 = new warrior();
		warrior 战士3 = new warrior();
		warrior 战士4 = new warrior();
		warrior 战士5 = new warrior();
		fashi 法师1 = new fashi();
		fashi 法师2 = new fashi();
		fashi 法师3 = new fashi();
		fashi 法师4 = new fashi();
		fashi 法师5 = new fashi();
		
		hero2 [] 英雄 = {
				战士1,战士2,战士3,战士4,战士5,
				法师1,法师2,法师3,法师4,法师5
		};
		for (hero2 hero2 : 英雄) {
			System.out.println(hero2);
			
		}
		
	}

}
