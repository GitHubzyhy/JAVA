package System类和Runtime类;
class person{
	private String name;
	private int age;
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "姓名："+this.name+"年龄"+this.age;
	}
	public void finalize()throws Throwable{
		System.out.println("对象被释放---》"+this);
	}
}
public class example2 {
public static void main(String[] args) {
	person p=new person("张三",20);
	p=null;//将变量置为null，将其变成垃圾
	System.gc();//进行垃圾回收
	
}
}
