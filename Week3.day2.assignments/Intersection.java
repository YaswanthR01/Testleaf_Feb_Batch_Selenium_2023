package week3.day2.assignments;

public class Intersection {
	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	  
	}

}
