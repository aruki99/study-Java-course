
import java.applet.Applet;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//public class text4 {
//
//	public static void main(String[] args) {
		public class text4{
			public static void main(String[] args)throws MalformedURLException,InterruptedException{
				Scanner input = new Scanner(System.in);
				
				int count = 5; 			//��ŵ�ǰ��������
				int currday = 0;		//��Ϸ��ǰ����
				final int day_count = 10;	//��Ϸһ��
				int choice;				//��������û���ѡ��
				int tempcount = 0;			//��ʱ������������źøжȵ���60�ĸ���
				int index = -1;			//�������ɾ��������ʱ������
				String name;			//��������û������������
				
				//�������飬�������6���ַ�����ÿ���ַ�������󳤶�λ8 ���ַ� ��Ӣ�ģ�
				String[] names = {"��ʩ","����","���Ѿ�","����","�Է���",""} ;
				//�������飬�������5���ַ�����ÿ���ַ�������󳤶�λ8���ַ���Ӣ�ģ�
				String[] levelnames = {"����","����","����","�ʹ���","�ʺ�",""};
				//�������ÿ�����ӵĵǼǣ���levelnames���ã� -1 ��ʾδ����
				int level[] = {0,2,0,0,0,-1};
				//�������ÿ�����ӵĺøжȣ�-1��ʾδ����
				int loves[] = {100,100,100,100,100,-1};
				JOptionPane.showMessageDialog(null, "����������?", "��ӭ������", 1, new ImageIcon("D:/����/images/title.jpg"));
				

				do{
					System.out.printf("��%d��\n", ++currday);
					System.out.printf("1���ʵ���ּѡ��\t(����)\n");
					Thread.sleep(500);
					System.out.printf("2�����Ƴ���\t���޸�״̬��\n");
					Thread.sleep(500);
					System.out.printf("3�� �����乬!\t(ɾ��)\n");
					Thread.sleep(500);
					System.out.printf("4�� �޵İ����أ�\t(����)\n");
					Thread.sleep(500);
					System.out.printf("�����ѡ��");
					Object strMenu = null;
//					JOptionPane.showInputDialog(null, strMenu, "��Ϸ���е���" + currday + "��",
//							0, new ImageIcon("D:/����/images/����.jpg"), new String[] {
//									"1","2","3","4"},4);
					choice = input.nextInt();
					switch (choice) {
					case 1: //�������ӣ��������Ӻøж� - 10
						//�ж����鳤���Ƿ��������Ԫ��
						if(count > level.length){
							System.out.println("\n���Ѿ�����Ϊ���ˣ����»��ǵȵȰɣ�\n\n");
							break;
						}
						System.out.println("����ɽ�������ˣ���ǧ����һ��죡\n");
						System.out.println("�������䣺");
						name = input.next();
						//������Ԫ�ط���count��
						names[count] = name;
						level[count] = 0;
						loves[count] = 100;
						System.out.println("\n��������,�����˺øж� - 10\n\n");
						for (int i = 0; i < count; i++) {
							loves[i] -= 10;
						}
						count++;
						break;

					case 2:   	//���Ƴ��ң������ҵĺøж�+20�������øж� -10
						
						System.out.println("����������Ҫ���ҵ�������");
						name  = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								index = i;
								continue;
							}
							
							loves[i] -= 10; 
						}
						if(index == -1){  //û���ҵ�
							System.out.println("\n�����δͳһ���ܶ�Ů�鳤��\n\n");
						}
						else{
							loves[count] += 20;
							//ÿ�εĳ��Һ󣬼������һ�������Ϊ4���Ļʺ�
							if(level[index] == 4){
								level[index] = 4;
							}else{
									level[index]++;
								}
							System.out.printf("\n********************************\n");
							System.out.printf("duang~ %s�����ȼ�Ϊ��%s\n",names[index],levelnames[level[index]]);
							System.out.printf("\n********************************\n");
							System.out.printf("��������øж� -10\n\n");
							}
						index -= 1;
						break;
					case 3://�����乬��ִ��ɾ������
						System.out.println("Ҫ����λ��������乬?");
						name = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								index = i;
								break;
							}
						}
						if(index == -1){	//Ϊ�ҵ�Ҫɾ��������
							System.out.println("\n�龪һ����û�£��óԳԺȺȣ�������\n\n");
							break;
						}
						//ִ��ɾ������
							for (int i = index; i < count - 1; i++) {
								names[i] = names[i + 1];
								level[i] = level[i + 1];
								loves[i] = loves[i + 1];							
							}
							count--;	//������ -1
							index -= 1;	//�������꣬����Ϊ��ʼֵ�������´�ʹ��
							System.out.printf("\n%s�ѱ������乬 ��������ů����������øж�+10\n\n",name);
								for (int i = 0; i < count; i++) {
									loves[i] += 10;									
								}
								index = - 1;
						break;
					case 4:	//�����������ң��øж�+10
						System.out.println("������Ҫ���ҵ�������");
						name = input.next();
						for (int i = 0; i < count; i++) {
							if(name.equals(names[i])){
								System.out.printf("\n΢΢һЦ����ǣ�%s�ĺøж�+10 \n\n",name);
								loves[i] += 10;
								break;
							}
						}
						break;
					}//end of switch
					System.out.printf("����\t�ȼ�\t�øж�\n");
					System.out.println("--------------------------");
					for (int i = 0; i < count; i++) {
						System.out.printf("%s\t%s\t%d\n",names[i],levelnames[level[i]],loves[i]);
					}
					//ÿ�����øжȣ�һ����һ�����������������øжȵ���60�����������ң��ʵ�������Ϸ����
					tempcount = 0;
					for (int i = 0; i < count; i++) {
						if(loves[i] < 60)
							tempcount++;
					}
					if(tempcount >= 3){
						System.out.printf("���ѵ������ǣ��ߣ����ˢ����ȥl !\n");
						//ʱ�亯���Ĺ̶��÷�
						Calendar cal = Calendar.getInstance();
						System.out.printf("��Ԫ%d��%d��%d��%d���ʵ�⧣� ��ִ��%d��\n",
								cal.get(Calendar.YEAR),
								cal.get(Calendar.MONTH) + 1,
								cal.get(Calendar.DATE),
								currday
								);
						System.exit(0);
					}
				}while(currday < day_count);
				

				System.out.printf("�ʵ۵ǻ�10�����������˳����檳�Ⱥ����ȷ�ǡ���������������\n");
				System.out.printf("û��û���ļ��������š�����������\n");
				System.out.printf("����\t�ȼ�\t�øж�\n");
				System.out.printf("��������������������������������������������������������\n");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%s\t%d\n", names[i] ,levelnames[i],loves[i]);
				}
			
	}
}