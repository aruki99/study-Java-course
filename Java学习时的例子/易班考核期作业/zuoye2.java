import java.util.Arrays;
import java.util.Scanner;//����ɨ����


public class zuoye2 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("����������Ҫ�Ƚϴ�С����������");
		int a ;
		a = (int) input.nextFloat();//��������
		int b;
		b = (int) input.nextFloat();//��������
		int c;
		c = (int) input.nextFloat();//��������
		//�òݸ�ֽ�г����˺ö�������ģ�����ֻ�ʺϱȽ�����Ŀ����Ŀ��
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

		System.out.println("Ҫ����Ҫ��������С�������з���abc");
		
		String chars[] = sort.split("<");
		System.out.println(Arrays.toString(chars));
		for(int i = 0; i<3; i++){
			String get = chars[i];
			System.out.println(get.getClass().toString());
			if(get != "a"){
				System.out.print("����aΪ"+a);
			}
			if(get == "b"){
				System.out.print("����bΪ"+b);
			}
			if(get == "c"){
				System.out.print("����cΪ"+c);
			}
		}

//		System.out.println("����aΪ" + a + "." +"����bΪ"  + b + "." + "����cΪ" + c);
	}
}
