import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.swing.plaf.synth.SynthSeparatorUI;


public class copy {
	private static final String FilePath1 = "D:/电影/修改后的啦啦操大片.mp4";			//被复制文件路径
	private static final String FilePath2 = "D:/电影/复制后.mp4";					//复制或剪切后文件路径
	
	public static void main(String[] args) throws IOException {
		
	long time = copyway();
	System.out.println("拷贝用时：" + time + "毫秒");
	
	
	}
	//使用缓存流拷贝文件
	//拷贝所用时间 单位毫秒
	private static long copyway(){
		File file = new File(FilePath1);
		
		if(!file.exists()){
			System.out.println("要复制的文件不存在");
			return 0;
		}
	long startime = System.currentTimeMillis();	//开始时间
	
	InputStream instream = null;			//外部定义
	BufferedInputStream binstream = null;		
	
	OutputStream outstream = null;
	BufferedOutputStream boutstream = null;
	
	try {
		instream = new FileInputStream(file);				//输入流
		binstream = new BufferedInputStream(instream);
		
		outstream = new FileOutputStream(FilePath2);		//输出流
		boutstream = new BufferedOutputStream(outstream);
		
		int i = -1; //读取出的临时变量
		while((i = binstream.read()) != -1){
			boutstream.write(i);		//读取一个字节就写入了缓存中
			//最后将缓存中的内容，写入文件中！	即，需要清空缓冲区的内容写入文件中 - flush
		}
		
		System.out.println("文件复制成功");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally{
			try {
				//boutstream。flush();
				boutstream.close();	//可以直接调用close方法，内容是帮我们自动调用了flush方法
				outstream.close();
				binstream.close();
				instream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	//file.delete();														//！！剪切的用法！！
	//System.out.println("剪切成功");
	long endtime = System.currentTimeMillis();	//结束时间
	return endtime - startime;
		
	}
}