package Constructors;

class CopyConstruct{
	
	int a,b;//variable declaration
	CopyConstruct()//default constructor
	{
		a=20;b=30;
		System.out.println(a);
		System.out.println(b);
	}
	CopyConstruct(CopyConstruct x)
	//copyconstruct and x is a class reference
	{
		a=x.a;
		b=x.b;
		System.out.println(a);
		System.out.println(b);
	}
	
		
	
}

public class CopyConstructor {

	public static void main(String[] args) {
		
		CopyConstruct obj1=new CopyConstruct();//obj1-a=20,b=30
		CopyConstruct obj2=new CopyConstruct(obj1);//obj2-a=20,b=30

	}

}
