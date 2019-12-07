package rocket;
/*Kayla Wagner
 * CSC 1301 lab 5
 */
public class rocket {
	public static void main(String[] args) {
	tip();
	square();
	usSquare();
	square();
	tip();
	}
	public static void tip() {
		System.out.println("   /\\        /\\");
		System.out.println("  /  \\      /  \\");
		System.out.println(" /    \\    /    \\");
	}
	public static void square() {
		line();
		for( int i=1; i<=2; i++) {
			System.out.println("|      |  |      |");
		}
		line();
	}
	public static void line() {
		System.out.println("+------+  +------+");
	}
	public static void usSquare() {
		System.out.println("|United|  |United|");
		System.out.println("|States|  |States|");
	}
	}
	
	
