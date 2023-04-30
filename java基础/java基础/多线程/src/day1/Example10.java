package day1;
//线程让步，中断
public class Example10 {
public static void main(String[] args) {
	Thread thread1=new YieldThread("thread1");
	Thread thread2=new YieldThread("thread2");
	thread1.start();//启动线程
	thread2.start();
}
}
class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
		
		if(i==2) {
			System.out.println("线程让步:");
			Thread.yield();//程序运行到此处，做出让步
		}
		if(i==5) {
			Thread.currentThread().interrupt();
			System.out.println("线程是否中断----"+Thread.currentThread().isInterrupted());
		}
		}
	}
}
