package day1;
//同步方法
public class Example12 {
public static void main(String[] args) {
	Ticket2 ticket=new Ticket2();
	//创建并且开启四个线程
	new Thread(ticket,"线程一").start();
	new Thread(ticket,"线程二").start();
	new Thread(ticket,"线程三").start();
	new Thread(ticket,"线程四").start();
	}
}
class Ticket2 implements Runnable{
private int tickets=10;//车票的数量
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			saleTicket();
			if(this.tickets<0) {
				break;
			}
		}
		
		
	}
	//定义的同步方法
private synchronized void saleTicket() {
	if(tickets>0) {
		try {
			Thread.sleep(300);//经过的线程休眠300ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
	}
}
}