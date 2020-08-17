
public class text3 {
	//Ë«ÏòÃ°Åİ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {213,3123,434,21,1,2,3,123,3,12,3,3123,1231,213,12,312,1,3,123,1,3,12,3};
		int end = a.length-1;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length- i - 1; j++) {
				if(a[j] > a[j + 1]){
					int x = a [j];
					a[j] = a [j + 1];
					a [j + 1] = x;
				}
				if(a[end - 1] > a[end]){
					int y = a[end -1];
					a[end -1] = a[end];
					a[end] = y;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}
	
