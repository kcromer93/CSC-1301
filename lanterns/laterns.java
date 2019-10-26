package lanterns;

/* CS 1301 Lab4 lanterns
 * Kayla Wagner
 */

public class laterns {
	public static void main(String[]args) {
		compLantern();
	}
	public static void base() {
		System.out.println("    *****");
		System.out.println("  *********  ");
		System.out.println("*************");
		
	}
	public static void face() {
		System.out.println("* | | | | | *");
		System.out.println("*************");
	}
	public static void compLantern() {
		base();
		System.out.println();
		base();
		face();
		base();
		System.out.println();
		base();
	}
}
