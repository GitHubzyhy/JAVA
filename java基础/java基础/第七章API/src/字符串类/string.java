package 字符串类;

public class string {
public static void main(String[] args) {
	//每个字符串常量都可以当作一个String类的对象使用
	int len="hellow word".length();
	System.out.println("length:"+len);
	//通过不同的参数构造方法完成String类的初始化
	String str1=new String();//创建的空字符串
	String str2=new String("abcd");
	char[]  Array=new char[] {'D','E','F'};//创建一个字符数组
	String str3=new String(Array);//根据指定的字符数组创建字符串
	byte[] arr= {97,98,99};//创建的一个字节数组
	String str4=new String(arr);//根据指定的字节数组创建字节串
	
	System.out.println("a"+str1+"b");
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	
}
}
