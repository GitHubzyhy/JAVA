package System类和Runtime类;

import java.io.IOException;

public class example3 {
public static void main(String[] args) throws IOException, InterruptedException {
	Runtime rt=Runtime.getRuntime();//本身的构造方法是私有的，只能通过这个静态方法获取其实例
	System.out.println("处理器的个数: "+rt.availableProcessors()+"个");
	System.out.println("空闲内存："+rt.freeMemory()/1024/1024+"MB");
	System.out.println("最大可用内存量："+rt.maxMemory()/1024/1024+"MB");
	System.out.println("内存总量："+rt.totalMemory()/1024/1024+"MB");
	
	//打开记事本
	 Process  process= rt.exec("notepad.exe");
	 Thread.sleep(3000);
	 process.destroy();
}
}
