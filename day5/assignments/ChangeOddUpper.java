package week3.day5.assignments;

public class ChangeOddUpper {
	public static void main(String[] args) {
		String test ="assignment";
		//to break the character we using tocharArray
		char[] msg =test.toCharArray();
		//iterate the values
		for (int i = 0; i < msg.length; i++) {
			//giving the condition to check the its even or odd
			if(i%2!=0) {
				//change the lower case values into upper case
				char upper = Character.toUpperCase(msg[i]);
				System.out.print(upper);
			}
			else {
				System.out.print(msg[i]);
			
			}
	
	}
	}
}

