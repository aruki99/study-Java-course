
public class linxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {  //外层循环控制行数 i < 5 = 打印5行
			for (int j = 0; j <= 2 - i; j++) {	//内层循环控制列
				System.out.print(" ");
			}
		//打印完后，再打印*号
			for (int j = 0; j <= 2 * i; j++) {
				if(j == 0 || j == 2 * i)	//j是最大值与最小值的时候打印*号
			System.out.print("*");
				System.out.print(" ");
			}
		System.out.println();
			}
		for (int i = 0; i < 3; i++) {  //外层循环控制行数 i < 5 = 打印5行
			for (int j = 0; j <=  i; j++) {	//内层循环控制列
				System.out.print(" ");
			}
		//打印完后，再打印*号
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if(j == 0 || j == 4 - 2 * i)	//j是最大值与最小值的时候打印*号
			System.out.print("*");
				System.out.print(" ");
			}
		System.out.println();
	}

}
}
