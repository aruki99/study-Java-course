import java.util.Arrays;

public class text {
	//数组删除
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,7};
		int n = 2;
		int[] b = new int [a.length - 1];
		for (int i = 0; i < b.length; i++) {
			//判断元素是否越界
			if(n < 0 || n > a.length){
				throw new RuntimeException("元素越界... ");
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
