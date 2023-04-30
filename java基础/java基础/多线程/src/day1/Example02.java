package day1;

public class Example02 {

	public static void main(String[] args) {
		// 这里运用了匿名内部类
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("重写run函数的死循环");
				}
			}
		});
		thread.start();//开启线程
		while(true) {
			System.out.println("main函数的死循环");
		}
	}

}
