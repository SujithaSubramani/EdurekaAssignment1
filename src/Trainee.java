
public class Trainee extends Employee{
	long employeeId = 10002; 
	String employeeName = "Manoj";
	String employeeAddress= " Chennai";
	long employeePhone= 53753786121l;
	double Salary = 15000;
	
public Trainee(long Id, String Name, String Address, long Phone)
{
		this.employeeId = Id;
		this.employeeName =Name;
		this.employeeAddress = Address;
		this.employeePhone =Phone;
	
		System.out.println("The Employee Id is :" + super.employeeId);
		System.out.println("The Employee Name is :" + super.employeeName);
		System.out.println("The Employee Address is :" + super.employeeAddress);
		System.out.println("The Employee PhoneNo is :" + super.employeePhone);
		System.out.println("**********");
		// printing the instance variable
		System.out.println("The trainee Id is :" +Id);
		System.out.println("The trainee Name is :" +Name);
		System.out.println("The trainee Address is :" + Address);
		System.out.println("The trainee contactNo is :" + Phone);
		System.out.println("**********");
		
	}
}
