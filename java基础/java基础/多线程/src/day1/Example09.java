
package day1;
//线程插队
public class Example09 {
public static void main(String[] args) {
	Thread thread=new Thread(()->{
		for(int i=1;i<=8;i++) {
			System.out.println(Thread.currentThread().getName()+"输出："+i);
			}
		
	},"线程1");
	
	thread.start();
	for(int i=1;i<=8;i++) {//主线程
		System.out.println(Thread.currentThread().getName()+"输出："+i);
		if(i==2) {
			try {
				thread.join();//直到thread线程执行完毕，主线程才进入就绪状态
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	System.out.println("————————————————————————————————————————————————————————————————————————————————————————————————————————————");
	method2();
}
public static void method2() {
	Thread thread=new Thread(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=8;i++) {
				try {
					Thread.sleep(1000);//线程休眠1000ms
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"输出："+i);
			}
		}
	},"线程2");
	thread.start();//开启线程
	Thread main1=new Thread (()->{
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"输出： "+i);
			if(i==2) {
				try {
					thread.join(3000);//时间过后，无论是否执行完毕，其他线程都可以与它争夺CPU资源
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	},"第二个主线程");
	main1.start();//开启线程
}
}
