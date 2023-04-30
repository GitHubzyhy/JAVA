package 字符串类;

public class example4 {
public static void main(String[] args) {
	//字符串的替换操作
	String s="itcast";
	System.out.println("将it替换成cn.it的结果："+s.replace("it", "cn.it"));
	//字符串去除空格操作
	String s1="    i  t  c  a   s  t     ";
	System.out.println("去除字符串两端的空格后的结果："+s1.trim());
	System.out.println("去除字符串所有空格后的结果"+s1.replace(" ", ""));
	
	
	String str1=new String("String"),str2=new String("String");
	//使用==判断，比较的是两个字符串对象的地址是否相同
	System.out.println(str1==str2);
	//使用equals()判断，比较的是两个字符串的内容是否相等
	System.out.println(str1.equals(str2));
	
	//字符串的截取和分隔操作
	String str3="石家庄-武汉-哈尔滨";
	//字符串的截取操作
	System.out.println("从第5个字符截取到末尾的结果："+str3.substring(4));
	System.out.println("从第5个字符截取到第6个字符的结果："+str3.substring(4,6));
	//字符串的分隔操作：split()方法用于将字符串按照某个字符进行分隔
	System.out.println("分隔后的字符串数组中的元素依次为：");
	String[] strArray=str3.split("-");//将字符串转换为字符数组
	for(int i=0;i<strArray.length;i++)
	{
		if(i!=strArray.length)
			System.out.print(strArray[i]+",");
		else {
			System.out.println(strArray[i]);
		}
	}
}
}
