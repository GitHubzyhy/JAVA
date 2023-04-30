package day1;

public class Example03 {
public static void main(String[] args)  {
	try {
		int result=divide(4, -2);
		System.out.println(result);
	} catch (Exception e) {//捕获异常
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
//用throws申明抛出的自定义异常，由该方法的调用者进行处理
public static int divide(int x,int y) throws AException {
	if(y<0) {
		throw new AException("除数为负数");//抛出的自定义异常
	}
	int result=x/y;
	return result;
}
}
//自定义异常类必须继承Exception类或其子类
class AException extends Exception{
	public AException() {
		super();//调用Exception的无参构造函数
	}
	public AException(String message) {
		super(message);//调用Exception的有参构造函数
	}
}
