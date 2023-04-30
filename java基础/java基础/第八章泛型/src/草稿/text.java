package 草稿;

import java.util.ArrayList;
import java.util.Collection;

class base<T>{
	public T info;
	public base(T t) {
		this.info=t;
	}
	public T getInfo() {
		return this.info;
	}
}


class text {
public static void main(String[] args) {
base<?> a1=new base<Integer>(666);
System.out.println(a1.getInfo());
a1=new base<String>("jfslkjfsljf");
Collection<Integer> b1=new ArrayList<Integer>();
Collection<Object>b2=new ArrayList<Object>();
Collection<String>b3=new ArrayList<String>();
System.out.println(a1.getInfo());
//GetElem2(b1);
}
public static void GetElem1(Collection<? extends Number> args) {
	System.out.println("欢迎进入通配符上限函数");
}
public static void GetElem2(Collection<? super Number> args) {
	System.out.println("欢迎进入通配符下限函数");
}
}
