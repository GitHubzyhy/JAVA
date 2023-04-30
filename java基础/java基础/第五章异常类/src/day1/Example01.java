package day1;

public class Example01 {
public static void main(String[] args) {
	try {//用于捕获异常
		int result=divide(4, 0);
		System.out.println(result);//异常发生的时候这个语句不会被执行
	}catch (Exception e) {//对异常进行处理
		// TODO: handle exception
		System.out.println("捕获的异常信息为："+e.getMessage());
	return;//用于结束当前方法finally语句还是会执行
	//如果用System.exit(0);finally不会执行，java虚拟机已经推出
	
	}finally {//一般用它处理必须要做的事情吗，比如释放内存
		System.out.println("进入finally代码块");
	}
	System.out.println("程序继续向下执行...");//不会执行因为return
}
public static int divide(int x,int y)throws Exception {//申明该方法有可能发生异常，这样调用者调用时候必须进行异常的处理，否则编译错误！
	int result=x/y;
	return result;
}
}
