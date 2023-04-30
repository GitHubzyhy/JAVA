package day1;
public class text0 {
	public static int a=0;
public static void main(String[] args) {
	a=5;
	 alter(a);//目的想让a发生改变
	 System.out.println(a);
}
public static void alter(int A) {
	A=5;
	a=55;
}
}
