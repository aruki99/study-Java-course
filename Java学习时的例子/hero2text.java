
public class hero2text {
	public static void main (String[] agrs){

		warrior ��֪���� = new warrior("�̿�",999,2000,3000);
		��֪����.setLevel(99);
		warrior ��֪����2 = new warrior("�̿�",999,2000,3000);
		��֪����2.setLevel(80);
		System.out.println(��֪���� == ��֪����2);
		System.out.println(��֪����.equals(��֪����2));
		System.out.println(��֪����.compareTo(��֪����2));
		
		
		��֪����.move();
		
		fashi a = new fashi();
		System.out.println(a);
		fashi ���� = new fashi();
		����.biubiu();
		System.out.println("����" + ����.getLevel());
		System.out.println("��ǰѪ��" + ����.getCurrlife());
		System.out.println("����ǿ��" + ����.getFaqian());
		System.out.println(����);
	}
}
