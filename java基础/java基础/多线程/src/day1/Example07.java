package day1;
//线程的优先级
public class Example07 {
	public static void main(String[] args) {
		//创建两个线程
		Thread minPriority=new Thread(new Runnable() {
		//用匿名内部类创建的	
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++)
					System.out.println(Thread.currentThread().getName()+"正在输出："+i);
			}
		}
		,"优先级别最低的线程");
		
		//使用lambda表达式简化多线程的创建与调用过程
		Thread maxPriority=new Thread(()->{
			for(int i=0;i<5;i++)
				System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		},"优先级最高的线程");
		minPriority.setPriority(Thread.MIN_PRIORITY);//设置线程的优先级为1
		maxPriority.setPriority(Thread.MAX_PRIORITY);//设置线程的优先级为10,获取cpu时间片的机会越大
		//开启两个线程
		minPriority.start();
		maxPriority.start();
	}

	
}
