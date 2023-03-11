package week3.day5.assignments;

import java.util.Scanner;

public class Reverse {
	
		public static void main(String[] args) {
			//create a scanner class
			Scanner user=new Scanner(System.in);
			System.out.println("Enter your name");
			String msg= user.nextLine();
			//break the values using tochararray
			char[] charc = msg.toCharArray();
	        for (int i =0; i <charc.length ; i++) {
	        	if(i%2==0) {
	        		char rev=Character.toUpperCase(charc[i]);
	        		System.out.print(rev);
	        	}
	        	else {
				System.out.print(charc[i]);
			}	
			
		}}
	}


