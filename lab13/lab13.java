package lab13;

import java.util.Random;
import java.util.Scanner;

public class lab13 { // must include do while loop
	public static void main (String[] args) {
		Random num = new Random();
		int g = num.nextInt(100-1+1)+1;
		System.out.println("Make your guess: ");
		Scanner input = new Scanner(System.in);
		int u = input.nextInt();
	do {
		if(int g <int u) {
			System.out.println("Your guess was too high. Please try again.");
		}else if(int >int ) {
			System.out.println("Your guess was too low. Please try again.");
		}
		
	} while (g == u);
	
	System.out.println("Your guess was correct. Congrats!");
	}
}
