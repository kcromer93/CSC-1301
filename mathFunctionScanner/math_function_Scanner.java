package math_function_scanner;
import java.util.Scanner;
	public class math_function_Scanner {
		public static void main(String []args) {
			//math_function();
			Scanner();	
		}	
		public static void Scanner() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a integer: ");
			int a=sc.nextInt();
			System.out.println("your input is: "+a);
			Scanner sc1=new Scanner(System.in);
			System.out.print("Enter a string: ");
			String name=sc1.nextLine();
			System.out.println("your string input is: "+name);
			sc.close();
			sc1.close();
		}

			
		public static void math_function() {
			int a = 1;
			int b = 4;
			int c = 10;
			double e = Math.E;
			System.out.println(e);
			System.out.println("Max value between a and b: "+Math.max(a, b));
			System.out.println("Max value between a and b: "+Math.min(a, b));
			System.out.println("Square root of b is "+Math.sqrt(b));
			System.out.println("power of b is: "+(int)Math.pow(b, a));
			System.out.println("logarithm of b is: "+Math.log(c));//base e
			System.out.println("log10 of b is: "+Math.log10(c));	//base 10
		}
		

	}
