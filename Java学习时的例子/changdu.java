import java.util.Scanner;

public class changdu {


		// TODO Auto-generated method stub
		public static void main(String[] args1){
			
		    String sys = "ѧ����Ϣ����";// ����һ���ַ�����ʾϵͳ����
		    System.out.println("��ӭ���롶" + sys + "��ϵͳ");// ���ϵͳ����
		    System.out.println("������һ������Ա���룺");
		    Scanner input = new Scanner(System.in);
		    String pass = input.next();// ��ȡ�û����������
		    int length = pass.length();// ��ȡ����ĳ���
		    if (length > 6 && length < 12) {
		        System.out.println("���볤�ȷ��Ϲ涨��");
		        System.out.println("����Ч�����μ����룺" + pass);
		    } else if (length >= 12) {
		        System.out.println("���������");
		    } else {
		        System.out.println("������̡�");
		    }
		}
	}


