import java.util.Scanner;

public class yuan {
	
	
		
	// TODO Auto-generated method stub
	//Բ�İ뾶
		public double r;
	//Բ���ܳ�
		public double c;
	//Բ�����
		public double s;
		
		//����뾶
		public void input(){
			System.out.println("������뾶:");
			Scanner input = new Scanner(System.in);
			r = input.nextDouble();
			
		}
		//��ӡ�ܳ�
		public void showc(){
			if(r <= 0){
				System.err.println("������뾶");
				input();
			}
			c = 2 * Math.PI * r;
			System.out.println("�ܳ�Ϊ" + c);
			
		}
		//��ӡ���
		public void shows(){
			if(r <= 0){
				System.err.println("������뾶");
				input();
			}
			s = Math.PI * r * r;
			System.out.println("���Ϊ" + s);
			
		}
		}
		
			
		
	


