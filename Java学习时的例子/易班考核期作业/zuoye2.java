import java.util.Arrays;
import java.util.Scanner;//导入扫描仪


public class zuoye2 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("请输入你想要比较大小的三个数；");
		int a ;
		a = (int) input.nextFloat();//接收数字
		int b;
		b = (int) input.nextFloat();//接收数字
		int c;
		c = (int) input.nextFloat();//接收数字
		//用草稿纸列出来了好多种情况的，不过只适合比较少数目的题目，
		String sort = "";
		if(a < b && b < c ){
//			System.out.println("a<b<c");
			sort = "a<b<c";
		}
			else if(a < c && c < b){
				//System.out.println("a<c<b");
				sort = "a<c<b";
			}
			else if(b < a && a < c){
//				System.out.println("b<a<c");
				sort = "b<a<c";

			}
			else if(b < c && c < a){
//				System.out.println("b<c<a");
				sort = "b<c<a";

			}
			else if(c < a && a < b){
//				System.out.println("c<a<b");
				sort = "c<a<b";

			}
			else if(c < b && b < a){
//				System.out.println("c<b<a");
				sort = "c<b<a";

			}
			
		System.out.println(sort);

		System.out.println("要将需要将数字由小到大排列放入abc");
		
		String chars[] = sort.split("<");
		System.out.println(Arrays.toString(chars));
		for(int i = 0; i<3; i++){
			String get = chars[i];
			System.out.println(get.getClass().toString());
			if(get != "a"){
				System.out.print("所以a为"+a);
			}
			if(get == "b"){
				System.out.print("所以b为"+b);
			}
			if(get == "c"){
				System.out.print("所以c为"+c);
			}
		}

//		System.out.println("所以a为" + a + "." +"所以b为"  + b + "." + "所以c为" + c);
	}
}
