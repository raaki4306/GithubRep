package Constructors;

class PConstructor{
	
	int a;  //variable declaration
	float b;
	
	PConstructor(int x,float y){     //parameterized constructor
		a=x;
		b=y;
		System.out.println("value of a=" +a);
		System.out.println("value of b=" +b);
	}
	
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		PConstructor obj1=new PConstructor(10,20.12f);
		PConstructor obj2=new PConstructor(20,30.23f);
		PConstructor obj3=new PConstructor(40,40.34f);
		PConstructor obj4=new PConstructor(59,384.34f);
		System.out.println(10+20.3f);

	}

}
