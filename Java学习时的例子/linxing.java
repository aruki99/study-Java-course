
public class linxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {  //���ѭ���������� i < 5 = ��ӡ5��
			for (int j = 0; j <= 2 - i; j++) {	//�ڲ�ѭ��������
				System.out.print(" ");
			}
		//��ӡ����ٴ�ӡ*��
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i)	//j�����ֵ����Сֵ��ʱ���ӡ*��
			System.out.print("*");
				System.out.print(" ");
			}
		System.out.println();
			}
		for (int i = 0; i < 3; i++) {  //���ѭ���������� i < 5 = ��ӡ5��
			for (int j = 0; j <=  i; j++) {	//�ڲ�ѭ��������
				System.out.print(" ");
			}
		//��ӡ����ٴ�ӡ*��
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i)	//j�����ֵ����Сֵ��ʱ���ӡ*��
			System.out.print("*");
				System.out.print(" ");
			}
		System.out.println();
	}

}
}
