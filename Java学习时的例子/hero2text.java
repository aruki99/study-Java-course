
public class hero2text {
	public static void main (String[] agrs){

		warrior 不知火舞 = new warrior("刺客",999,2000,3000);
		不知火舞.setLevel(99);
		warrior 不知火舞2 = new warrior("刺客",999,2000,3000);
		不知火舞2.setLevel(80);
		System.out.println(不知火舞 == 不知火舞2);
		System.out.println(不知火舞.equals(不知火舞2));
		System.out.println(不知火舞.compareTo(不知火舞2));
		
		
		不知火舞.move();
		
		fashi a = new fashi();
		System.out.println(a);
		fashi 貂蝉 = new fashi();
		貂蝉.biubiu();
		System.out.println("级别" + 貂蝉.getLevel());
		System.out.println("当前血量" + 貂蝉.getCurrlife());
		System.out.println("法术强度" + 貂蝉.getFaqian());
		System.out.println(貂蝉);
	}
}
