import java.util.Scanner;

public class biantai {
	//b Ϊ10λʱ���
	//a Ϊ13λʱ���
	//length Ϊ ���³���
	//baominrenshu = 4
	//i Ϊ �û��ı��
	// bianma Ϊ��Ϣ����
	// s Ϊ����
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		final int n = 5;
		String[] s = new String[n];//ʱ�������
		
		final int m = 5;
		String[] z = new String[m];//��������
		
		for (int i = 1; i < n; i++) {
			
		System.out.println("���������������");
		System.out.println("����������Ͷ������£�����С��1000���Ҵ���100��");
		Scanner input = new Scanner(System.in);
		String wengzahng = "";
		String shuzhu = " ";
		String name = input.next();
		String wengzhang = input.next();// ��ȡ�û����������
		
		long starTime = System.currentTimeMillis();//��ȡʱ���
		//System.out.println(starTime);      //����ʱ���
		//String a = starTime;
		String a = String.valueOf(starTime);
		s[i] = a;
		
		//long lon = Long.parseLong(s[i]);                   //��������
       // System.err.println(lon + "�ж��ж�");

		//System.out.println(a.substring(0,10)); //��13λ��ʱ�����ȡλǰ10λ
		String b = (a.substring(0,10));
		//System.out.println(b);  //��ȡ10λ��ʱ���
		int length = wengzhang.length();// ��ȡ���µĳ���
		String g = String.valueOf(length); //ǿ��ת��int ΪString
		z[i] = g;
				
		if(length >= 1000 || length < 100){
			System.out.println("�Ƿ�����");
			System.exit(0);
		}
		wengzahng = wengzhang;
		System.out.println("���" + name);
	    System.out.println("������³�Ϊ" + length + "��");
	    //System.out.println(wengzhang); 
	    System.out.println("��Ϊ��" + i + "λ����ɹ�����������ѡ��");
	    //System.out.println("��ǰ������Ϣ����Ϊ��" + b + "" + length + "" + "0000" + i);//������Ϣ����
	    String bianma;
	    bianma = ("��ǰ������Ϣ����Ϊ��" + b + "" + length + "" + "0000" + i);
	    //System.out.println(bianma);//������Ϣ����
	    System.out.println();
	  
		}
		
		 for (int i = 1; i < n; i++) {
			 System.out.println("��" + (i) +  "λ���ύʱ���Ϊ" + s[i]);
			 System.out.println("�����ύ����˳�����У����絽��Ϊ" + i +"��ѡ��");
			 //ȡ��ÿһ���������µ���Ϣ����			  
		}
		
		 for (int i = 1; i < n; i++) {
			
			 
//			 long lon = Long.parseLong(z[i]); 	//string������תΪlong
//			 int lon2=new Long(lon).intValue(); //longתΪ int��lon2
//			 
//			 int[] nums = {lon2};//����
//			 int t;
//			 for (int j = 0; j < nums.length - 1 ; j++) {
//				for (int j2 = 0; j2 < nums.length - j - 1; j2++) {
//					if(nums[j2] < nums[j2 + 1]){
//						t = nums[j2];
//						nums[j2] = nums[j2 + 1];
//						nums[j2 + 1] = t;
//					}	
//				}
//			}
			
			 for (int f = 1; i < n; i++) {
				 System.out.println("��" + i + "����������Ϊ" + z[i]);
				 	}
//			 System.out.println("�����");
//				for (int k = 0; k < z.length; k++) {
//					System.out.println(z[i] + "\t");
//				}
			//ȡ��ÿһ���������µ�����
			 
		}
		 System.out.println("�����������Ķ��ٽ��д��ٵ�������");
		 System.out.println("��������Ϊ");
		 
		 
	}

}
