import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ѭ������5��������ѣ�ͳ�����ѵ���500���������
		//������Ѵ��ڵ���500����������С��500�������+1
		//1ѭ������5����ҵ����ѽ��
		//2¼������ж��Ƿ�С��500
		//3�ۼ�С��500���ܴ���
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		double money = Double.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("�������" + (i + 1) + "λ��ҵ����ѽ�");
			money = input.nextDouble();
			
			if(money >= 500)
				continue;    //continue���ã���> 500 ֱ�������·����룬ֱ�ӻص������forѭ��
			a++; 
			
			
			//if(money < 500){
				//a++;
				
			}
		
		System.out.println("�����ܽ��С��500������Ϊ��" + a);  
//		int b = 0;
//		for (int i = 0; i < 100; i++) {
//			if(i % 2 != 0)
//			continue;
//		b += i;
//		System.out.println(b);
			
		}
	}

	


