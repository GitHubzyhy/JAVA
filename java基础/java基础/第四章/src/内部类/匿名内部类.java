package 内部类;

interface Animal{
  void shout();
}
public class 匿名内部类 {
	public static void main(String[] args) {
  String name="小hua";
  animalShout(new Animal() {
	
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println(name+"喵喵");
	}
});
	}
	public static void animalShout(Animal an)//参数是Animal接口类型
	{
		an.shout();
	}
}
