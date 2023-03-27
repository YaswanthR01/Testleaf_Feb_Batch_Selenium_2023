package wee6.day1assignments;

public class Automation extends MultipelLanguage{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is a web based application");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java program");
	}
	
    public void ruby() {
		System.out.println("ruby program");
	}
    
    public static void main(String[] args) {
		Automation assignment =new Automation();
		assignment.selenium();
		assignment.java();
		assignment.python();
		assignment.ruby();
	}

}
