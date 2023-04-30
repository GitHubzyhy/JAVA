package day1;
class student{//普通类中有泛型方法
	//静态泛型方法
	public static <T> void staticMethod(T t) {
		System.out.println(t+"..."+t.getClass());//输出t的值和t运行时的类
	}
	//普通泛型方法
	public <T>  void otherMethod(T t) {
		// TODO Auto-generated method stub
		System.out.println(t+"..."+t.getClass());
	}
}
//泛型方法可以在非泛型类中定义，调用的时候可以确定泛型的具体类型
public class example4 extends Object {
public static void main(String[] args) {
	//使用形式一调用静态方法
	student.staticMethod("staticMethod");
	//使用形式二调用静态方法
	student.<String>staticMethod("staticMethod");
	student stu=new student();
	//使用形式一调用普通泛型方法
	stu.otherMethod(666);
	//使用形式二调用普通泛型方法
	stu.<Integer>otherMethod(666);
}
}
