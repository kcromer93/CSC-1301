package homeworkTwo;
/* Kayla Wagner
 * CSC 1301 HW2 October 2 2019
 */
public class problemTwo {
	public static void main(String [] args) {
		neg5();
		fifty_Five();
		twenty();
		pos5();
	}
	public static void neg5() {
		System.out.println("-5+8*6 = "+ (-5+8*6));
		
	}
	public static void fifty_Five() {
		System.out.println("(55+9)%9 = "+ ((55+9)%9));
	}
	public static void twenty() {
		System.out.println("20+(-3)*5/5 = "+ (20+(-3)*5/5));
	}
	public static void pos5() {
		System.out.println("5+15/3*2-8%3 = "+(5+15/3*2-8%3));
	}
}