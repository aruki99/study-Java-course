import java.util.Scanner;//����ɨ����

public class Zuoye  {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("����������Ҫ�˽������(��������λ��)��");
		
		int a ;
		a = (int) input.nextFloat();//��������
		if(a > 100000) //�趨��λ���ķ�Χ
		System.out.println("�Ƿ����룡");else{
		while(a >= -999999 ){
		
		int wangwei = 0;
		int qianwei = 0;
		int baiwei = 0;
		int shiwei = 0;
		int gewei = 0;
		wangwei = a / 10000;
		qianwei = (a %10000) / 1000;
		baiwei = (a % 1000) / 100;
		shiwei = (a / 10) % 10;
		gewei = (a % 100) % 10;
		
		if(a < 10){
			System.out.println("����λ1λ��");
		}
			else if(a < 100){
			System.out.println("����λ2λ��");
		}
			else if(a < 1000){
			System.out.println("����λ3λ��");
		}	else if(a < 10000){
			System.out.println("����λ4λ��");
		}
			else if(a <100000 ){
			System.out.println("����λ5λ��");
		}
		System.out.println("�����ֵ�ÿ��λ���ֱ�Ϊ" + "��λ" + wangwei + "." + "ǧλ" + qianwei + "." + "��λ" + baiwei + "." + "ʮλ" + shiwei + "." + "��λ" + gewei);
		System.exit(0);
		
		}
		}	
	}
}
	
		



