import java.util.Scanner;

public class zzx {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("����1��n���ۼ�ֵ");
		System.out.println("����������n��");
		int n , summ = 0;
		n = (int) input.nextFloat();//��������
		if(n < 0){
			System.err.println("�Ƿ�����");
			System.exit(0); //�ж�n�Ƿ�Ϊ����
		}
		
		for (int i = 1; i <= n; i++) {
			summ = summ + i;
		}
		System.out.println("1��n���ۼ�ֵΪ��" + summ);
	}
	
}
