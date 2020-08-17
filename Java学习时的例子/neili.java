import java.util.Scanner;

public class neili{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入角色的内力值：");
        int power = input.nextint();
        if(power >= 0 && power <= 1000){
            System.out.println("他看起来不堪一击");
        }else if(power <=  1000 || power >= 3000){
            System.out.println("看起来毫不足虑");
        }

    }
}