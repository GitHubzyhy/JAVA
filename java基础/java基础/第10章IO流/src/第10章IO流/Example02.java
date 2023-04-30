package 第10章IO流;

import java.io.File;
import java.io.FilenameFilter;

public class Example02 {

	public static void main(String[] args) {
		//遍历当前目录下的文件
		{
			text1();
	        text2();
		}
		//遍历包括子目录下的文件
		File file=new File("C:\\Users\\ZYH\\Desktop\\数据结构");
		text3(file);
	}
	public static void text1(){
		//遍历指定目录下的所有文件，File类的list()的方法获取目录下所有文件和目录的名称
		File file=new File("C:\\Users\\ZYH\\Desktop\\java基础\\java基础\\第10章IO流\\src\\第10章IO流");
		if(file.isDirectory())//判断是否为目录
		{
			String[] names=file.list();//获得目录下的所有文件名
			for(String name:names) {//foreach循环，只能访问不能修改
				System.out.println(name);
			}
		}	
	}
	public static void text2() {
		/*遍历指定目录下指定扩展名文件
		File类提供了一个重载的list(),该方法接受一个FilenameFilter类型的参数是一个接口
		叫做文件过滤器，其中定义了抽象方法accep()用于依次对指定的File的所有子目录或文件进行迭代
		*/
		File file=new File("C:\\Users\\ZYH\\Desktop\\java基础\\java基础\\第10章IO流\\src\\第10章IO流");
		//创建文件过滤器对象
		FilenameFilter filter=new FilenameFilter() {		
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File currFile=new File(dir,name);
				if(currFile.isFile()&&name.endsWith(".java"))//文件名以Java结尾返回true
				return true;
				else
				return false;
			}
		};
		if(file.exists())//获取file对应的文件是否存在
		{
			String[] lists=file.list(filter);//获得目录下的筛选后的文件名
			for(String list:lists) {
				System.out.println(list);
			}
		}
	}
	public static void text3(File dir) {
		/*遍历子目录下的文件在内的所有文件 File 类提供的listFiles()方法
		 * 返回一个File对象数组，当对数组中的元素进行遍历时，如果元素还有子目录需要遍历
		 * 就递归遍历子目录
		*/
		File[] files=dir.listFiles();//获得表示目录下所有文件的数组
		for(File file:files)
		{
		if(file.isDirectory()) {//判断是否为目录
			text3(file);//是目录就递归
		}
		System.out.println(file.getName());//是文件就输出他的名字
		}
		
	}
}
