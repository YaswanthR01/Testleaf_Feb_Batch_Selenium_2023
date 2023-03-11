package week3.day5.assignments;

public class StarPattern {
	public static void main(String[] args) {
		//create a for loop 
		//iterate the values for 0 to 6
		for (int i = 0; i <=6; i++) {
			//open a nested for loop
			//to create another loop and compare to in i loop
			for (int j = 0; j <=i; j++) {
				//print the star pattern and remove the ln to print in same line
				System.out.print("*");
			}
			//to print empty one for the different line
			System.out.println();
		}
	}

}
