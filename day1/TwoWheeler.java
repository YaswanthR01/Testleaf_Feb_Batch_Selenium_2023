package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 428796;
	boolean isPunctured = true;
	String bikeName = "Ktm Rc" ;
	double runningKM = 201999.456;

public static void main(String[] args) {
	TwoWheeler myBike=new TwoWheeler();
	System.out.println(" Bike has " +myBike.noOfWheels + " Wheels ");
	System.out.println(" Bike has " +myBike.noOfMirrors + " Mirrors ");
	System.out.println(" chassisNumber " +myBike.chassisNumber);
	System.out.println(" Bike Name " + " = " +myBike.bikeName);
	System.out.println(" Total " +myBike.runningKM + " Kilometers driven ");
	System.out.println(" Bike is punctured "  +myBike.isPunctured);
}
}
