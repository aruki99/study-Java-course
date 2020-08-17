import java.util.Scanner;

public class changdu {


		// TODO Auto-generated method stub
		public static void main(String[] args1){
			
		    String sys = "学生信息管理";// 字义一个字符串表示系统名称
		    System.out.println("欢迎进入《" + sys + "》系统");// 输出系统名称
		    System.out.println("请设置一个管理员密码：");
		    Scanner input = new Scanner(System.in);
		    String pass = input.next();// 获取用户输入的密码
		    int length = pass.length();// 获取密码的长度
		    if (length > 6 && length < 12) {
		        System.out.println("密码长度符合规定。");
		        System.out.println("已生效，请牢记密码：" + pass);
		    } else if (length >= 12) {
		        System.out.println("密码过长。");
		    } else {
		        System.out.println("密码过短。");
		    }
		}
	}


