
public class Ê±¼ä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(starTime);
		System.out.println(endTime);
		System.out.println(endTime - starTime);
	}
}
