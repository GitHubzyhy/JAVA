package day1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Example02 {
public static void main(String[] args) throws IOException {
	URL url=new URL("https://www.bilibili.com/");
	InputStream input=url.openStream();//创建输入流
	Scanner scan=new Scanner(input);
	scan.useDelimiter("\n");
	while(scan.hasNext()) {
		System.out.println(scan.next());
	}
}
}
