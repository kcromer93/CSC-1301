package lab14;

/* Kayla Wagner
 * CSC 1301 12.6.19
 */
import java.util.Arrays;

public class lab14_1 {
	public static void main(String[] args) {
		int[] numbers = { 6, 2, 9, 11, 3 };
		percentEven(numbers);
		System.out.println(percentEven(numbers));
	}

	public static double percentEven(int[] numbers) {
		double result = 0.0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			// int count = 0;
			if (numbers[i] % 2 == 0) {
				count++;
			}
		}
		result = (double) count / (numbers.length) * 100.0;

		return result;
	}
}
