import java.util.Scanner;

public class neili{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("�������ɫ������ֵ��");
        int power = input.nextint();
        if(power >= 0 && power <= 1000){
            System.out.println("������������һ��");
        }else if(power <=  1000 || power >= 3000){
            System.out.println("��������������");
        }

    }
}