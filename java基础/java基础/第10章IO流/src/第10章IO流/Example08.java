package 第10章IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example08 {

	public static void main(String[] args) throws IOException {
		//创建字节输入流
		FileInputStream in=new FileInputStream("src/src.txt");
		//将字节输入流转换为字符输入

		InputStreamReader isr=new InputStreamReader(in);
		//创建字节输出流
		FileOutputStream out=new FileOutputStream("des.txt");//在根目录下面
		//将字节输出流out转换成字符输出流osw
		OutputStreamWriter osw=new OutputStreamWriter(out);
		int ch;//记录读取的字符
		while((ch=isr.read())!=-1)
		{
		osw.write(ch);	
		}
		isr.close();
		osw.close();
	}

}
