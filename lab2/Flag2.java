package lab2_practice;
/**
 * 
 * @author Kayla Wagner
 *
 */
public class Flag2 {
	public static void line1() {
		System.out.println("* * * * * * ==================================");
	}
	public static void line2() {
		System.out.println("==============================================");
	}
	public static void main(String[]args) {
		for(int i = 0;i<9;i++) {
			line1();
		}
		for(int j=0;j<6;j++) {
			line2();
		}
	}
	
}
