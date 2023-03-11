package week3.day5.assignments;
import java.util.Scanner;
public class PalindromeWithUserInput {
	public static void main(String[] args){
	//create a scanner class and import it
		Scanner user =new Scanner(System.in);
		System.out.println("Enter your name");
		String store =user.nextLine();
		//to break the character we using tocharArray
		char[] character=store.toCharArray();
		//create a empty string 
		String rev="";
		//iterate the characters in the decrement method
		for (int i = character.length-1; i >=0 ; i--) {
			//add the empty string in the for loop
			rev=rev+character[i];
		}
		System.out.println(rev);
		//check the user name and reverse name 
		if(user.equals(rev)) {
			//The palindrome will run 
			System.out.println("This is  palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
	}

}
