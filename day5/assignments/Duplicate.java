package week3.day5.assignments;

public class Duplicate {
	public static void main(String[] args) {
		
	//find the duplicate number 
	int[] num = {11,23,78,5,71,11,23};
	//iterate the values from 0 to 7
	for (int i = 0; i < num.length; i++) {
		int count=0;
		//open another for loop for check the condition
		for (int j = i+1; j < num.length; j++) {
			//check the 2 for loop 
			if(num[i]==num[j]) {
				
			
			count++;
			if(count>0) {
				System.out.println(num[i]);
			}}
		}
	}
}
}
