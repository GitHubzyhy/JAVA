package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TCPClient {
@SuppressWarnings("resource")
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket client=null;//申明Socket对象
	client=new Socket("localhost",7788);//指定连接的主机号,和端口号
	BufferedReader buf=new BufferedReader(
			new InputStreamReader(
					client.getInputStream()//获取客户端的输入流
					)
			);
	String str=buf.readLine();//读取信息
	System.out.println("服务器端输出的内容："+str);
	client.close();
	buf.close();
}
}
