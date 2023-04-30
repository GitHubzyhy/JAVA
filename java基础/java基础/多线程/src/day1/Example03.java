package day1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
//实现Callable接口创建多线程：
public class Example03 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThread myThread=new MyThread();
		//用FutureTask 封装 MyThread类
		FutureTask<Object> ft=new FutureTask<>(myThread);
		//调用Thread(Runnable target,String name)构造方法创建线程对象
		Thread thread1=new Thread(ft,"thread");//命名
		thread1.start();//启动线程
		// 通过FutureTask对象的方法管理返回值
		System.out.println(Thread.currentThread().getName()+"的返回结果："+ft.get());
		int a=0;
		while(a++<5) {
			System.out.println("main方法正在运行");
		}
		

	}

}
class MyThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call ()方法在执行");
		}
		return i;
	}
	
}
