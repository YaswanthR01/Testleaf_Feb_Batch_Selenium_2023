package week5.day5.assignment;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit 500000 in my account");
	}
	public static void main(String[] args) {
		AxisBank account =new AxisBank();
		account.savings();
		account.fixed();
		account.deposit();
	}
	
	

}
