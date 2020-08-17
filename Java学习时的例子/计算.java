import java.util.Collections;

public class 计算 {
	public static void main(String[] args) {
		int a = 100;
		long startime =  System.currentTimeMillis();
		String s = "*";
		for (int i = 0; i < a; i++) {
			s =  s + "*";

		}
		long endtime = System.currentTimeMillis();
		System.out.println("用时" + (endtime - startime) + "毫秒");
		
		//使用Stringbuffer进行字符串拼接
		startime = System.currentTimeMillis();
		
		StringBuffer s1 = new StringBuffer("*");
		for (int i = 0; i < a; i++) {
			s1.append ("*");
		}
		
		endtime = System.currentTimeMillis();
		System.out.println("stringbuffer的append用时" + (endtime - startime) + "毫秒");

		
		
		//使用stringbuilder
		startime = System.currentTimeMillis();
		
		StringBuilder s2 = new StringBuilder("*");
		for (int i = 0; i < a; i++) {
			s2.append ("*");
		}
		
		endtime = System.currentTimeMillis();
		System.out.println("stringbuilder的append用时" + (endtime - startime) + "毫秒");

		
		//尝试
		StringBuffer b = new StringBuffer("1-1");
		for (int i = 0; i < 3; i++) {
			b.append("2-243"); //追加元素
			b.append("追加元素");  //追加元素
		}
		System.out.println(b);
		System.err.println(b.reverse());         //反转字符
		System.out.println();
		
		b.insert(9, "   哈哈哈       ");             //再 字符串 吧 中的第9位后 插入 哈哈哈
		System.out.println(b);					//可插入数值 列如 2L(long) 3F(float) 4D(double)
		
		b.deleteCharAt(3);						//删除第3号元素
		System.out.println(b);
		
		b.delete(2, 4);							//删除第2 到 3好元素 = [2,4)
		System.out.println(b);
		
		
		b.replace(3, 9, "北京欢迎你!!");  		//从b中的第3号到第9号 被替换成 北京欢迎你！
		System.out.println(b);
		System.out.println("缓存大小" + b.capacity());
		
		b.setLength(20);						//限定b的长度只有20位
		System.out.println(b);					//若为0，则为清空字符串
		System.out.println("缓存大小" + b.capacity());

	}
}
