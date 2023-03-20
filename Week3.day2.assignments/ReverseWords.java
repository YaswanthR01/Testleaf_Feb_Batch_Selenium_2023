package week3.day2.assignments;

public class ReverseWords {
	public static void main(String[] args) {
		String message = "Yaswanth is           a good man";
		//to using the \\s+ for correcting the spacem
		String[] rev = message.split("\\s+");
		for (int i = 0; i < rev.length; i++) {
			if(i%2!=0) {
				char[] odd = rev[i].toCharArray();
				for (int j =  odd.length-1; j >=0; j--) {
					System.out.print(odd[j]);
					
				}
				
			}
			else {
				System.out.print(" ");
				System.out.print(rev[i] + " ");
			}
		}

	}

}
