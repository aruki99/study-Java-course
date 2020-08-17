import java.sql.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class unix {
public static void main(String[] args) throws ParseException {
/**
* 生成DateFormat类对象的固定格式
* */
DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
/**
* 获取日期转换为Unix时间戳
*/
long epoch = df.parse("2019-09-09 0:0:0").getTime();
System.out.println(epoch);
//1420777414000

/**
* 根据Unix时间戳得到时间
* */
Date d = new Date(epoch);
/**
* 转换为日期
*/
String t = df.format(d);
System.out.println(t + " " + epoch);
}
}