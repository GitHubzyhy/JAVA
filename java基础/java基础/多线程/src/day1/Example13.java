package day1;
//死锁问题
public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new DeadLockThread(true),"Chinese").start();//开启线程1
		new Thread(new DeadLockThread(false),"false").start();//开启线程2
	}

}
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();//定义第一个锁对象
	static Object knifeAndFork=new Object();//定义的第二个锁对象
	private boolean flag;//判断身份
	public DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag) {
			synchronized(chopsticks)//chopsticks锁对象上的同步代码块
			{
				System.out.println(Thread.currentThread().getName()+"----if---chopsticks");
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"----if---knifeAndFork");
				}
			}
		}
		else {
			synchronized (knifeAndFork) {
				System.out.println(Thread.currentThread().getName()+"----if---knifeAndFork");
			synchronized (chopsticks) {
				System.out.println(Thread.currentThread().getName()+"----if---chopsticks");
			}
			}
		}
	}
	
}
