package lab12;
/* Kayla Wagner 
 * CSC 1301 11.15.19
 */
import java.util.Scanner;
import java.util.Random;
public class lab12 {
	public static void main(String []args) {
		Random rand=new Random();
		int a= rand.nextInt(9999-800+1)+800; //(max-min+1)+min. range for var a [800-9999]
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 9: "); //range for var b (user input)[0-9]
		int b=sc.nextInt();
		while(b<0||b>9) {
			System.out.println("Your input is invalid, please try again: ");
			b=sc.nextInt();
		}
		boolean flag=containDigit(a,b);
		System.out.println("my name is KW, and "+a+ " contains " +b+ " : " +flag);
		//rand # %10 to check if input digit included
	}
	public static boolean containDigit(int a, int b) { //rand num%10 to check if input digit included
		boolean flag=false;
		while(a>0) {
			if(a%10==b) {
				flag=true;
				break;
			}else {
				a=a/10; //removes last digit
			}
		}
		return flag;
	}
}
