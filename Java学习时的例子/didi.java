import java.util.Scanner; 
public class didi{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入硬盘符号:");
        char ch = input.next().charAt(0);       //取用户输入字符串的一个字符
        if(ch  >= 'A' || ch <= 'Z'){   //  与前面等价写法  !(ch <'A' || ch > 'Z')
            //'A' <= ch >= 'z'  错误写法
        System.out.println("你输入的盘符为合法盘符！");
        
        }else{
            System.err.println("你输入的盘符为非法盘符!!!");
        }
    }
}