
import java.util.Date;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class text5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] yesheng = {"���","�ݼ�","������","����","��"};//��ѡ
		int newCOUNT = yesheng.length;
		String[] nnname = {"��ʩ","����","���Ѿ�","������","��һһ","","","","",""};
		String[] levelname = {"����","����","����","�ʹ���","�ʺ�"};
		int[] level = new int [10];
		int[] loves = new int [10];
		
		int nncount = 5;          //��ǰ��������
		int gameday = 1;
		
		for (int i = 0; i < nncount; i++) {
			loves[i] = 100;
		}
		JOptionPane.showMessageDialog(null, "����������?", "��ӭ������", 1, new ImageIcon("D:/����/images/title.jpg"));
		while(gameday <= 10){

			
			String menu ="1���ʵ���ּѡ��(����)\n";
			menu += "2�����Ƴ��ң��޸�״̬)\n";
			menu += "3�� �����乬!(ɾ��)\n";
			menu += "4�� �޵İ����أ�(����)\n";
			menu += "��ѡ��";
			Object objResult = JOptionPane.showInputDialog(null, menu, "��Ϸ���е���" + gameday + "��",
					0, new ImageIcon("D:/����/images/����.jpg"), new String[] {
							"1","2","3","4"},4);

			int choice =  Integer.parseInt(objResult.toString());
			switch (choice) {
			
			
			case 1:
				if(nncount == nnname.length){
					System.out.println("�ʵ۱��£����Ѿ�����Ϊ���ˣ�");
					break;
				}

				objResult = JOptionPane.showInputDialog(null, "��ѡ����Ů", "ѡ��",0 ,
						new ImageIcon("D:/����/images/ѡ��.jpg"), 
						yesheng, 
						null);
					if(objResult == null){
						break;
					}
					JOptionPane.showMessageDialog(null, objResult , "ѡ�������" ,0, new ImageIcon("D:/����/images/"+ yesheng +".jpg"));
				nnname[nncount] = yesheng.toString();
				
				loves[nncount++] = 100;
				
				for (int i = 0; i < nncount; i++) {
					loves[i] -= 10;
				}
				break;
			case 2:

				
				objResult = JOptionPane.showInputDialog(null, "������ѡ��", "����", 0,
						new ImageIcon("D:/����/images/ѡ������.jpg"), nnname, null);
					if(objResult == null){
						break;
					}
					String name = objResult.toString();
				int s = -1;
				for (int i = 0; i < nncount; i++) {
					if(name.compareTo(nnname[i]) == 0){   //������ȵ����
						s = i;
						break;	
					}
				}
				if(s == -1){
					System.out.println("���²�Ҫ�������У�");
					break;
				}
				loves[s] += 20;
				if(s == levelname.length - 1){
					System.out.println(nnname[s] + "����ʧ��");
					loves[s] += 10;
					//break;
					
				}else{
					level[s] ++;
					for (int i = 0; i < nncount; i++) {
						if(i == s){
							continue;
						}
						loves[i] -= 10;
					}
					System.out.println("����" + nnname[s] + "�øж� + 10,����Ϊ" +levelname[level[s]] +  "����������øж� - 10");
					JOptionPane.showMessageDialog(null,"����" + nnname[s] + "�øж� + 10,����Ϊ" +levelname[level[s]] +  "����������øж� - 10" , 
							"���ƽ��", 0, new ImageIcon("D:/����/images/" +  nnname[s] + ".jpg"));
				}
				
				break;
			case 3:
				JOptionPane.showInputDialog(null, "�㲻��˭�ˣ�", "�����乬",
						0, new ImageIcon("D:/����/images/�����乬.jpg"), nnname, 4);
				String name2 = objResult.toString();
				int index = -1;
				for (int i = 0; i < nncount; i++) {
				//if(name2.equals(nnname[i])){
					/*
					 * ��tm��Ϊʲôif�����У���
					 * ���ǰ�������ĸ���������
					 * û����
					 * �ص�
					 */
						index = i;
						break;
					//}
				}
				System.err.println(index);
				if(index == -1){	//Ϊ�ҵ�Ҫɾ��������
					System.out.println("\n�龪һ����û�£��óԳԺȺȣ�������\n\n");
					break;
				}
				//ִ��ɾ������
					for (int i = index; i < nncount - 1; i++) {
						System.err.println(i);
						nnname[i] = nnname[i + 1];
						level[i] = level[i + 1];
						loves[i] = loves[i + 1];							
					}
					nncount--;	//������ -1
					index -= 1;	//�������꣬����Ϊ��ʼֵ�������´�ʹ��
					
					JOptionPane.showMessageDialog(null, "�ѱ������乬 ��������ů����������øж�+10\n\n","~�乬~", 0,new ImageIcon("D:/����/images/�ɹ������乬.jpg"));
					//System.out.printf("\n%s�ѱ������乬 ��������ů����������øж�+10\n\n",nnname,level,loves);
						for (int i = 0; i < nncount; i++) {
							loves[i] += 10;									
						}
						index = - 1;
				break;
			case 4:
				JOptionPane.showInputDialog(null, "�޵İ����أ�", "����",
						0, new ImageIcon("D:/����/images/�޵İ�����.jpg"), nnname,4);
//				if(objResult == null){
//					break;
//				}
				String name3 = objResult.toString();
				int s3 = -1;
				for (int i = 0; i < nncount; i++) {
					//if(name3.compareTo(nnname[i]) == 0){ 
						s3 = i;
						loves[s3] +=20;//������ȵ����
						
						break;	
				//	}
				}
				default:
			}

			//����������ϵ������øжȵ��� 60������
			int count = 0;
			for (int i = 0; i < nncount; i++) {
				if(loves[i] < 60){
					count++;
				}
			}
			String rvalue = "�����������ϵ������øжȵ��� 60,��������";
			rvalue += new Date().toLocaleString();
			if(count >= 3){
				JOptionPane.showMessageDialog(null, "�����������ϵ������øжȵ��� 60,��������", "boom��", 0,new ImageIcon("D:/����/images/���ϱ���.jpg"));
				System.exit(0);
			}
			String value = "û��û���ļ��������š�����������\n";
			
			for (int i = 0; i < nncount; i++) {
				value += String.format("%s	%s	%d\n", nnname[i],levelname[level[i]],loves[i]);
			}	
			JOptionPane.showMessageDialog(null, value, "ÿ�ս���", 0,new ImageIcon("D:/����/images/��Ϸ.jpg"));
			gameday++;
		}
		
	}
}