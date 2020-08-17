import java.util.Calendar;

public class calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	//	System.out.println(cal.getClass().getSuperclass());
		//使用日历打印当前时间
		int year 	= cal.get(Calendar.YEAR);
		int month 	= cal.get(Calendar.MONTH) + 1;
		int day 	= cal.get(Calendar.DATE);
		int hour 	= cal.get(Calendar.HOUR);
		int minute 	= cal.get(Calendar.MINUTE);
		int second 	= cal.get(Calendar.SECOND);
		int millsecond = cal.get(Calendar.MILLISECOND);
		System.out.println("当前时间");
		String strtime = String.format("%d——%02d——%02d日 %d:%d.%d.%ss",  //拼接字符串		
																		//%02d 设置为两个宽度 所以即使为2月，也会显示为02月
				year, month, day, hour, minute, second, millsecond);
		System.out.println(strtime);
	}

}
