import java.util.Scanner;

//2015��˫ʮһ���Ľ��׶�Ϊ800�ڣ�ÿ������ٷ�֮25���ʰ����ٶ���һ��ﵽ2000�ڣ�

public class taobao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//ȷ��ѭ������
		int year = 2015;  //���
		double menoy = 800;   //���׶�
		while(menoy <= 2000){
			
			menoy = menoy * 1.25;
			year++;
		}
		System.out.println("��ÿ��25%���ٶ�����������" + year + "��ʱ��Ӫҵ��Ϊ2000��");
		
	}

}
