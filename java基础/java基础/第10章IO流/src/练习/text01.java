package 练习;

import java.io.File;
import java.util.Iterator;

public class text01 {
public static void main(String[] args) {
File file=new File("C:\\Users\\ZYH\\Documents\\Tencent Files\\2472097408");
text1(file);
System.out.println("删除成功");
}
public static void text1(File file) {
	if(file.exists()) {
		File[] files=file.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				text1(f);
			}
			else {
				System.out.println(f.getName());
				f.delete();
			}
		}
	}
	file.delete();
}
}