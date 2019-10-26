package forBeeb;
//	Name
//	Date
//	Assignment
//	ClassName
//	Professor

public class Methods {
	public static void main (String []args) { 
		byte byte1 = 1;
		short short1 = 11115;
		int int1 = 3;
		long long1 = 7;
		float float1 = 1.5f;
		double double1 = 98.5555555557;
		char char1 = 'J';
		
		char char2 = (char)((byte)char1 + byte1);
		boolean boolean1 = false;
		//Sample outputs of values
	    System.out.println(char2);
		
		System.out.println("Byte1: "+ byte1);
	    System.out.println("Short1: "+short1);
	    System.out.println("Int1: "+int1);
	    System.out.println("Long1: "+long1);
	    System.out.println("Float1: "+float1);
	    System.out.println("Double1: "+double1);
	    System.out.println("Char1: "+char1);
	    System.out.println("Boolean1: "+boolean1);
	    // Concatination Practice
	    System.out.println(byte1+short1);
	    System.out.println(int1+byte1);
	    System.out.println(long1+short1);
	    System.out.println(int1+float1);
	    System.out.println(double1+float1);
	    System.out.println(""+char1+byte1);
	    // TypeCasting Practice
 	    System.out.println((double)int1);
	    System.out.println((int)double1);
	    System.out.println(method1((int)char1));
				
		
	}
	//Example method1 for TypeCasting
	public static int method1(int exampleInt) {
		return exampleInt+6;
	}
}
