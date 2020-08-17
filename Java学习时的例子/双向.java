import java.sql.Time;

public class 双向 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//	我们在后台存入的资料包括：
//		1、	投稿人名字
//		2、	投稿文章的文本
//		3、	投稿时间（unix时间戳）
//		4、	与稿子唯一对应的一串信息编码
		
//		信息编码 是 一个 包括了文本长度，以及投稿时间等信息，长度为18的十进制数字。
//		1、	数字前10位存的是投稿时间（unix时间戳）
//		2、	数字的第11位到第13位存的是稿子的文本长度
//		3、	其它位数存的是包括投稿人的其它信息
		System.out.println("在这里面进行测试！");
		long s[] = { 	157235386199912548l,
						157235395415754878l,
						157235251198755562l,
						154081651154811456l,
						153286771135481648l,
						156362611125480185l,
						159524851164054810l,
						155308531154018015l,
						154379371148679498l,
						154381201115687401l,};
		long zishu[] = {
							999,
							157,
							987,
							548,
							354,
							254,
							640,
							540,
							486,
							156,
			
		};
		long shijian[] = {
							1572353861,
							1572353954,
							1572352511,
							1540816511,
							1532867711,
							1563626111,
							1595248511,
							1553085311,
							1543793711,
							1543812011,
		};
		int t = 0;
		int high = zishu.length;
		int left = 1;
		int right = high -1;
		do{
			for (int i = right; i >= left; i--) {
				if(zishu[i] < zishu[i - 1]){
					long x = zishu[i];
					zishu[i] = zishu[i -1];
					zishu[i - 1] = x;
					x = i;
				}
			}
			left = t + 1;
			for (int i = left; i < right + 1; i++) {
				if(zishu[i] < zishu[i - 1]){
					long x = zishu[i];
					zishu[i] = zishu[i - 1];
					zishu[i -1] = x;
					x = i;
				}
			}
			right = t - 1;
			}while(left <= right);{
				for (int i = 0; i < shijian.length; i++) {
					System.out.println(zishu[i] + "\t");
				}
			}
			
	}
}



	

