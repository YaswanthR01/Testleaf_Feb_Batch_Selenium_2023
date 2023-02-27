package week2.day1.assignment;

public class Mobile {

	public void sendMessage() {
	System.out.println("Send message if your available");
	}
	public void shareDocuments() {
		System.out.println("Share the documents ");
	}
	public void call() {
		System.out.println("If you need me call me at anytime");
	}
	public void captureTheImage() {
		System.out.println("Capture the image in your mobile");
	}
	
	public static void main(String[] args) {
		Mobile myMobile =new Mobile();
		myMobile.sendMessage();
		myMobile.shareDocuments();
		myMobile.call();
		myMobile.captureTheImage();
	}
}	
