
public class hero2����{
	String a;
	int b, c;
	hero2����(String d){
		a = d;
		init();
	}
	
	void init() {
		// TODO Auto-generated method stub
		b =2;
		c =2;
		System.out.println(a + "\t��" +  b +"��\t" +  c + "��" + a);
	}
	public static void main(String[] args) {
		hero2���� yjx = new hero2����("������");
		
		
		
		
		// TODO Auto-generated method stub
		warrior սʿ1 = new warrior();
		warrior սʿ2 = new warrior();
		warrior սʿ3 = new warrior();
		warrior սʿ4 = new warrior();
		warrior սʿ5 = new warrior();
		fashi ��ʦ1 = new fashi();
		fashi ��ʦ2 = new fashi();
		fashi ��ʦ3 = new fashi();
		fashi ��ʦ4 = new fashi();
		fashi ��ʦ5 = new fashi();
		
		hero2 [] Ӣ�� = {
				սʿ1,սʿ2,սʿ3,սʿ4,սʿ5,
				��ʦ1,��ʦ2,��ʦ3,��ʦ4,��ʦ5
		};
		for (hero2 hero2 : Ӣ��) {
			System.out.println(hero2);
			
		}
		
	}

}
