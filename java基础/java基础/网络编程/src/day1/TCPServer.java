package day1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TCPServer {
public static void main(String[] args) throws IOException {
	Socket client=null;//客户端
	OutputStream os=null;//输出流
	//创建ServerSocket对象并且指定端口号(7788)
	ServerSocket serverSocket=new ServerSocket(7788);
	System.out.println("服务器正在运行，等待于客户端连接");
	client=serverSocket.accept();//等待客户端连接,程序阻塞
	os=client.getOutputStream();//获取客户端的输出流
	System.out.println( "开始与客户端交互程序");
	//当客户端连接到服务端的时候，向客户端输出数据
	os.write("北京欢迎你".getBytes());
	System.out.println("结束与客户端交互数据");
	os.close();
	client.close();
	
}
}
