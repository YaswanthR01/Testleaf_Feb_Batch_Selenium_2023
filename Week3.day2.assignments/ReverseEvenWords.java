package week3.day2.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test ="I am a software tester";
		String[] msg= test.split(" ");
		for (int i = 0; i < msg.length; i++) {
			if(i%2!=0) {
			char[] even =msg[i].toCharArray();
			for (int j = even.length-1; j >=0 ; j--) {
				System.out.print(even[j]);
				
			}
			
		}
			else {
				
			}
				System.out.print(" ");	
	
		System.out.print(msg[i]+" ");
	}
	}
}
	
