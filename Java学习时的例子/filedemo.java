import java.io.File;
import java.io.IOException;
import java.util.Date;

public class filedemo {
	public static void main(String[] args) throws IOException { 
		File file = new File("src");
		System.out.println("�ļ�/�ļ����Ƿ����" + file.exists());
		System.out.println("�ǲ���һ���ļ�" + file.isFile());
		System.out.println("�ǲ���һ���ļ���" + file.isDirectory());
		System.out.println("�ļ���/Ŀ¼��" + file.getName());
		System.out.println("����·��" + file.getAbsolutePath());
		System.out.println("·��" + file.getPath());
		System.out.println("����޸ļ�" + new Date(file.lastModified()).toLocaleString());
		System.out.println("�Ƿ�����" + file.isHidden());
		System.out.println("�Ƿ�ɶ�" + file.canRead());
		System.out.println("�Ƿ��д" + file.canWrite());
		System.out.println("�ļ���С" + file.length());
		
		
		//ʹ��file�ഴ���ļ�
		if (!file.exists()) {//����ļ���Ŀ¼�����ڣ��ʹ���
			if (file.isFile()) {
				file.createNewFile();
				System.out.println("�����ļ�");
			}else{
				file.mkdir();
				System.out.println("����Ŀ¼");
				//file.createNewFile(); �������ļ�
				//file.delete();		����ɾ���ļ�
				//file.deleteOnExit();	�������ʱ��ɾ���ļ�
			}	
		}
	}
}