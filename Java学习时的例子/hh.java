import java.util.Scanner;

public class hh{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����ֵ��������������ÿ��λ���ֵ��");
		// TODO Auto-generated method stub
		//1�õ�Ҫ�������������		//int a = 54321;  //Ҫ���в�ֵ���������
		int a;
		a = (int) input.nextFloat();//��������
		int b = a;  //��ʱ����
		//2������ر���
		int c = 0;  //ѭ������
		int d = 0;   //�ۼӺ�
		// 3ѭ���������ۼӺ�
		while(b > 0){
			d += b % 10;  //ÿ��ѭ���ۼӸ�λ
			b /=10;   //ȥ����λ��
		}
		//��ӡ���
		System.out.println(a + "�ĸ�������λ֮��Ϊ" + d);
	}

}
