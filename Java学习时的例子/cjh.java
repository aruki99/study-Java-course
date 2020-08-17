
public class cjh {

	public static void main(String[] args) {
		double x,y=0;
		double s;
		for(x=1;x<=2011;x++){
			if(x % 6 != 0 && x % 8 != 0){
				y++;
			}
		}
		System.out.println("既不能被6和8整除的数字有" + y + "个");
		s=y/2011;
		System.out.println("概率为" + s*100 +"%");
	}
}
