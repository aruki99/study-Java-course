import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class text6 {
	private static Scanner input;
	static int s = 5 ;
	//����������ţ������������س�����˿�����������ܵ� ���飬������������λ������������������λ
	//1��������Ҫ������
	//�� ��������÷�Χ��Ϊ���
	static String bianhao[] = {"1","2","3","4","5","",};
	static String zhubos[] = {"����A" , "����B" , "����C" , "����D" , "����E" , "" , };
	static String techang[] = {"����","����","����Ϸ","��","д��ҵ","",};
	static String fengsis[] = {"4362" , "23432" , "987" , "5464" , "99999","",};
	static long fengsis2[] = {4362 , 23432 ,987 , 5464 , 99999};
	static String jieshao[] = {"��","��","rap","����","music","",};
	//�����¶�����ַ������� Ӧȥ��������
	static String xinbianhao;
	static String xinzhubo = null;
	static String xintechang;
	static String xinfengsi;
	static String xinjieshao;
	public static void main(String[] args) throws IOException, InterruptedException {
			
		System.out.println("��ӭ��������ֱ����ϵͳ��");		
		for (int n = 1; n < 999; n++) {
		input = new Scanner(System.in);
		int z;
		if(n > 2){
			System.out.println("1 ��������ֱ����     2 �뿪");
		}
		else if(n == 1){
				System.out.println("1 ����     2 �뿪");
		}
		z = (int) input.nextFloat();
			if(z == 1){
			
		//2�˳�����
		System.out.println("�����б�:");
		System.out.println("1 ������Ϣ�鿴:");
		System.out.println("2 ��˿��������:");
		System.out.println("3 ����������Ϣ:");
		System.out.println("4 ��������Ȧ��:");
		System.out.println("5 ��������:");
		System.out.println("6 �˳�����:");
			
		//SWITCH ���������˵�ѡ��	
		input = new Scanner(System.in);
		int a;
		a = (int) input.nextFloat();
		switch (a) {
		
		case 1:
			zhuboxinxi();
			break;
		case 2:
			fengshipailie();
			break;
		case 3:
			xingzhubo();
			break;
		case 4:
			quanfeng();
			break;
		case 5:
			lahei();
			break;
		case 6:
			tuichu();
			break;
		}
		}else if(z == 2){
				System.exit(0);
			}else{
				System.err.println("�Ƿ�����");
			}
			n++;
		}
		}


	/*
	 * �·�Ϊ����ķ���
	 * ÿ�����ܵ����ó��������˷�װ
	 */
	
	private static void zhuboxinxi() {
		// TODO Auto-generated method stub
		//����������Ϣ
		System.out.println("\t\t��������Ϣ��\t");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +  "���\t" + "������\t" + "�س�\t" + "��˿��\t" + "����"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +"1\t" + "����A\t" + "����\t" + "4362\t" + "��"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +"2\t" + "����B\t" + "����\t" + "23432\t" + "��"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +"3\t" + "����C\t" + "����Ϸ\t" + "987\t" + "rap"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +"4\t" + "����D\t" + "��\t" + "5464\t" + "����"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		System.out.println("|" +"5\t" + "����E\t" + "д��ҵ\t" + "99999\t" + "music"+"\t|");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
		return;
	}
		
	private static void fengshipailie(){
		long t;
		 for (int j = 0; j < fengsis2.length - 1 ; j++) {
			for (int j2 = 0; j2 < fengsis2.length - j - 1; j2++) {
				if(fengsis2[j2] < fengsis2[j2 + 1]){
					t = fengsis2[j2];
					fengsis2[j2] = fengsis2[j2 + 1];
					fengsis2[j2 + 1] = t;
				}	// ����ʱ������
				long y;
				for (int i = fengsis2.length; i < fengsis2.length / 2; i--) {
					for (int i2 = fengsis2.length; i2 < fengsis2.length - i -1; i2--) {
						if(fengsis2[i2] < fengsis2[i2 + 1]){
							y = fengsis2[i2 + 1];
							fengsis2[i2 + 1] = fengsis2[i2];
							fengsis2[i2] = y;
						}
					}
				}
			}	
		}
		 //��for�׳�fengsi2 ����
		 System.out.println("\t\t������˿����\t");
			System.out.println("---------------------------------------->  ");
		 System.out.println("����E\t����B\t����D\t����A\t����C");
			for (int k = 0; k < fengsis2.length; k++) {
				System.out.print(fengsis2[k] + "\t");
			}
			 System.out.println("\nд��ҵ\t����\t��\t����\t����Ϸ");
			 System.out.println("music\t��\t����\t��\trap");
			 System.out.println("---------------------------------------->  ");
			System.out.println();
			return;
	}
	
	
	private static void xingzhubo(){
		System.out.println("��������Ҫ��ѯ�����ı��");
		int b;
		b = (int) input.nextFloat();//��������
		if(b == 0 || b > bianhao.length || b == 6){
			System.err.println("�����������ڣ�");
			return;
		}
		//��ʾ����ѯ��������Ϣ
		System.out.println("��������ϢΪ");
		System.out.print("�������" + "\t\t" +  bianhao[b-1] + "\t");
		System.out.print(zhubos[b-1] + "\t");
		System.out.print(zhubos[b-1] + "\t");
		System.out.print(techang[b-1]+ "\t");
		System.out.print(fengsis[b-1]+ "\t");
		System.out.print(jieshao[b-1]+ "\t");
		System.out.println();
		System.out.println("����Ϊ����������������");
		System.out.println("1 ��   2 ��");
		//ѯ���Ƿ����������
		int c;
		c = (int) input.nextFloat();//��������
		if(c == 1){
			//�����µ�������Ϣ
			System.out.println();
			System.out.println("��������������\t���\t����\t�س�\t��˿��\t����");
			System.out.println("������ű���Ϊ��ǰ������+1����ǰ������Ϊ" + (bianhao.length - 1));
			
			xinbianhao = input.next();
			bianhao[s] = xinbianhao;
			//�ж�����������Ƿ��������߼�����
			long lon = Long.parseLong(bianhao[s]);
			if(lon <= (bianhao.length-1)){
				System.err.println("�Ƿ�����");
				return;
			}
			
			xinzhubo = input.next();
			zhubos[s] = xinzhubo;
			
			xintechang = input.next();
			techang[s] = xintechang;
			

			xinfengsi = input.next();
			fengsis[s] = xinfengsi;
			
			xinjieshao = input.next();
			jieshao[s] = xinjieshao;
			
			System.out.println("��ϲ����������");
			System.out.println("���Ϊ" + bianhao[s] +"\t\t" + "����Ϊ"+ zhubos[s] +"\t\t" + 
			"ӵ���س�Ϊ" + techang[s] + "\t" + "��˿��Ϊ" + fengsis[s]+"\t" +  "�������ܣ�" +jieshao[s]);
			System.out.println();
			System.out.println();
		}
		if(c == 2){
			System.out.println("�ǾͲ�����������ɣ�");
			
		}
		else if(c > 2){
			System.err.println("�Ƿ����룡");
			return;
		}
		for (int i = 0; i < bianhao.length; i++) {    //�����������Ƿ�¼��������
			System.out.print("Ŀǰӵ�е�������");
			System.out.print(bianhao[i]+"\t");
			System.out.print(zhubos[i]+"\t");
			System.out.print(techang[i]+"\t");
			System.out.print(fengsis[i]+"\t");
			System.out.println(jieshao[i]+"\t");
		}
		return;
	}
		private static void quanfeng(){
			//��������Ȧ��
			//��ѯ����  ��������
			System.out.println("��������鿴�������ı��");
			int d ;
			d = (int) input.nextFloat();//��������
			//�ж��Ƿ��������б���
			if(d >= bianhao.length){
				System.err.println("�Ƿ�����");
				return;
			}else {
			System.out.println("������ԭ�ȷ�˿��Ϊ" + fengsis[d - 1]);
			System.out.println();
			//��Ҫ�����������
			int suiji = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;    //���� 1000 - 9000
			System.out.println("ͨ���˴�ֱ�������ķ�˿��������" + suiji);
			long lon = Long.parseLong(fengsis[d - 1]);  
			System.out.println();
			System.out.println("����������λ������������Ϊ" +  (lon +  suiji));  
			}
			return;
		}
		private static void lahei(){
			//ɾ�������е�ĳһ��Ԫ��
			//������Ҫ��ɾ�������ı�ţ��±꣩
			System.out.println("���������ĸ�������������Ҳ������������ܿ�����ֱ������");
			System.out.println("�������������������ı��");
			int e ;
			e = (int) input.nextFloat();//��������
			
			if(e >= bianhao.length){
				System.err.println("�Ƿ�����");
			}else{
				System.out.println("�������ڵ����������Ϊ��" + bianhao[e-1]+"\t" + zhubos[e-1]+"\t"+ techang[e-1]+"\t" 
						+ fengsis[e-1]+"\t" + (jieshao[e-1]));
			System.out.println();
			System.out.println("��ȷ��Ҫ���ڸ�������");
			System.out.println("1 ��,2 ��");
				int f ;
				f = (int) input.nextFloat();//��������	
				if(f == 1){
				}else if(f == 2){
					System.out.println("�õģ���ȡ������");
					return;
				}
				else{
					System.err.println("�Ƿ�����");
					return;
				}
				//��Ϊjava�������޷�ɾ��Ԫ�أ�ֻ�����µ����������汻ɾ��������� 
				//��Ҫ����ɾ���������������һλԪ�أ��ٽ���ɾ��
				//e = (int) input.nextFloat();//��������  //û��
				if(e > 5){
					System.err.println("�Ƿ�����");
				}else{
				String h = bianhao[5];
				bianhao[5] = bianhao[e-1];
				bianhao[e-1] = h;
				
				//ĿǰΪɾ�����һ��Ԫ��
				int l = bianhao.length-2;          
				String[] p = new String[bianhao.length - 1];       //pΪ����������������
				for (int j = 0; j < p.length; j++) {
					//�ж�Ԫ���Ƿ�Խ��
					if(l < 0 || l > bianhao.length){
						throw new RuntimeException("Ԫ��Խ��... ");
					}
					if(j < l){
						p[j] = bianhao[j];
					}
					else{
						p[j] = bianhao[j];
					}
				}
				//System.out.println(Arrays.toString(bianhao));//ɾ��ǰ������
				bianhao = p;
				System.out.println("Ŀǰ�����������Ϊ" + Arrays.toString(bianhao));
				System.out.println(e + "�������ѱ�����" );
			}
			}
			return;
		}
		private static void tuichu(){
			//�˳�ϵͳ
			int g;
			System.out.println("�Ƿ��˳�ϵͳ");
			System.out.println("1 ��\t 2��");
			g = (int) input.nextFloat();//��������
			if (g ==1) {
				System.out.println("���ѳɹ��˳�ϵͳ��");
				System.exit(0);
			}else if(g == 2){
				System.out.println("��л��ѡ������ֱ���䣡");
				System.out.println("ף��������죡");
			}	else{
				System.err.println("�Ƿ�����");
			}
			
			return;
		}

}



				