package week2.day4;

public class EmployeeDetails {
	public void EmployeeName(String empName,int empId) {
		System.out.println(empName+empId);
	}
	public void getEmployeeAddress(String empAddress){
		System.out.println(empAddress);
	}
	public void EmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void EmployeeMobileNumber(long mobileNumber) {
		System.out.println(mobileNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails employee =new EmployeeDetails();
		employee.EmployeeName("Yaswanth", 14);
		employee.getEmployeeAddress("Mumbai");
		employee.EmployeeSalary(50000.76);
		employee.EmployeeMobileNumber(9956237879l);
	}

}
