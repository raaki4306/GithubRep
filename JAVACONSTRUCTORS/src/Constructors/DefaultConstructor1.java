package Constructors;

class Test{
	int a,b;//variable declaration
	Test()
	{
		int a=10;b=20;
		System.out.println(a);
		System.out.println(b);
	}
}

public class DefaultConstructor1 {

	public static void main(String[] args) {
		Test dc=new Test();//jvm checks is there any default constrctor

	}

}
