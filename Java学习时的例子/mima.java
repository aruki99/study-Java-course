import java.util.Scanner;


public class mima {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = null; //����
		String b = "";
		//1д��ѭ���ṹ
		int c = 0;
		while(c < 3){
			System.out.println("��������ȷ���룺");
			b = input.next();
			//Java�в�����if��b == 123456��{}
			c++;
			if(!  "123456".equals(b)){
				System.out.println("�����������,ʣ��" + (3 - c) + "�λ��ᣡ" );
				if(c == 3){
					System.out.println("��������Ѵ����Σ�ϵͳǿ���˳���");
					System.exit(0);
				}
			}else{
				//c = 4;  ��θĽ���
				c = Integer.MAX_VALUE; //��c��ֵλ�����е����ֵ
 			}
		}
		System.out.println("����ɹ���");
		}
		
}


