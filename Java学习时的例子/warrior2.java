
public class warrior2  extends hero{

	
	
	public warrior2(){
		super();
		setName("Ĭ��սʿ");
	}
	
	public warrior2(long id, String name, int x, int y){
		super(id ,name);
		setX(x);
		setY(y);
	}
	@Override
	public boolean canfight(hero hero) {
		double juli = distance(getX(), getY(), hero.getX(), hero.getY());	//�������������������֮��ľ���
		//����սʿ������ΧΪ100��
		return juli < 100;
	}

	@Override
	public void fight(hero hero) {
		//1�������������
		//2��ȥ����Ӣ�۵�life
		int a = ((int)(Math.random() * 1000)) % 61 + 20;		//���������Ϊ0��80
		setA(a);
		hero.setLife(hero.getLife() - a);
		System.out.println(getName() + "���ι��������" + a + "���˺�");
		System.out.println();
		
	}

}
