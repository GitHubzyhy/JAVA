package System类和Runtime类;

public class example1 {
public static void main(String[] args) {
	//currentTimeMills()用于获取当前系统的时间，返回值类型是long。
	long startTime=System.currentTimeMillis();
	
	
	
	int[] fromArray= {10,11,12,13,14,15};//源数组
	int[] toArray= {20,21,22,23,24,25,26};//目标数组
	System.arraycopy(fromArray, 2, toArray, 3, 4);
	System.out.println("复制后的数组元素为：");
	for(int i=0;i<toArray.length;i++)
		System.out.print(toArray[i]+",");
	long endTime=System.currentTimeMillis();
	System.out.println("这个程序所用的时间为："+(endTime-startTime)+"ms");

}
}
