import java.util.Scanner;

public class qian{
    private static int menoy;

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("璇疯緭鍏ュ皬閽遍挶鐨勬暟閲�:");
        double money = input .nextDouble();
		//澶勭悊鍥惧儚
        int yuan = menoy;
        int numOfshiyuan = yuan / 10;    //鍗佸厓绾稿竵鐨勬暟閲�
        int numOfwuyuan = yuan % 10 / 5;  //浜斿厓绾稿竵鏁伴噺
        int numOfyiyuan = yuan % 10 - 5;  //涓�鍏冪焊甯佺殑鏁伴噺
        //澶勭悊瑙掗儴鍒�
        int jiao = ((int)(money * 10)) % 10;
        int numOfwujiao = jiao / 5;   //浜旇绾稿竵鏁伴噺
        int numOfyijiao = jiao - 5;  //涓�瑙掔焊甯佹暟閲�

        System.out.println("10鍏冪焊甯佺殑鏁伴噺锛�" + numOfshiyuan);
        System.out.println("5鍏冪焊甯佺殑鏁伴噺锛�" + numOfwuyuan);
        System.out.println("1鍏冪焊甯佺殑鏁伴噺锛�" + numOfyiyuan);

    }
}