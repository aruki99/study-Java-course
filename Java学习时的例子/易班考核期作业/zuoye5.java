//Ͷ̥��Ϸ
import java.util.Scanner; //����ɨ����
public class zuoye5 {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("�����ˣ�����Ͷ̥���ĸ������أ�");
		System.out.println("��������Ͷ̥�Ĺ��ҵ����");
		System.out.println("1 china���\n 2 USA 50W\n3 Canada 1W \n4 Africe 100\n5 SouthAsia 1000\n 6 other null");
	
		int a ;
		a = (int) input.nextFloat();//��������
		
		if(a == 1){
			System.out.println("�õģ���ܰ���������!");
		}
		else if(a == 2){
			System.out.println("ûǮ�ͱ��룡�Զ�Ͷ̥���й���");
		}
		else if(a == 3){
			System.out.println("ûǮ�ͱ��룡�Զ�Ͷ̥���й���");
		}
		else if(a == 4){
			System.out.println("ûǮ�ͱ��룡�Զ�Ͷ̥���й���");
		}
		else if(a == 5){
			System.out.println("ûǮ�ͱ��룡�Զ�Ͷ̥���й���");
		}
		else if(a == 6){
			System.out.println("ûǮ�ͱ��룡�Զ�Ͷ̥���й���");
			
		}
		System.out.println("���ڿ�ʼѡ������Ҫ���Ա����ţ�");
		System.out.println("1���� ���\t 2Ů�� 50��");
		int b;
		b = (int) input.nextFloat();//��������
		switch (b) {
		case 1:
			System.out.println("�������ص����Ӻ�����");
			break;
			
		case 2:
			System.out.println("������㣬���ֵ��");
			System.out.println("������ѡ��");
			System.out.println("1  ����Ҫ��Ǯ\t2  ûǮ���壡");
			int c;
			c = (int) input.nextFloat();//��������
			if(c == 1){
				System.out.println("���и�ͷǮ��һ����ȥ��������к��Ӱɣ�");
			}
			else if(c == 2){
				System.out.println("����Լ���ûǮ�����ǹԹԵ�ȥ���к�����");
		}
		
		default:
			break;
		}
		System.out.println("�õģ��������Ѿ��������ˣ�����ѡ�������Ѷ�");
		System.out.println("1 �� 1W\n2 �е� 5000\n3 ���� 1000\n4 ��Ԩ ���");
		int c;
		c = (int) input.nextFloat();//��������
		switch (c) {
		case 1:
		case 2:
		case 3:
			System.out.println("�Բ������㣡���ֵ");
			System.out.println("1 ûǮ\t 2 �����ӳ�");
			int d;
			d = (int) input.nextFloat();//��������
			if(d == 1){
				System.out.println("ûǮ�ͱ�����");
			}
				else if(d == 2){
					System.out.println("ûǮ�ͱ�����");
			}
			break;
		case 4:
			if(c == 4){
				System.out.println("����������ս��");
			}
		default:
			break;
			}
	
		System.out.println("��ѡ����Ԩģʽ���ֶ�������");
		System.out.println("������Ҫʲô���ĳ�����ͥ�أ�");
		System.out.println("1 �Ұ�����gang 10W\n2 ������ 5W\n3 �ٶ��� 5W\n4 ������ 5W\n5 ��� ���");
		int e;
		e = (int) input.nextFloat();//��������
		switch (e) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("�Բ�����û��Ǯ����");
			System.out.println("1 ûǮ\t 2 �����ӳ�");
			int f;
			f = (int) input.nextFloat();//��������
			if(f == 1){
				System.out.println("ûǮ�ͱ�����");
			}
				else if(f == 2){
					System.out.println("ûǮ�ͱ�����");
			}
			break;
		case 5:
			if(e == 5){
				System.out.println("��ʵ������ң����㷭��������˵�԰ɣ�");
			}

		default:
			break;
		}
		
		System.out.println("��ʵ��Ҫ�ǵ�û��Ǯ����Ϊ���������ֵ�İ�");
		System.out.println("�����������Ҫ��ô׬Ǯ��");
		System.out.println("��ѡ������Ҫ�ļ��ܰ�");
		System.out.println("1 ׬Ǯ\n2 ����\n3 ����\n4 ����\n5 ����\n6 ë������");
		int g;
		g = (int) input.nextFloat();//��������
		switch (g) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("�Բ�����û��Ǯ����");
			System.out.println("1 ûǮ\t 2 �����ӳ�");
			int h;
			h = (int) input.nextFloat();//��������
			if(h == 1){
				System.out.println("ûǮ�ͱ�����");
			}
				else if(h == 2){
					System.out.println("ûǮ�ͱ�����");
				}
			break;
			case 6:
				if(g == 6){
					System.out.println("��ʵʲô�������Լ���ѧ����ǲ��ǣ�");
				}
		default:
			break;
		}
		System.out.println("��ʵ���ܲ��������ѧ��");
		System.out.println("��������Ư������������������ͻ᲻һ����");
		System.out.println("������ѡ��������Ҫ����ֵ�ɣ�");
		System.out.println("1 ˧���ײ�\n2 ˧���ײ�\n3 �����");
		int i;
		i = (int) input.nextFloat();//��������
		switch (i) {
		case 1:
		case 2:
			System.out.println("�Բ�����û��Ǯ����");
			System.out.println("1 ûǮ\t 2 �����ӳ�");
			int h;
			h = (int) input.nextFloat();//��������
			if(h == 1){
				System.out.println("ûǮ�ͱ�����");
			}
				else if(h == 2){
					System.out.println("ûǮ�ͱ�����");
				}
			break;
		case 3:
			if(i == 3){
				System.out.println("��ʵ���಻��Ҫ�ɣ�����Ҫ���ں�");
				System.out.println("���������ʲô���ն�û�G��С��BB��");
			}

		default:
			break;
		}
		System.out.println("��Ϸ��������������ǵ���Ϸ������\n��û����Ͷ�ߵĳ嶯�����ֶ�������");
		System.out.println("1 Ͷ��\n2 ��Ͷ��");
		int j;
		j = (int) input.nextFloat();//��������
		switch (j) {
		case 1:
			System.out.println("Ͷ�߲�����Ͷ�ߵģ�Ϊ��Ǹ�⣬������һ���˰�����װ��");
			break;
		case 2:
			System.out.println("��л���֧�֣����ǻ����Ŭ���ģ�");
		default:
			break;
		}
		}
}
