import java.util.Scanner;

//import java.util.Scanner;

public class choujiang {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//�û�Ҫ�µĴ���
		//�û���Ҫ���еĴ���
		int a = 0;	//�û��²����
		//int b = 5000;  //��Ʒ�۸�
		int b = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;    //���� 1000 - 9000
	

		System.out.println(b);   //͵����
		int c = -1;  //�û��²�ļ۸�
		String d = null; //��Ʒ����
		for (int i = 0; i < 5; i++) {
			System.out.println("����������Ϊ��ȷ�ļ۸�:" + ++a +  "��");
			c = new Scanner(System.in).nextInt();
			if(c == b){//�ڲ²���ȷ�������
				if(a == 1){
					System.out.println("ţ���ˣ�һ�ξͲ�����");
					d = "iphone 11 ";
					//System.out.println("��Ʒ:iphone 11");
					
				}else if(a >= 2 && a <= 3){
					System.out.println("������Ŷ��С����");
					d = "С���ֻ�4";
					//System.out.println("��Ʒ��С���ֻ�4");
				}else if(a >= 3 && a <= 4){
					System.out.println("��Ϊ���ѵĸ����С��Ʒ��");
					d = "32g U��";
					//System.err.println("��Ʒ��32G U��");
				}
				break;
				}else if(c < b){
					System.out.println("С��");
				}else if(c > b){
					System.out.println("����");
				}
			
		}if(null == d){
				System.out.println("�ܱ�Ǹ���������ù⣡�㻹�ǻؼ�ϴϴ˯�ɣ���������");
			}else if(null != d){
			System.out.println("��ϲ�㡣�н��ˣ�");
			System.out.println(d);
				}

			}
		}
		
		
	


