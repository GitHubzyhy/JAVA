package 第10章IO流;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
	text1();
	text2();
	try {
		text3();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void text1() {
		//File类是唯一一个可以代表磁盘文件的对象，定义了一些用于操作文件的方法
		//使用绝对路径创建
		File f=new File("C:\\Users\\ZYH\\Desktop\\java基础\\java基础\\第10章IO流\\src\\a.txt");
		System.out.println(f);
		//使用相对路径创建
		File f1=new File("src\\b.text");
		System.out.println(f1);
	}
	public static void text2() {
		File file=new File("src/test.txt");
		System.out.println("文件是否存在: "+file.exists());
		System.out.println("文件名:"+file.getName());
		System.out.println("文件的大小："+file.length()+"bytes");
		System.out.println("文件的相对路径："+file.getPath());
		System.out.println("文件的绝对路径："+file.getAbsolutePath());
		System.out.println("文件的父级对象是否为文件："+file.isFile());
		System.out.println("文件删除是否成功:"+file.delete());//删除file对象对应的文件或者目录成功为1失败为0
	}
	public static void text3() throws IOException {
		//临时文件的操作
		File f=File.createTempFile("itcast-", ".txt");//前缀和后缀名
		f.deleteOnExit();//java虚拟机退出的狮虎自动删除文件f
		System.out.println("f是否为文件："+f.isFile());
		System.out.println("f的相对路径："+f.getPath());
	}
}
