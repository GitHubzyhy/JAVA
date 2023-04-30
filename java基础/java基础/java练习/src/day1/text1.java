package day1;
abstract class Animal
{
	Animal(int data){
		this.data=data;
	}
	public abstract void shout();//没有方法体
	 int data;
}
public class text1 {
public static void main(String[] args) {
animalShout(new Animal(5) {
	
	@Override
	public void shout() {
		// TODO Auto-generated method stub
	System.out.println("wwww");	
	}
});
}
public static void animalShout(Animal an) {
	an.shout();
}
}

