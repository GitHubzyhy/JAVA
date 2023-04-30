package 字符串类;

import java.util.Iterator;

public class example3 {
public static void main(String[] args) {
	String str="abcd";
	System.out.println("将字符串转换为字符数组后的结果：");
	char[] charArray=str.toCharArray();//字符串转换为字符数组
	for (int i = 0; i < charArray.length; i++) {
		if(i!=charArray.length-1)
			System.out.print(charArray[i]+",");
		else 
			System.out.println(charArray[i]);
	}
	System.out.println("将int值转换为String类型之后的结果："+String.valueOf(12));
	System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
	System.out.println("将字符串转换成小写之后的结果："+str.toLowerCase());
}

}
