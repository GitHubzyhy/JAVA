package day1;
//同步代码块
public class Example11 {
public static void main(String[] args) {
	Ticket1 ticket=new Ticket1();
	//创建四个线程
	new Thread(ticket,"线程1").start();
	new Thread(ticket,"线程2").start();
	new Thread(ticket,"线程3").start();
	new Thread(ticket,"线程4").start();	
}
}
class Ticket1 implements Runnable{
private int tickets=10;//车票号
Object lock=new Object();//定义任意一个对象，用作同步代码块的锁
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		synchronized (lock) {//定义同步代码块
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"--卖出的票为："+tickets--);
			}
			else {
				break;
			}
		}
		}
	}
	
}
