
public class hanhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanhua("�˸磺","������" , "�л�����ô��������", 10, 1);
	}
	//ʵ����Ϸ�еĺ�������
	//name ����������
	//channe1name ����Ƶ������
	//neiyong ��������
	//cishu ��������
	//jiangge ����ʱ����  ��λ s
	public static void hanhua(String name, String channe1name , String leirong , int cishu ,  int jiange ){
		if(jiange < 5) jiange = 5; //ǿ��ʱ��������Ϊ5�������
		//�����߼���ƴ���ַ�������ӡ
		String value = String.format("��%s�� %S %S ",
				channe1name , name , leirong);
		
		for (int i = 0; i < cishu; i++) {
			System.out.println(value + "Ԫ��-10");
			
			try {
				Thread.sleep(jiange * 1000);  //���߶�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

