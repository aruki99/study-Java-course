import java.util.Scanner;

public class si{
	//b Ϊ10λʱ���
	//a Ϊ13λʱ���
	//length Ϊ ���³���
	//baominrenshu = 9
	//i Ϊ �û��ı��
	// bianma Ϊ��Ϣ����
	// s Ϊ����
	
	public static void main(String[] args) {
		int baominrenshu = 10;
		// TODO Auto-generated method stub
		 
		
		for (int i = 1; i < 3; i++) {
			System.out.println("���������������");
		String wengzahng = "";
		String shuzhu = " ";
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String[] s = new String[i];
		for (int j = 0; j < 10; j++) {
			//String[] s = new String[i];//����
			
			
			System.out.println("����������Ͷ������£�����С��1000���Ҵ���100��");
			
		
			String wengzhang = input.next();// ��ȡ�û����������
			
			long starTime = System.currentTimeMillis();//��ȡʱ���
			//System.out.println(starTime);      //����ʱ���
			//String a = starTime;
			
			String a = String.valueOf(starTime);
			s[j] = a;
			//System.out.println(a.substring(0,10)); //��13λ��ʱ�����ȡλǰ10λ
			
			String b = (a.substring(0,10));
			
			//System.out.println(b);  //��ȡ10λ��ʱ���
			
			int length = wengzhang.length();// ��ȡ���µĳ���
			if(length >= 1000 || length < 100){
				System.out.println("�Ƿ�����");
				System.exit(0);
			}
			wengzahng = wengzhang;
			System.out.println("���" + name);
		    System.out.println("������³�Ϊ" + length + "��");
		    //System.out.println(wengzhang); 
		    System.out.println("��Ϊ��" + i + "λ����ɹ����û�");
		    //System.out.println("��ǰ������Ϣ����Ϊ��" + b + "" + length + "" + "0000" + i);//������Ϣ����
		    String bianma;
		    bianma = ("��ǰ������Ϣ����Ϊ��" + b + "" + length + "" + "0000" + i);
		    //System.out.println(bianma);//������Ϣ����
		    System.out.println(s[j]);
		    System.out.println();
		}
		
//	    s[i] = a;
	//    System.out.println(s[i]);
//	    String[] s = new String[i];
//	    s[i + 1] = a;
//	    System.out.println(s[i + 1]);
		}
		 
		
	
		
	   
	}

}
