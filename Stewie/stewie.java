/*CS 1301 Lab 4 Stewie
 * Kayla Wagner
*/
public class stewie {
	//this will print the stewie assignment
	public static void main(String []args) {
		header();
		victory();
	}
	//prints opening header line.
	public static void header() {
		System.out.println("//////////////////////");
	}
	//prints five copies of statement
	public static void victory() {
		for(int i=1; i<=5; i++) {
		System.out.println("|| Victory is mine! ||");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
		
	}
}