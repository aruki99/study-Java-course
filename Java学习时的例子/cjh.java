
public class cjh {

	public static void main(String[] args) {
		double x,y=0;
		double s;
		for(x=1;x<=2011;x++){
			if(x % 6 != 0 && x % 8 != 0){
				y++;
			}
		}
		System.out.println("�Ȳ��ܱ�6��8������������" + y + "��");
		s=y/2011;
		System.out.println("����Ϊ" + s*100 +"%");
	}
}
