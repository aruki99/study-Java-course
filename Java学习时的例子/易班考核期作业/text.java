import java.util.Arrays;

public class text {
	//����ɾ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,7};
		int n = 2;
		int[] b = new int [a.length - 1];
		for (int i = 0; i < b.length; i++) {
			//�ж�Ԫ���Ƿ�Խ��
			if(n < 0 || n > a.length){
				throw new RuntimeException("Ԫ��Խ��... ");
			}
			if(i < n){
				b[i] = a [i];
			}
			else{
				b[i] = a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		a = b;
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
		a[2] = a[1];
		System.out.println(a[2]);
	}
}
