import java.util.Scanner;
//��λ���ƽ��ս����

public class yjx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a = 0 ; // ���ս����
		double b = 0; //��ս����
		double c = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("�������" +  (i + 1) + "��ҵ�ս����");
			a = input.nextInt();
			b = b + a;
			
			
		}
		c = b / 3;
		System.out.printf("ƽ��ֵΪ %.2f\n" , c);
		
		
		
	}

}
