package 字符串类;

public class example2 {
public static void main(String[] args) {
	String s="ababcdedcba";
	System.out.println("字符串的长度为："+s.length());
	System.out.println("字符串中第一个字符"+s.charAt(0));
	System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
	System.out.println("字符串最后一次出现的位置："+s.lastIndexOf('c'));
}
}
