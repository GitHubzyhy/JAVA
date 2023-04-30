package day1;
import java.io.IOException;
import java.net.InetAddress;


public class Example01 {
	public static void main(String[] args) throws IOException {
		//获取表示本地主机的InetAddress对象的IP地址
		InetAddress localAddress=InetAddress.getLocalHost();
		//通过给定的主机名获取InetAddress对象的IP地址
		InetAddress remoteAddress=InetAddress.getByName("DESKTOP-JV2EN3J");
		//获取本地主机地址并且输出
		System.out.println("本机的IP地址为："+localAddress.getHostAddress());
		System.out.println("3s过后是否可达主机名为DESKTOP-JV2EN3J的IP地址： "+remoteAddress.isReachable(3000));
	}

}
