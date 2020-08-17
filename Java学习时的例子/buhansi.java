
public class buhansi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求1 到200之间不含数字4的自然数的个数
		int count = 0;
		for (int i = 1; i < 501; i++) {
			int a = i % 10;	//个位
			int b = i / 10 % 10;  //十位
			int c = i /100;  //百位
			if(a == 4 || b == 4 || c == 4){
				continue;
			}
			count++;
					}
		System.out.print("那么再1到500间不含数字4的自然数有" + count + "个");

	}

}
