package day1;
//使用泛型类实现泛型接口，需要将泛型的声明加在实现类中，并且泛型类和泛型接口必须是同一个类型形参变量
class InterImpl2<T> implements Inter1<T>{

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class example3 {
public static void main(String[] args) {
	Inter1<String> inter=new InterImpl2();
	inter.show("hhahha");
	Inter1<Integer> li=new InterImpl2();
	li.show(555);
}
}
