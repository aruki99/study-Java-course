import java.util.Calendar;

public class calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	//	System.out.println(cal.getClass().getSuperclass());
		//ʹ��������ӡ��ǰʱ��
		int year 	= cal.get(Calendar.YEAR);
		int month 	= cal.get(Calendar.MONTH) + 1;
		int day 	= cal.get(Calendar.DATE);
		int hour 	= cal.get(Calendar.HOUR);
		int minute 	= cal.get(Calendar.MINUTE);
		int second 	= cal.get(Calendar.SECOND);
		int millsecond = cal.get(Calendar.MILLISECOND);
		System.out.println("��ǰʱ��");
		String strtime = String.format("%d����%02d����%02d�� %d:%d.%d.%ss",  //ƴ���ַ���		
																		//%02d ����Ϊ������� ���Լ�ʹΪ2�£�Ҳ����ʾΪ02��
				year, month, day, hour, minute, second, millsecond);
		System.out.println(strtime);
	}

}
