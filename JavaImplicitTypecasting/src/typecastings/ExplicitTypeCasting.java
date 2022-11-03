package typecastings;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		/*
		 Explicit conversion
		we want to assin a value of a longer datatype to a smaller dataype 
		Conversion of string data into fundamental data
		by using parsexxx method
		*/
		long l=20;
		short s=(short)l;
				System.out.println(s);
				
				String s1="20";
				String s2="10.25f";
				System.out.println(s1+s2); //2010.25 //s1+s2
				
                 int x=Integer.parseInt(s1);
                 float f=Float.parseFloat(s2);
                 System.out.println(x+f);//here we are adding int+float
                  //Conversion of fundamental value into string data
                 //by using valueof(xxx)method present in string class
                 
                 int a=50;
                 String s3=String.valueOf(a);
                 float b=44;
                 String s4=String.valueOf(b);
                 System.out.println(s3+s4);//5044
                 
                 byte bb=30;
                 String s5=String.valueOf(bb);
                 System.out.println(s5);
                 
               
                 
              
                		 
				
				
				

	}

}
