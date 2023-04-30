package day1;

public class Example05 {

	public static void main(String[] args) {
		//用lambda表达式创建多线程
		Thread thread=new Thread(()->{
		while(true) {
			System.out.println("start new thread!");
		}
	});
		thread.start();
	}

}
