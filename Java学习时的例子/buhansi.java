
public class buhansi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��1 ��200֮�䲻������4����Ȼ���ĸ���
		int count = 0;
		for (int i = 1; i < 501; i++) {
			int a = i % 10;	//��λ
			int b = i / 10 % 10;  //ʮλ
			int c = i /100;  //��λ
			if(a == 4 || b == 4 || c == 4){
				continue;
			}
			count++;
					}
		System.out.print("��ô��1��500�䲻������4����Ȼ����" + count + "��");

	}

}
