package week5.day5.assignment;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id: " + id);
	}
	public void getStudentInfo(int id,String Name) {
		System.out.println("Student id: "+ id);
		System.out.println( "Student Name:" + Name);
	}
	public void getStudentInfo(String Email,Long phoneNumber) {
		System.out.println("Student email id: " + Email);
		System.out.println("Student Phone No:" + phoneNumber);
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(18785);
		info.getStudentInfo(18785,"Yaswanth");
		info.getStudentInfo("yeshwanth01@gmail.com", 885941253l);
	}

}
