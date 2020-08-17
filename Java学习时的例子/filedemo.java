import java.io.File;
import java.io.IOException;
import java.util.Date;

public class filedemo {
	public static void main(String[] args) throws IOException { 
		File file = new File("src");
		System.out.println("文件/文件夹是否存在" + file.exists());
		System.out.println("是不是一个文件" + file.isFile());
		System.out.println("是不是一个文件夹" + file.isDirectory());
		System.out.println("文件名/目录名" + file.getName());
		System.out.println("绝对路径" + file.getAbsolutePath());
		System.out.println("路径" + file.getPath());
		System.out.println("最后修改间" + new Date(file.lastModified()).toLocaleString());
		System.out.println("是否隐藏" + file.isHidden());
		System.out.println("是否可读" + file.canRead());
		System.out.println("是否可写" + file.canWrite());
		System.out.println("文件大小" + file.length());
		
		
		//使用file类创建文件
		if (!file.exists()) {//如果文件或目录不存在，就创建
			if (file.isFile()) {
				file.createNewFile();
				System.out.println("创建文件");
			}else{
				file.mkdir();
				System.out.println("创建目录");
				//file.createNewFile(); 创建新文件
				//file.delete();		立即删除文件
				//file.deleteOnExit();	程序结束时，删除文件
			}	
		}
	}
}