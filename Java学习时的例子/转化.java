import java.util.Scanner;

public class ת�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//�����û�����һ��10���Ƶ�����
		System.out.println("������һ�����֣�");
		int a = input.nextInt();
		//2 ���÷�����10����ת����16����
		System.out.println(hexToDec(a));
		//3 �ٽ�16����ת��Ϊ10����
		
	}
	//���÷��� ��10����ת����16����
	//s Ҫת����10��������
	//return ת����16���� �����֣����ַ�����ʽ���أ�
	public static String hexToDec (int a) {
		String c = "";//ת���õ�16�����ַ���
		while(a != 0){
			int temp = a % 16;//ȡ����
			//������������Ϊ0~9֮������ֻ���10~15֮�������
			if (temp >= 0 && temp <= 9) {
				c = temp + c;//ÿȡһ������������ǰƴ��
			}
			else if(temp >= 10 && temp <=15){
				//������ת�����ַ���ƴ��
				c = (char)(temp - 10 + 'A') + c;
			}
			a /= 16;
		}
		
		return c;
		
	}
}
