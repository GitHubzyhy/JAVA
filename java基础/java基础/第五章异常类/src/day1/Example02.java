package day1;
public class Example02 {
public static void main(String[] args) {
	int age=-1;
	try {
	printAge(age);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("捕获的异常信息为："+e.getMessage());
	}
}
public static void printAge(int age) throws Exception{
	if(age<0) {
		throw new Exception("输入的年龄有误");//用于方法体内，抛出的一个异常实例
	}else {
		System.out.println("此人的年龄是："+age);
	}
}
}
