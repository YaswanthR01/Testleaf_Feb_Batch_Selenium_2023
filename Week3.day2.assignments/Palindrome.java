package week3.day2.assignments;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner pal = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=pal.nextLine();
		char[] Character = name.toCharArray();
		String rev="";
		for (int i = Character.length-1; i >=0; i--) {
			rev=rev+Character[i];
		}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("This is Palindrome");
			
		}else {
			System.out.println("this is not a palindrome");
		}
	}

}
