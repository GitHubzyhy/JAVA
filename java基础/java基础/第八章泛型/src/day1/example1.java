package day1;
//定义一个泛型类Goods
class Goods<T>{
	//类型形参作用于属性的类型
	private T info;
	//类型形参作用于构造方法的参数类型
	public Goods(T info) {
		this.info=info;
	}
	//类型形参作用于方法的参数类型
	 public void setInfo(T info) {
		 this.info=info;
	 }
	 //类型形参作用于方法的返回值类型
	 public T getInfo() {
		 return this.info;
	 }
}
public class example1 {
public static void main(String[] args) {
	Goods goods=new Goods<Integer>(666);
	//getClass获取对象运行时类
	System.out.println(goods.getInfo()+"..."+goods.getInfo().getClass());
	goods.setInfo("热卖商品");
	System.out.println(goods.getInfo()+"..."+goods.getInfo().getClass());
	//类型形参会根据类型实参来确定
}
}
