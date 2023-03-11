package week3.day5.assignments;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] number= {2,4,7,3,6,5};
		//first ascending the number 
		Arrays.sort(number);
		//iterate the values from o to 7
		for (int i = 0; i < number.length; i++) {
			//here we checking the condition the for loop runs from 0 to 7 its not equal to the 
			//number of i+1
			if(number[i]!=i+1){
			System.out.println(i+1);
			break;
			}
		}
	}

}
