package 第10章IO流;

import java.io.File;

public class Example03 {

	public static void main(String[] args) {
		/*删除文件及其目录 File类的delete()方法只能删除一个指定的文件
		只能通过递归的方法删除：一个目录中包含子目录或文件
		文件一旦被删除就不能再被恢复
		*/
		File file=new File("C:\\Users\\ZYH\\Desktop\\java基础\\java基础\\第10章IO流\\src\\hellow");
		deleteDir(file);
		System.out.println("文件以及全部被删除");
	}
	public static void deleteDir(File dir)
	{
		if(dir.exists()) {
			File[] files=dir.listFiles();//获取目录下所有文件的数组
		for(File file:files) {
			if(file.isDirectory())//判断是否为目录
				deleteDir(file);
			else {
				file.delete();//是文件就进行删除
			}
		}
		dir.delete();//删掉一个目录的所有文件后最后将它删除
		}
	}

}
