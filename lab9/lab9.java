package lab9;

import java.util.Scanner;
/* Kayla Wagner CSC 1301 Lab9 
 * 
 */

public class lab9 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter whole word");
		String a=sc.next();
		q4(a);
		q5(a);
		q6(a);
	}
	public static void q4(String word) {
		System.out.println("inside q4:" +word);	
			for(int i=0; i<=word.length()-1;i+=2) {
				System.out.print(word.charAt(i));
				System.out.println(word.charAt(i+1));
			}
	}
	public static void q5(String word) {
		System.out.println("inside q5:" +word);	
		for(int i=0; i<=word.length()-3;i+=3) {
			System.out.print(word.charAt(i));
			System.out.print(word.charAt(i+1));
			System.out.println(word.charAt(i+2));
		}
	}
	public static void q6(String word) {
		System.out.println("inside q6:" +word);	
		for(int i=0; i<=word.length()-4;i+=4) {
			System.out.print(word.charAt(i));
			System.out.print(word.charAt(i+1));
			System.out.print(word.charAt(i+2));
			System.out.println(word.charAt(i+3));
		}
	}
}
