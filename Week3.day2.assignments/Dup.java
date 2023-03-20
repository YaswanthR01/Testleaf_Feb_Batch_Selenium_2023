package week3.day2.assignments;

public class Dup {
	public static void main(String[] args) {
		int[] num = {11,23,78,5,71,11,23};
		for (int i = 0; i < num.length; i++) {
			int count=0;
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					
				
				count++;
				if(count>0) {
					System.out.println(num[i]);
				}}
			}
		}
	}

}
