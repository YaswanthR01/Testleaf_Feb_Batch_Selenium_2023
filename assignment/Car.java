package week2.day1.assignment;

public class Car {

	public void applyBreak() {
		System.out.println("apply break to stop the car");
	}
	public void applyGear() {
		System.out.println("Apply the gear to increase the speed");
	}
	public void switchOnAc() {
		System.out.println("Switch on the Ac");
	}
	public void applyAcclerate() {
		System.out.println("Apply acclerate to raise the speed");
	}
	public static void main(String[] args) {
		Car myCar =new Car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchOnAc();
		myCar.applyAcclerate();
	}
}
