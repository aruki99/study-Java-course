
public class shuanxunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//˫ѭ��
		//�У��У�˫ѭ��
		char a = 'A';
		char e = 'E';
		for (int i = 0; i < 4; i++) {  //���ѭ���������� i < 5 = ��ӡ5��
			for (int j = 0; j <= 2 - i; j++) {	//�ڲ�ѭ��������
				System.out.print(" ");
			}
		//��ӡ����ٴ�ӡ*��
			for (int j = 0; j <= 2 * i; j++) {
			System.out.print((char)(a + i));
						
			}
		System.out.println();
			}
		
		
		//�°벿��
		for (int i = 0; i < 3; i++) {  //���ѭ���������� i < 5 = ��ӡ5��
			for (int j = 0; j <= i; j++) {	//�ڲ�ѭ��������
				System.out.print(" ");
			}
		//��ӡ����ٴ�ӡ*��
			for (int j = 0; j <= 4 - 2 * i; j++) {
			
			
			System.out.print((char)(e + i));
			}
			System.out.println();
		}
	}
}
		


