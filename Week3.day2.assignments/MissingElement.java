package week3.day2.assignments;

public class MissingElement {
	public static void main(String[] args) {
		int [] ms = {1,4,8,2,3,6,7,5,10};
		int sum1=0;
		for (int i = 1; i <=10; i++) {
			sum1=sum1+i;
			
		}
		System.out.println(sum1);
		
		int sum2=0;
		for (int i = 0; i < ms.length; i++) {
			sum2=sum2+ms[i];
			
		}
		System.out.println(sum2);
		
		int sum3= sum1-sum2;
		System.out.println(sum3);
	}
	
	}


