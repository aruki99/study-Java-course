import java.util.Scanner;

public class dazhe{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //1 璁╃敤鎴疯緭鍏ヤ笁绉嶅晢鍝佸崟浠峰拰鏁伴噺
        float price;
        int count;
        double total;
        //鍟嗗搧鍗曚环銆傚晢鍝佹暟閲忥紝璐拱鎬讳环
        
        System.out.print("璇疯緭鍏ヨ矾鏄撴柉濞佺櫥鎵嬭〃鍗曚环锛�");
        price = input.nextFloat();//鎺ユ敹
        System.out.print("璇疯緭鍏ュ晢鍝佺殑鏁伴噺锛�");
        count = input.nextInt();
        total = price * count; //褰撳墠鍟嗗搧鎬讳环

        System.out.print("鐗规柉鎷夋苯杞︼細");
        price = input.nextFloat();
        System.out.print("璇疯緭鍏ュ晢鍝佹暟閲�");
        count = input.nextInt();
        total += price * count;//璁＄畻涓ょ鍟嗗搧鐨勭疮鍔犳�讳环
        
        System.out.print("鍝囧搱鍝堬細");
        price = input.nextFloat();
        System.out.print("璇疯緭鍏ュ晢鍝佹暟閲�");
        count = input.nextInt();
        total += price * count; //璁＄畻涓夌鍟嗗搧鐨勭疮鍔犳�讳环

        //2 璁＄畻鎬讳环
        //3 鏍规嵁鎬讳环鍒ゆ柇鏄惁鎵撴姌锛�
        if(total >= 50000){
            //鎵撲竷鎶�
            total *= 0.7; //  total = total * 0.7;
        }else{
            total *= 0.9;
        }
        //4 鎵撳嵃鏈�鍚庡簲璇ユ敮浠樼殑閲戦
        System.out.printf("鏈�缁堝簲鏀粯鐨勯噾棰濅负锛�%.1f" , total);
    }
}