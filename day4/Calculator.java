 package week2.day4;

public class Calculator {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void multipleTwoNumbers(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator myCalc =new Calculator();
		myCalc.additionTwoNumber(875, 320);
		myCalc.subtractionTwoNumber(998, 736);
		myCalc.multipleTwoNumbers(54.6, 23);
		myCalc.divideTwoNumber(75.23f,45.3f);
	}

}
