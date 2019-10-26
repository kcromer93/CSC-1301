package forBeeb;

public class MorePractice {
	public static void main(String[]args) {
		//method1(234243,22735226);
		compare(1,2);
		compare(2,1);
		compare(2,2);
	}
	
	//Method1 sums int1 and int2 and prints it out for the user.
	public static void sum(int int1, int int2) {
		System.out.println("Sum of "+ int1+ " and "+int2+": "+ (int1+int2));
	}
	//Method2 compare int1 and int2 and tell the user which is bigger.
	public static void max(int int1, int int2) {
		System.out.println("The Maximum of "+int1+" and " + int2+ " is: "+ Math.max(int1, int2));
	}
	//Method3 tells the user if int 1 is bigger or smaller of the two numbers. If they are equal, it tells us.
	public static void compare(int int1, int int2) {
		if(int1<int2) {
			System.out.println(int1 + " is less than "+int2);
		}
		if(int1>int2) {
			System.out.println(int1 + " is greater than " + int2);
		}
		if(int1==int2) {
			System.out.println(int1 + " is equal to "+int2);
		}
	}
}
