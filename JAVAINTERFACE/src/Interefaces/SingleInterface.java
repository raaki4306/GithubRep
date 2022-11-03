package Interefaces;

interface Rama{
	public void sum();
	final int i =5;
}

public class SingleInterface implements Rama{
	public void sum(){
		System.out.println("This is Ramakrishna");
	}
	

	public static void main(String[] args) {
		System.out.println("with respect to main");
		SingleInterface obj=new SingleInterface();
		obj.sum();
		System.out.println();
		
		System.out.println("w.r.t  interface Rama");
		Rama obj1=new SingleInterface();
		obj1.sum();
		System.out.println();
		System.out.println(i);
		
		//Rama obj3=new Rama();//interfaces cannot instantiate

	}
	

}
