import java.util.Scanner;//����ɨ����

public class zuoye4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// runyear = year % 4 == 0 && year % 100 ! = 0 || year % 400 ==0 (�����жϷ�ʽ)
		// TODO Auto-generated method stub
		//��������� ���� ����
		
		
		int year = 0;  //��ֵ��һ�������ܵ�ֵ�������Ժ��ж�
		int month = 0;
		int dayil = 0;
		int tian;
		int day;
		int day2;
		int a;
		
		//���������ռ�ɨ��������� 
		System.out.println("���");
		 year = input.nextInt();
		 System.out.println("�·�");
		 month = input.nextInt();
		 if(month > 12){
			 System.out.println("�Ƿ�����!");
			 return	;
			 }
		 System.out.println("����");
		 day = input.nextInt();
		

		 		// �����·ݼ��㵱��������2��Ĭ��28
		 //switc���ж������õ�
		 switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayil = 31;
			if(day>dayil){
				System.err.println("�Ƿ����룡");
				System.exit(0);
			}
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			dayil = 30;
			if(day>dayil){
				System.err.println("�Ƿ����룡");
				System.exit(0);
			}
			break;
		case 2:
			dayil = 28;
			if(day>dayil){
				System.err.println("�Ƿ����룡");
				System.exit(0);
			}
			break;
		default:
			
			System.exit(0);
			
		}
		 
		//����������������꣬�·���ʹ+1
		 boolean runyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		 if(runyear){
			 if(month == 2){
			 dayil++;
			 }
			 System.out.println("����Ϊ����");

//			 if(month!= 1 && month != 2 ){
//			 day++;
//			 }
		 }		 
		 System.out.println("���ѯ������Ϊ" + year + "��" + month + "��" + day + "��");
		 System.out.println("������" + dayil + "��");
		//���ļ��������������˱Ƚϱ���ֻ����ôд��T-T
		 if(month == 1){
			 System.out.println("���ѯ������Ϊ����ĵ�"+  day + "��");
		 }
		 else if(month == 2){
			 day = day +31;
		 System.out.println("���ѯ������Ϊ����ĵ�"+  day + "��");
		 }
		 else if(month == 3){
			 if(runyear = year % 4 == 0 && year % 100 != 0 || year % 400 ==0);
			 {
				 a = 1;
				day2 = day + 60;
			 }
			 if(! runyear){
				 a = 2;
				 day = day + 59;
			 }
			 if(a == 1){
				 System.err.println("���ѯ������Ϊ����ĵ�"+ day2+  "��");
			 }else if(a == 2){
				 System.err.println("���ѯ������Ϊ����ĵ�"+ day+  "��");
			 }
		 }
			 
		 else if(month ==4){
			 if(runyear){
				 day =day +91;
			 }else{
			 day = day +90;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day+ "��");
		 }
		 else if(month == 5){
			 if(runyear){
				 day =day +121;
			 }else{
			 day = day +120;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+  day + "��");
		 }
		 else if(month == 6){
			 if(runyear){
				 day =day +152;
			 }else{
			 day = day +151;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+  day+ "��");
		 }
		 else if(month == 7){
			 if(runyear){
				 day =day +182;
			 }else{
			 day = day +181;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day+ "��");
		 }
		 else if(month == 8){
			 if(runyear){
				 day =day +213;
			 }else{
			 day = day +212;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day +  "��");
		 }
		 else if(month == 9){
			 if(runyear){
				 day =day +244;
			 }else{
			 day = day +243;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day + "��");
		 }
		 else if(month == 10){
			 if(runyear){
				 day =day +274;
			 }else{
			 day = day +273;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day+ "��");
		 }
		 else if(month == 11){
			 if(runyear){
				 day =day +304;
			 }else{
			 day = day +303;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+ day+  "��");
		 }
		 else if(month == 12){
			 if(runyear){
				 day =day +334;
			 }else{
			 day = day +333;
			 }
			 System.out.println("���ѯ������Ϊ����ĵ�"+  day+ "��");
			 System.exit(0);
		 }
	}
	
}
