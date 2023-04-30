package 总结;
class base{
	protected static String name;//为静态属性，只分配一块内存空间被所有对象共享
	private int data;
	//构造代码块优先级2
	{
		System.out.println("构造代码块");
	}
	static {//静态代码块优先级别1，只执行一次
		System.out.println("静态代码块");
		name="姓名";
	}
	
	
	public base() {
		System.out.println("无参构造！");
	}
	public base(int data) {
		this();//this调用无参构造函数只能在构造函数第一行调用，两个构造函数不能相互调用
		System.out.println("有参构造");
		this.data=data;//给成员变量赋值
	}
	public static String getName(){//定义的静态方法，类名.方法名字
		return name;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
public class text {
public static void main(String[] args) {
	base a1=new base(1);//对象名保存在栈内存中，对象属性保存在对应的堆内存中
	System.out.println(base.getName());//调用静态方法
}
}
