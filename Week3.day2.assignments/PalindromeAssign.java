package week3.day2.assignments;
import java.util.Scanner;
public class PalindromeAssign {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your name");
		String msg=name.nextLine();
		char[] character = msg.toCharArray();
		String rev = "";
		for (int i = character.length-1; i >=0 ; i--) {
			rev= rev+character[i];
			
		}
		System.out.println(rev);
		if(msg.equals(rev)) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not a palindrome");
		}
		
		}
	}


