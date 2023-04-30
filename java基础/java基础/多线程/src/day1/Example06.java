package day1;
//后台线程
public class Example06 {

	public static void main(String[] args) {
		System.out.println("main线程是后台线程吗"+Thread.currentThread().isDaemon());
		Thread thread=new Thread(()->{
			while(true) {
				System.out.println(Thread.currentThread().getName()+"---在运行");
			}
		},"线程1");
		System.out.println("thread线程默认是后台线程吗？"+thread.isDaemon());
		thread.setDaemon(true);//必须在线程启动之前设置
		thread.start();
		//模拟main线程的执行
		for(int i=0;i<9;i++) {
			System.out.println(i);
		}
	}
	
}
