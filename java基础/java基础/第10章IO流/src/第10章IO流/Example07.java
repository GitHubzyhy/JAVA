package 第10章IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example07 {

	public static void main(String[] args) throws IOException {
		//字符流读取数据
		text1();
		//字符流写入数据
		text2();
		//追加数据
		text3();
	}
	public static void text1() throws IOException {
		//字符流读取文件
		FileReader reader=new FileReader("src/1.txt");
		int ch;//定义一个变量记录读取的字符
		while((ch=reader.read())!=-1) {
			System.out.print((char)ch);//read()方法返回的是int类型的值，所以必须强制类型转化
		}
	}
	public static void text2() throws IOException {
		//字符流写数据
		FileWriter writer=new FileWriter("src/2.txt");
		String str="天冷多加衣";
		writer.write(str);
		writer.write("\r\n");
		writer.close();//关闭文件
	}
	public static void text3() throws IOException {
		//字符流追加数据
		FileWriter writer=new FileWriter("src/2.txt",true);//追加
		String str="赶在日落下山前";
		writer.write(str);
		writer.write("\r\n");
		writer.close();//关闭文件
	}
}
