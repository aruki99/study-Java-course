import java.util.Scanner;//导入扫描仪


public class youji {
    public static class lzh {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
	private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("请输入你想要比较大小的三个数:");
        System.out.print("a:");
        int a ;
        a = (int) input.nextFloat();//接收数字
        System.out.print("b:");
        int b;
        b = (int) input.nextFloat();//接收数字
        System.out.print("c:");
        int c;
        c = (int) input.nextFloat();//接收数字
        //用草稿纸列出来了好多种情况的，不过只适合比较少数目的题目，
        String sort = "";
        if(a < b && b < c ){
//   System.out.println("a<b<c");
            sort = "a<b<c";
        }
        else if(a < c && c < b){
            //System.out.println("a<c<b");
            sort = "a<c<b";
        }
        else if(b < a && a < c){
//    System.out.println("b<a<c");
            sort = "b<a<c";

        }
        else if(b < c && c < a){
//    System.out.println("b<c<a");
            sort = "b<c<a";

        }
        else if(c < a && a < b){
//    System.out.println("c<a<b");
            sort = "c<a<b";

        }
        else if(c < b && b < a){
//    System.out.println("c<b<a");
            sort = "c<b<a";

        }

        System.out.println(sort);

        System.out.println("需要将数字由小到大排列放入abc"); // 这里这样说明的话，要将数字重新存到abc里面。      但是如果只是输出，可以按照我下面的方法省略一下

        String chars[] = sort.split("<");

//        System.out.println(Arrays.toString(chars));
        for(int i = 0; i<3; i++){
            String get = chars[i];

            switch (i){
                case 0:
                    System.out.print("所以a为"); break;
                case 1:
                    System.out.print(",所以b为"); break;
                case 2:
                    System.out.print(",所以c为"); break;
            }

            if(get.equals("a")){
                System.out.print(a);
            }
            if(get.equals("b")){
                System.out.print(b);
            }
            if(get.equals("c")){
                System.out.print(c);
            }
        }
}
}