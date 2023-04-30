package 第10章IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example04 {
public static void main(String[] args) throws Exception  {
	InputStream input=null;
	try {
		//FileinputStream操作文件字节输入流，专门用于读取文件中的数据
		
		FileInputStream  in=new FileInputStream("C:\\Users\\ZYH\\Desktop\\java基础\\java基础\\第10章IO流\\src\\1.txt");
		int b=0;//用于记录每一次读取的一字节
	while(true)
	{
			b=in.read();//从输入流中读取一个字节将其转换为十进制数字并且返回
		if(b==-1)//一旦为-1跳出循环
			break;
		System.out.print((char)b);//否则将其输出
	}
	}finally {
		if(input!=null)//同一个流
		input.close();
	}
}
}
