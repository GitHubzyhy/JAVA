package day1;
//使用非范型类实现泛型接口
interface Inter1<T>{
	void show(T t);//默认为（public abstract）
}
class InterImpl1 implements Inter1<String>{
	public void show(String s) {
		System.out.println(s);
	}
}
public class example2 {
public static void main(String[] args) {
	Inter1<String> inter=new InterImpl1();//创建Inter对象的时候类型实参必须是String类型，否则会出现编译错误
    inter.show("hellow");
}

}
