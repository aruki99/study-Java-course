import java.sql.Time;

public class ˫�� {

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
		int t = 0;
		int high = zishu.length;
		int left = 1;
		int right = high -1;
		do{
			for (int i = right; i >= left; i--) {
				if(zishu[i] < zishu[i - 1]){
					long x = zishu[i];
					zishu[i] = zishu[i -1];
					zishu[i - 1] = x;
					x = i;
				}
			}
			left = t + 1;
			for (int i = left; i < right + 1; i++) {
				if(zishu[i] < zishu[i - 1]){
					long x = zishu[i];
					zishu[i] = zishu[i - 1];
					zishu[i -1] = x;
					x = i;
				}
			}
			right = t - 1;
			}while(left <= right);{
				for (int i = 0; i < shijian.length; i++) {
					System.out.println(zishu[i] + "\t");
				}
			}
			
	}
}



	

