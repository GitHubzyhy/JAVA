package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;


public class example1 {
	public static void main(String[] args) {
Thread t1=new Thread(()->{
System.out.println("j");},"t1");
Thread t2=new Thread(()->{System.out.println("k");},"t2");
Thread t3=new Thread(()->{System.out.println("l");},"t3");
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
t3.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
t3.start();
	}
}
