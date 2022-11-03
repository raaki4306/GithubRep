package typecastings;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// implicit conversion
		//when we assign a value of smaller datatype to a big datatype
		//numeric datatypes are compatible with each other, 
		//but numeric type to char or boolean not
		
		//int,short,byte,long
		//float f1;//automatically converts int to float
		
		short s=10;//2 bytes
		float a=s;//4 bytes     //implicit typecasting
		System.out.println(a);
		
		
		float f=10.25f;//float 4 bytes
		long l=(long)f;//explicit typecasting long 8bytes
				System.out.println(l);
				//long won't accept decimal value
				short s1=(short)l;//long 8bytes and short 2 bytes
				System.out.println(s1);

	}

}
