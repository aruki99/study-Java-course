import java.sql.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class unix {
public static void main(String[] args) throws ParseException {
/**
* ����DateFormat�����Ĺ̶���ʽ
* */
DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
/**
* ��ȡ����ת��ΪUnixʱ���
*/
long epoch = df.parse("2019-09-09 0:0:0").getTime();
System.out.println(epoch);
//1420777414000

/**
* ����Unixʱ����õ�ʱ��
* */
Date d = new Date(epoch);
/**
* ת��Ϊ����
*/
String t = df.format(d);
System.out.println(t + " " + epoch);
}
}