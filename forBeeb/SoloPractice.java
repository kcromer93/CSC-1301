package forBeeb;
// Kayla
//Solo Practice: Explaining Primitives in Java
public class SoloPractice {
	/*
	 * 
	 */
	//First four only cover whole numbers, but are in order by increasing size.
	//First start with byte. Byte is any integer from -128 to 127.
	//used for dealing with smaller numbers
	byte byte1 = 3;
	//Next is short which is 2 bytes. It covers more than a byte but also covers integers. -32,768 to 32,767
	short short1 = 32000;
	//Next is int. Int is the default used since it is made up of 4 bytes. -2,147,483,648 to 2,147,483,647
	int int1 = 2147000000;
	//Next is long. Long is used for numbers larger than int. long is 8 bytes. 
	long long1 = 300000000;
	//To handle decimals, we first use float made up of 4 bytes. Only covers 6-7 sig fig decimals.
	float float1 = 3.14f;
    //For any bigger decimals, use double. It is 8 bytes and covers 15 sig fig decimals. 
	double double1 = 1.1111111;
	//Char deals with a 'character' on the keyboard
	char char1 = 'D';
	//boolean deals with true or false. size is not really defined 
	boolean boolean1 = false;
	//all answers will be printed below
	System.out.println("byte1: "+ byte1);
}
