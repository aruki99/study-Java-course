
public class shu {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//	�����ں�̨��������ϰ�����
//		1��	Ͷ��������
//		2��	Ͷ�����µ��ı�
//		3��	Ͷ��ʱ�䣨unixʱ�����
//		4��	�����Ψһ��Ӧ��һ����Ϣ����
		
//		��Ϣ���� �� һ�� �������ı����ȣ��Լ�Ͷ��ʱ�����Ϣ������Ϊ18��ʮ�������֡�
//		1��	����ǰ10λ�����Ͷ��ʱ�䣨unixʱ�����
//		2��	���ֵĵ�11λ����13λ����Ǹ��ӵ��ı�����
//		3��	����λ������ǰ���Ͷ���˵�������Ϣ
		System.out.println("����������в��ԣ�");
		long s[] = { 	157235386199912548l,
						157235395415754878l,
						157235251198755562l,
						154081651154811456l,
						153286771135481648l,
						156362611125480185l,
						159524851164054810l,
						155308531154018015l,
						154379371148679498l,
						154381201115687401l,};
		long zishu[] = {
							999,
							157,
							987,
							548,
							354,
							254,
							640,
							540,
							486,
							156,
			
		};
		long shijian[] = {
							1572353861,
							1572353954,
							1572352511,
							1540816511,
							1532867711,
							1563626111,
							1595248511,
							1553085311,
							1543793711,
							1543812011,
		};
		long t;
		 for (int j = 0; j < s.length - 1 ; j++) {
			for (int j2 = 0; j2 < s.length - j - 1; j2++) {
				if(shijian[j2] > shijian[j2 + 1]){
					t = shijian[j2];
					shijian[j2] = shijian[j2 + 1];
					shijian[j2 + 1] = t;
				}	// ����ʱ������
				long y;
				for (int i = shijian.length; i < shijian.length / 2; i--) 
					for (int i2 = shijian.length; i2 < shijian.length - i2 -1; i2--) {
						if(shijian[i2] < shijian[i2 + 1]){
							y = shijian[i2 + 1];
							shijian[i2] = shijian[i2 + 1];
							shijian[i2] = y;
					}
				}
			}
		 }
			System.out.println("��������ʱ�䣬���絽��");
			for (int k = 0; k < shijian.length; k++) {
				System.out.println(shijian[k] + "\t");
			}
			long y;
			 for (int j = 0; j < s.length - 1 ; j++) {
				for (int j2 = 0; j2 < s.length - j - 1; j2++) {
					if(zishu[j2] < zishu[j2 + 1]){
						y = zishu[j2];
						zishu[j2] = zishu[j2 + 1];
						zishu[j2 + 1] = y;
					}	 // ���Գ�������
				}
				long x;
				for (int i = shijian.length ; i < shijian.length / 2; i--) {
					for (int i2 = shijian.length ; i2 < shijian.length - i2 -1; i2--) {
						if(zishu[i2] < zishu[i2 + 1]){
							x = zishu[i2 + 1];
							zishu[i2 + 1] = zishu[i2];
							zishu[i2] = x;
						}
					}
					
				}
			}
				System.out.println("����������³��ȣ��ӳ���������");
				for (int k = 0; k < zishu.length; k++) {
					System.out.print(zishu[k] + "\t");
		}
				
	

			
				 // ����һ�����Զ�ʱ���������ķ���
				
				  // ����һ�����Զ����³��Ƚ�������ķ���
	}
}


