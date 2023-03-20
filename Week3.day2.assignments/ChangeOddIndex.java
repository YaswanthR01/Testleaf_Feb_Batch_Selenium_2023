package week3.day2.assignments;

public class ChangeOddIndex {
	public static void main(String[] args) {
		String test ="changeme";
		char[] msg =test.toCharArray();
		for (int i = 0; i < msg.length; i++) {
			if(i%2!=0) {
				char upper = Character.toUpperCase(msg[i]);
				System.out.print(upper);
			}
			else {
				System.out.print(msg[i]);
			
			}
	}
	}
}
