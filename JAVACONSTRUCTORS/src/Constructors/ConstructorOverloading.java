package Constructors;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	//creating two argument constructor
	ConstructorOverloading(int i,String n){
		id=i;
		name=n;
		System.out.println(id+"  "+name+"  "+age);
	}
	//creating three arg constructor
	ConstructorOverloading(int i,String n,int a){
		id=i;
		name=n;
		age=a;
		System.out.println(id+"  "+name+"  "+age);
	}
	//changing the order of parameters
	ConstructorOverloading(String n,int i){
		name=n;
		id=i;
		System.out.println(id+"  "+name+"  "+age);
		
	}
	ConstructorOverloading(int a){
		age=a;
		System.out.println(id+"  "+name+"  "+age);
	}
	/*ConstructorOverloading(int i,String n)_{//same type already existed we cant take it again
		id=i;
		name=n;
		System.out.println(id+"  "+name+"  "+age);
	}*/
	/*void display(){//this is meathod
		System.out.println(id+"  "+name+"  "+age);
	}*/
		
	
	

	public static void main(String[] args) {
	ConstructorOverloading obj1=new ConstructorOverloading(11,"kiran");
	ConstructorOverloading obj2=new ConstructorOverloading(13,"vijay",23);
	ConstructorOverloading obj3=new ConstructorOverloading("mahesh",111);
	ConstructorOverloading obj4=new ConstructorOverloading(25);
	/*obj1.display();
	obj2.display();
	obj3.display();
	obj4.display();*/
	

	}

}
