package day1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//多线程的TCP网络程序
public class TCPServer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(7788);//监听指定的端口
		//使用while循环不停的接受客户端发送的请求
		while(true) {
			//调用ServerSocket的accept()方法等待客户端的连接
			final Socket client=serverSocket.accept();
			int port=client.getPort();//获取端口号
			System.out.println("与端口号"+port+" 的客户端连接成功");
			//创建一个新线程
			new Thread() {
				public void run() {
					OutputStream os=null;//申明一个输出流对象
					try {
						os=client.getOutputStream();
						System.out.println("开始与客户端交互数据");
						os.write("北京欢迎你3".getBytes());
						os.close();
						client.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}.start();
		}
	}

}
