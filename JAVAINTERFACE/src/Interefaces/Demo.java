package Interefaces;

interface Demo1{
	void fun();//public abstract void fun()
	int i=10;  //must be final int
}
interface Demo2{
	void fun1();   //public abstract void fun1()by default
	int j=29;  //must be final
}
interface Demo3{
	final int k=4;
}
interface Demo4 extends Demo1,Demo2,Demo3{  //multiple inheritance
	
	//void sysout();
	
}

public class Demo implements Demo1,Demo2,Demo3{    //multiple inheritance
	
	public void fun(){
		System.out.println("Fun defined in class");
		System.out.println(i);
		
	}
	
	public void fun1(){
		System.out.println("Fun1 defined in class");
		System.out.println(j);
	
	}
   

	public static void main(String[] args) {
		System.out.println("w.r.t  class  ");
		Demo obj=new Demo();
		obj.fun();
		obj.fun1();
		System.out.println();
		
		System.out.println("w.r.t  interface Demo1  ");
		Demo1 obj1=new Demo();
		obj1.fun();
		//obj1.fun1(); fun1() not in Demo1 interface
		System.out.println();
		
		
		Demo2 obj2=new Demo();
		//obj2.fun();//fun() is not in Demo2 interface
		obj2.fun1();
		System.out.println();
		
		System.out.println(k);
		

	}

}
