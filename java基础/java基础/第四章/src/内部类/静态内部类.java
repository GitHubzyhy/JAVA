package 内部类;
class Outer3{
	static int m=1;
	static class Inner{
		int n=1;
		void show() {
			System.out.println("外部静态变量m="+m);
		}
	}
}
public class 静态内部类 {
	public static void main(String[] args) {
	Outer3.Inner outer=new Outer3.Inner();
	outer.show();
	}

}
