import java.util.Scanner;//导入扫描仪

public class zuoye4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// runyear = year % 4 == 0 && year % 100 ! = 0 || year % 400 ==0 (闰年判断方式)
		// TODO Auto-generated method stub
		//定义变量； 年月 天数
		
		
		int year = 0;  //初值给一个不可能的值，方便以后判断
		int month = 0;
		int dayil = 0;
		int tian;
		int day;
		int day2;
		int a;
		
		//定义年月日及扫描键盘输入 
		System.out.println("年份");
		 year = input.nextInt();
		 System.out.println("月份");
		 month = input.nextInt();
		 if(month > 12){
			 System.out.println("非法输入!");
			 return	;
			 }
		 System.out.println("日期");
		 day = input.nextInt();
		

		 		// 根据月份计算当月天数，2月默认28
		 //switc的判断蛮好用的
		 switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayil = 31;
			if(day>dayil){
				System.err.println("非法输入！");
				System.exit(0);
			}
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			dayil = 30;
			if(day>dayil){
				System.err.println("非法输入！");
				System.exit(0);
			}
			break;
		case 2:
			dayil = 28;
			if(day>dayil){
				System.err.println("非法输入！");
				System.exit(0);
			}
			break;
		default:
			
			System.exit(0);
			
		}
		 
		//如果输入的年份是闰年，月份天使+1
		 boolean runyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		 if(runyear){
			 if(month == 2){
			 dayil++;
			 }
			 System.out.println("该年为闰年");

//			 if(month!= 1 && month != 2 ){
//			 day++;
//			 }
		 }		 
		 System.out.println("你查询的日期为" + year + "年" + month + "月" + day + "天");
		 System.out.println("该月有" + dayil + "天");
		//疯狂的计算次年的天数，人比较笨，只能这么写了T-T
		 if(month == 1){
			 System.out.println("你查询的日期为该年的第"+  day + "天");
		 }
		 else if(month == 2){
			 day = day +31;
		 System.out.println("你查询的日期为该年的第"+  day + "天");
		 }
		 else if(month == 3){
			 if(runyear = year % 4 == 0 && year % 100 != 0 || year % 400 ==0);
			 {
				 a = 1;
				day2 = day + 60;
			 }
			 if(! runyear){
				 a = 2;
				 day = day + 59;
			 }
			 if(a == 1){
				 System.err.println("你查询的日期为该年的第"+ day2+  "天");
			 }else if(a == 2){
				 System.err.println("你查询的日期为该年的第"+ day+  "天");
			 }
		 }
			 
		 else if(month ==4){
			 if(runyear){
				 day =day +91;
			 }else{
			 day = day +90;
			 }
			 System.out.println("你查询的日期为该年的第"+ day+ "天");
		 }
		 else if(month == 5){
			 if(runyear){
				 day =day +121;
			 }else{
			 day = day +120;
			 }
			 System.out.println("你查询的日期为该年的第"+  day + "天");
		 }
		 else if(month == 6){
			 if(runyear){
				 day =day +152;
			 }else{
			 day = day +151;
			 }
			 System.out.println("你查询的日期为该年的第"+  day+ "天");
		 }
		 else if(month == 7){
			 if(runyear){
				 day =day +182;
			 }else{
			 day = day +181;
			 }
			 System.out.println("你查询的日期为该年的第"+ day+ "天");
		 }
		 else if(month == 8){
			 if(runyear){
				 day =day +213;
			 }else{
			 day = day +212;
			 }
			 System.out.println("你查询的日期为该年的第"+ day +  "天");
		 }
		 else if(month == 9){
			 if(runyear){
				 day =day +244;
			 }else{
			 day = day +243;
			 }
			 System.out.println("你查询的日期为该年的第"+ day + "天");
		 }
		 else if(month == 10){
			 if(runyear){
				 day =day +274;
			 }else{
			 day = day +273;
			 }
			 System.out.println("你查询的日期为该年的第"+ day+ "天");
		 }
		 else if(month == 11){
			 if(runyear){
				 day =day +304;
			 }else{
			 day = day +303;
			 }
			 System.out.println("你查询的日期为该年的第"+ day+  "天");
		 }
		 else if(month == 12){
			 if(runyear){
				 day =day +334;
			 }else{
			 day = day +333;
			 }
			 System.out.println("你查询的日期为该年的第"+  day+ "天");
			 System.exit(0);
		 }
	}
	
}
