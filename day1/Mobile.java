package week1.day1;

public class Mobile {

	String mobileBrandName = "Pixel";
	char mobileLogo = 'P';
	short noOfMobilePiece = 20;
	int modelNumber = 2345770;
	long mobileImeiNumber = 753128438;
	float mobilePrice = 59999.50f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
   		Mobile myMobile = new Mobile();
		System.out.println("Brand name  *" + myMobile.mobileBrandName + "*");
		System.out.println("Logo of the Mobile  *" + myMobile.mobileLogo + "*");
		System.out.println("Number of mobiles available   *" + myMobile.noOfMobilePiece + "*");
		System.out.println("Model numer is *" + myMobile.modelNumber + "*");
		System.out.println("Mobile Imei Number is *" +myMobile.mobileImeiNumber + "*");
		System.out.println("Price of the mobile is *" + myMobile.mobilePrice + "*" + " Rupees only");
		System.out.println("Damage status  *" + myMobile.isDamaged + "*");
		
		
	}

}
