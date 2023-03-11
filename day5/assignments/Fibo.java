package week3.day5.assignments;

public class Fibo {
	public static void main(String[] args) {
		//given the variables 
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		//iterate the values 1 to 5 
		for (int i = 1; i <=5; i++) {
			//the values will be changed 
			int c=a+b;
			a=b;
			 b=c;
			 System.out.println(c);
		}
	}

}
