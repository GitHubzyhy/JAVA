package 第10章IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example05 {
public static void main(String[] args) throws IOException {
	
		text1();
		text2();
}
public static void text1() throws IOException{
	 OutputStream output=null;//输出流一根管子
	//FileOutputStream子类是操作文件的字节输入流，像文件写入数据
	try {
		OutputStream out=new FileOutputStream("example.txt");//文件一旦不存在就自己创建一个,存在就覆盖原有的内容
		String str="字节输出流";
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++) {
			out.write(b[i]);
		}
	}finally {
		if(output!=null)
		output.close();//关闭文件夹
	}
}
public static void text2() throws IOException {
	 OutputStream output=null;//输出流一根管子
		try {
	FileOutputStream out=new FileOutputStream("example.txt",true);//追加
	String str="学习";
	byte[] b=str.getBytes();
	for(int i=0;i<b.length;i++) {
		out.write(b[i]);
	}
	}finally {
		if(output!=null)
			output.close();//关闭文件夹
	}
}
}
