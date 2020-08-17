import java.util.Collections;

public class ���� {
	public static void main(String[] args) {
		int a = 100;
		long startime =  System.currentTimeMillis();
		String s = "*";
		for (int i = 0; i < a; i++) {
			s =  s + "*";

		}
		long endtime = System.currentTimeMillis();
		System.out.println("��ʱ" + (endtime - startime) + "����");
		
		//ʹ��Stringbuffer�����ַ���ƴ��
		startime = System.currentTimeMillis();
		
		StringBuffer s1 = new StringBuffer("*");
		for (int i = 0; i < a; i++) {
			s1.append ("*");
		}
		
		endtime = System.currentTimeMillis();
		System.out.println("stringbuffer��append��ʱ" + (endtime - startime) + "����");

		
		
		//ʹ��stringbuilder
		startime = System.currentTimeMillis();
		
		StringBuilder s2 = new StringBuilder("*");
		for (int i = 0; i < a; i++) {
			s2.append ("*");
		}
		
		endtime = System.currentTimeMillis();
		System.out.println("stringbuilder��append��ʱ" + (endtime - startime) + "����");

		
		//����
		StringBuffer b = new StringBuffer("1-1");
		for (int i = 0; i < 3; i++) {
			b.append("2-243"); //׷��Ԫ��
			b.append("׷��Ԫ��");  //׷��Ԫ��
		}
		System.out.println(b);
		System.err.println(b.reverse());         //��ת�ַ�
		System.out.println();
		
		b.insert(9, "   ������       ");             //�� �ַ��� �� �еĵ�9λ�� ���� ������
		System.out.println(b);					//�ɲ�����ֵ ���� 2L(long) 3F(float) 4D(double)
		
		b.deleteCharAt(3);						//ɾ����3��Ԫ��
		System.out.println(b);
		
		b.delete(2, 4);							//ɾ����2 �� 3��Ԫ�� = [2,4)
		System.out.println(b);
		
		
		b.replace(3, 9, "������ӭ��!!");  		//��b�еĵ�3�ŵ���9�� ���滻�� ������ӭ�㣡
		System.out.println(b);
		System.out.println("�����С" + b.capacity());
		
		b.setLength(20);						//�޶�b�ĳ���ֻ��20λ
		System.out.println(b);					//��Ϊ0����Ϊ����ַ���
		System.out.println("�����С" + b.capacity());

	}
}
