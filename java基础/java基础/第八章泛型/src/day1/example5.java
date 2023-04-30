package day1;

import java.util.ArrayList;
import java.util.Collection;

//类型通配符<?>可以匹配任何类型的类型实参
class person<T>{//泛型类
	private T info;
	public person(T t) {
		this.info=t;
	}
	public T getInfo() {
		return info;
	}
}
public class example5 {
public static void main(String[] args) {
	person<?> per=new person<String>("jjj");
	System.out.println(per.getInfo()+"...."+per.getInfo().getClass());
	per=new person<Integer>(1411);
	System.out.println(per.getInfo()+"...."+per.getInfo().getClass());	
	Collection<Number> list1=new ArrayList<Number>();
	Collection<Integer> list2=new ArrayList<Integer>();
	 GetElement(list1);
	 GetElement(list2);
	 Collection<String> list3=new ArrayList<String>();
	//这一步即将错误，GetElement(list3);不是number的子类
     // GetElement(list2);
	 //测试二
	 Collection<Object> list4=new ArrayList<Object>();
	 GetElement1(list4);
	 //GetElement1(list3);不是number的父类
	 
	 
	
}//设定类型通配符的上限，此时传入的类型实参必须是Number类或者它的子类
public static void GetElement(Collection<? extends Number> coll) {System.out.println("成功进入上限修饰方法");}
//设定类型通配符的下限，此时传入的类型实参必须是Number类或者它的父类
public static void GetElement1(Collection<? super Number> coll) {System.out.println("成功进入下限修饰方法");}

}
