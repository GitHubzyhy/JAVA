package day1;

import java.util.concurrent.locks.ReentrantLock;

public class test {
public static void main(String[] args) 	 {
ReentrantLockText1  reentrantLockTest=new ReentrantLockText1();
new Thread(reentrantLockTest,"线程1").start();
new Thread(reentrantLockTest,"线程2").start();
new Thread(reentrantLockTest,"线程3").start();
}
}
class ReentrantLockText1 implements Runnable{
private int tickets=10;
private ReentrantLock reentrantLock=new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			sale();
			if(tickets<0)
				break;
		}
	}
	public void sale() {
		reentrantLock.lock();
		if(tickets>0) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
		}
		reentrantLock.unlock();
	}
}

