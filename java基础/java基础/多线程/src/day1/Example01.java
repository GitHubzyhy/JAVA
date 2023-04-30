package day1;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread02 myThread=new MyThread02();
		myThread.start();//启动新线程
		while(true) {
			System.out.println("main()方法在运行");
		}
	}
	
}
class MyThread02 extends Thread{
public void run() {//重写run方法 
	while(true) {
		System.out.println("MyThread02 的死循环");
	}
}
}
