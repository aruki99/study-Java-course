import java.util.Scanner;//����ɨ����


public class youji {
    public static class lzh {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
	private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("����������Ҫ�Ƚϴ�С��������:");
        System.out.print("a:");
        int a ;
        a = (int) input.nextFloat();//��������
        System.out.print("b:");
        int b;
        b = (int) input.nextFloat();//��������
        System.out.print("c:");
        int c;
        c = (int) input.nextFloat();//��������
        //�òݸ�ֽ�г����˺ö�������ģ�����ֻ�ʺϱȽ�����Ŀ����Ŀ��
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

        System.out.println("��Ҫ��������С�������з���abc"); // ��������˵���Ļ���Ҫ���������´浽abc���档      �������ֻ����������԰���������ķ���ʡ��һ��

        String chars[] = sort.split("<");

//        System.out.println(Arrays.toString(chars));
        for(int i = 0; i<3; i++){
            String get = chars[i];

            switch (i){
                case 0:
                    System.out.print("����aΪ"); break;
                case 1:
                    System.out.print(",����bΪ"); break;
                case 2:
                    System.out.print(",����cΪ"); break;
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