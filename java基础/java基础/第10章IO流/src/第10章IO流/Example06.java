package 第10章IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example06 {
public static void main(String[] args) throws Exception {
	text1();
	//使用缓冲区读写文件可以有效的提高程序的读写效率
	text2();
}
public static void text1() throws Exception {
	//创建一个文件输入流用于读取数据
	InputStream input=new FileInputStream("src/图片复制前/1.jpg");//包在src里面
	//创建一个文件输出流用于将读的数据写入到b.jpg
	OutputStream output=new FileOutputStream("src/图片复制后/2.jpg");
	int len;//用于记录每一次读取的一字节
	long begintime=System.currentTimeMillis();
	while((len=input.read())!=-1)//判断是否读到文件末尾
	{
		output.write(len);
	}
	long endtime=System.currentTimeMillis();
	System.out.println("复制文件所用："+(endtime-begintime)+"ms");
	input.close();
	output.close();
}
public static void text2()throws Exception {//分批实现文件的复制
	InputStream input=new FileInputStream("src/图片复制前/1.jpg");
	OutputStream output=new FileOutputStream("src/图片复制后/3.jpg");
	int len;//记录读入缓冲区的字节数
	byte[] buff=new byte[1024];
	long begintime=System.currentTimeMillis();
	while((len=input.read(buff))!=-1)//判断是否读到文件末尾
	{
		output.write(buff,0,len);//从第一个字节开始，向文件写入len字节
	}
	long endtime=System.currentTimeMillis();
	System.out.println("复制文件所用："+(endtime-begintime)+"ms");
	input.close();
	output.close();
}
}
