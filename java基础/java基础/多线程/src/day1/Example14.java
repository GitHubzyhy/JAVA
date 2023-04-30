package day1;

import java.util.concurrent.locks.ReentrantLock;

//重入锁
public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLockTest reentrantLockTest=new ReentrantLockTest();
		new Thread(reentrantLockTest,"线程1").start();//开启线程1
		new Thread(reentrantLockTest,"线程2").start();
		new Thread(reentrantLockTest,"线程3").start();
		new Thread(reentrantLockTest,"线程4").start();
	}

}
class ReentrantLockTest implements Runnable{
private int tickets=100;
ReentrantLock reentrantLock=new ReentrantLock(); 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			saleTicket();
			if(tickets<=0) {
				break;
			}
		}
		//定义的同步方法
	}
	public void saleTicket() {
		//调用lock方法为车票数加锁
		reentrantLock.lock();
		
		if(tickets>0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"--卖出的票"+tickets--);
		}
		reentrantLock.unlock();//为车票释放锁
	}
}
