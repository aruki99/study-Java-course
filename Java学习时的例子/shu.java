
public class shu {

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
		long t;
		 for (int j = 0; j < s.length - 1 ; j++) {
			for (int j2 = 0; j2 < s.length - j - 1; j2++) {
				if(shijian[j2] > shijian[j2 + 1]){
					t = shijian[j2];
					shijian[j2] = shijian[j2 + 1];
					shijian[j2 + 1] = t;
				}	// 测试时间排序
				long y;
				for (int i = shijian.length; i < shijian.length / 2; i--) 
					for (int i2 = shijian.length; i2 < shijian.length - i2 -1; i2--) {
						if(shijian[i2] < shijian[i2 + 1]){
							y = shijian[i2 + 1];
							shijian[i2] = shijian[i2 + 1];
							shijian[i2] = y;
					}
				}
			}
		 }
			System.out.println("排序后根据时间，从早到晚");
			for (int k = 0; k < shijian.length; k++) {
				System.out.println(shijian[k] + "\t");
			}
			long y;
			 for (int j = 0; j < s.length - 1 ; j++) {
				for (int j2 = 0; j2 < s.length - j - 1; j2++) {
					if(zishu[j2] < zishu[j2 + 1]){
						y = zishu[j2];
						zishu[j2] = zishu[j2 + 1];
						zishu[j2 + 1] = y;
					}	 // 测试长度排序
				}
				long x;
				for (int i = shijian.length ; i < shijian.length / 2; i--) {
					for (int i2 = shijian.length ; i2 < shijian.length - i2 -1; i2--) {
						if(zishu[i2] < zishu[i2 + 1]){
							x = zishu[i2 + 1];
							zishu[i2 + 1] = zishu[i2];
							zishu[i2] = x;
						}
					}
					
				}
			}
				System.out.println("排序根据文章长度，从长到短排序：");
				for (int k = 0; k < zishu.length; k++) {
					System.out.print(zishu[k] + "\t");
		}
				
	

			
				 // 定义一个可以对时间进行排序的方法
				
				  // 定义一个可以对文章长度进行排序的方法
	}
}


