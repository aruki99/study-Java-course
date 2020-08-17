import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
		 * 下载原理
		 * 1：从http协议下载文件（文件流），将文件流以缓冲流的方式读取到内存中
		 * 	InputStream -> BufferedinputStream
		 * 2：将缓存中的数据分块写道硬盘上（使用RandomAcessFile类实现）
		 * 当前案例主要从http上下载文件
		 */
public class xiazaiqi {
	//下载的老9学堂宣传片 146M
	public static final String Strurl = "http://www.xuetang9.com/video/xuetang9_intro.mp4";
	//设置下载时的缓存大小 1M = 10k
	public static final int MAX_BUFFER_SIZE = 10240;
	public static void main(String[] args) {
		//1，打开http连接，获取下载内容长度（补充内容，格式固定）
		//2，创建RandomAccessFile对象
		//3，将下载类容缓存到字节数组中
		//4将缓存字节数组通过RandomAccessFile对象写入到文件中（涉及到一个文件指针的操作）
		
		HttpURLConnection connection = null;
		BufferedInputStream binstream = null;
		try {
			URL url = new URL(Strurl);		//创建url'对象，获得文件流
			connection = (HttpURLConnection)url.openConnection();
			//设置连接属性-Raange指从服务器请求下载文件的字节范围 0-   表示不指定终止数节
			connection.setRequestProperty("Range", "bytes=0-");
			connection.connect();	//连接到了服务器
			//判断是否连接成功，一般连接成功后，返回的代码应该在200的范围内
			/**
			 * 1XX；指示信息，表示请求已经接受，继续操作
			 * 2XX；成功，表示请求已经成功接受，理解，操作
			 * 3XX；重定向，表示要完成请求，需要进一步操作
			 * 4XX；客户端错误，表示请求有语法错误，或请求无法实现
			 * 5XX服务器错误，服务器未能实现合法请求
			 */
			System.out.println(connection.getResponseCode());
			if(connection.getResponseCode() / 100 != 2){
				System.err.println("连接错误，请重试！");
				return;
			}else{
				System.out.println("连接成功");
			}
			int filesize = connection.getContentLength();		//获得要下载文件大小（字节数）
			binstream = new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
			int downloaded = 0;		//用来计算已下载的百分比
			String filename = url.getFile();		//获得下载文件名
			//截取字符串，从最后一个斜线+1的位置开始截取
			filename = filename.substring(filename.lastIndexOf("/") + 1);
			RandomAccessFile file = new RandomAccessFile(filename, "rw");
			file.setLength(0);	//文件清空
			file.seek(0);		//文件指针归零
			while(downloaded < filesize){
				byte[] buffer = null;		//已下载缓存数组
				//判断为下载大小是否大与缓存
				if(filesize - downloaded > MAX_BUFFER_SIZE){
					buffer = new byte[MAX_BUFFER_SIZE];
				}else{
					buffer = new byte[filesize - downloaded];
				}
				//将缓存中的内容读取出来
				int read = binstream.read(buffer);
				if(read == -1)break;	//下载完毕
				//将当前下载的缓存写入到文件中
				file.seek(downloaded);//设置文件指针
				file.write(buffer,0,read);
				downloaded += read;
				System.out.println("当前下载进度：" + downloaded * 1.0 / filesize * 10000/100/*这样10000/100的百分数就有两位小数*/  + "%");
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			connection.disconnect();
			try {
				binstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
