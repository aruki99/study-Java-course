import java.util.Scanner;

public class 猜拳 {
	
	//数组的删除与增加
	static String[] name = {"a","b","c","d","e","f","g"};
	static long[] shu = {213,2131,123,123,123,123,432};
	static String name2;
	static int s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入 a~g的字母");
		Scanner input = new Scanner(System.in);
		name2 = input.next();
		
		
		for (int i = 0; i < name.length; i++) {
			if(name2.equals((name)[i])){
				s = i;
				shu[s] = 0;
				for (int j = 0; j < shu.length; j++) {
					System.out.print(shu[j] + "\t");
				}
				
				System.out.print("");
				System.err.println("当前为第" + (i+1) + "位字母");
				
			}else if(name2==((name)[i])){
				System.err.println("非法输入");
				System.exit(0);
			}
		}
		shu[s] = shu[s] + 999;
		System.err.println(shu[s]);
		for (int j = 0; j < shu.length; j++) {
			System.out.print(shu[j] + "\t");
		}
	}

}
