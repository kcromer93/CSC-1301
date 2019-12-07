package shapeLines;
/*Kayla Wagner
 * CSC 1301 lab 5
 */
public class spikey {
	public static void main(String[] args) { 
		flake();
		bottom();
		top();
		flake();
		}
		public static void top() {
			System.out.println("  \\/");
			System.out.println(" \\\\//");
			System.out.println("\\\\\\///");
		}
		public static void bottom() {
			System.out.println("///\\\\\\");
			System.out.println(" //\\\\");
			System.out.println("  /\\");
		}
		public static void flake() {
			top();
			bottom();
		}
	}	


