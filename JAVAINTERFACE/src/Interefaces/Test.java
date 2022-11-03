package Interefaces;

interface vijay{
	public void fun();
	public void fun1();
}
class Ramu{
	void fun2(){
		System.out.println("This is Ramu");
	}
}
class Sujith{
	void fun4(){
		System.out.println("This is sujith");
	}
}


public class Test extends Ramu implements vijay {//we cannot inherit two classes at a time
	public void fun(){
		System.out.println("THIS IS FUN1");
		
	}
	public void fun1(){
		System.out.println("This is fun2");
	}

	public static void main(String[] args) {
		System.out.println("w.r.t class Test");
		Test obj=new Test();
		obj.fun();
		obj.fun1();
		obj.fun2();
		System.out.println();
		
		System.out.println("w.r.t interfaces");
		vijay obj1=new Test();
		obj1.fun();
		obj1.fun1();
		//obj1.fun2();  it's not in interface
		System.out.println();
		
		System.out.println("w.r.t subclass");
		Ramu obj2=new Ramu();
		obj2.fun2();
		//obj2.fun(); it's an interface 

	}

}
