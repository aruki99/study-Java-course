
public class shuanxunhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//双循环
		//行，列，双循环
		char a = 'A';
		char e = 'E';
		for (int i = 0; i < 4; i++) {  //外层循环控制行数 i < 5 = 打印5行
			for (int j = 0; j <= 2 - i; j++) {	//内层循环控制列
				System.out.print(" ");
			}
		//打印完后，再打印*号
			for (int j = 0; j <= 2 * i; j++) {
			System.out.print((char)(a + i));
						
			}
		System.out.println();
			}
		
		
		//下半部分
		for (int i = 0; i < 3; i++) {  //外层循环控制行数 i < 5 = 打印5行
			for (int j = 0; j <= i; j++) {	//内层循环控制列
				System.out.print(" ");
			}
		//打印完后，再打印*号
			for (int j = 0; j <= 4 - 2 * i; j++) {
			
			
			System.out.print((char)(e + i));
			}
			System.out.println();
		}
	}
}
		


