
public class paidui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//操场上有100多人排队，三人一组多一人，四人一组多两人，五人一组多3人 问 一共多少人？
		//一百多人== 100 - 199
//		for(int i = 100; i < 200; i++){
//			if(i % 3 == 1 && i % 4 == 2 && i % 5 == 3){
//				System.out.println("一共有" + i + "人");
//			}
		//甲乙丙丁一共加工370个零件，如果把甲的个数+10，乙的个数-20，丙的个数*2
		//丁的个数/2，那么私人做的个数一样多。 问甲一共做了多少个！
		//穷举法
		for (int j = 1; j < 370; j++) { // i  甲加工零件的数量
			for (int j2 = 1; j2 < 370; j2++) { //乙的数量
				for (int k = 1; k < 370; k++) { //丙的数量
					//丁的数量
					int d = 370 - j -j2- k;
					if(j + j2 + k + d == 370 && j + 10 == j2 - 20 && j2 - 20 == k * 2 && k * 2 == d / 2){
						System.out.printf("四人做的数量分别为：%-4d%-4d%-4d%-4d\n," ,j , j2 , k , d);
					}
					
				}
				
			}
		}
		
	}

}
