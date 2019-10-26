/*
 * CSC 1301 Lab4 StarFigures 
 * Kayla Wagner
 */
public class StarFigures {
	//this is going print the figure by calling the method
	public static void main(String[] args) {
		figures();
	}
	//prints two lines of five stars
	public static void fiveStar() {
		for(int i=1; i<=2; i++) {
			System.out.println("*****");
		}
	}
	//prints 5 star with cross star
	public static void enhFiveStar() {
		fiveStar();
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
		
	}
	public static void figures() {
		enhFiveStar();
		System.out.println();
		enhFiveStar();
		enhFiveStar();
		System.out.println();
		fiveStar();
	}
}