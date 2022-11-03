package Constructors;

class Write
{	
	int a,b;//variable declaration
}

public class DefaultConstructor2 {

	public static void main(String[] args) {
		Write dk=new Write();//jvm cheks is there any default constructor
		System.out.println(dk.a);
		System.out.println(dk.b);

	}

}
