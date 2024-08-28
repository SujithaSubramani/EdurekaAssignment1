
public class Boss extends Employee{
	long employeeId = 10001; 
	String employeeName = "Ankit";
	String employeeAddress =" pune";
	long employeePhone = 32512651426l;
	double Salary= 1278900;
	
public Boss(long Id, String Name, String Address, long Phone)
{
		Id = this.employeeId;
		Name = this.employeeName;
		Address = this.employeeAddress;
		Phone = this.employeePhone;
	
		System.out.println("The Employees Id is :" + super.employeeId);
		System.out.println("The Employees Name is :" + super.employeeName);
		System.out.println("The Employees Address is :" + super.employeeAddress);
		System.out.println("The Employees phoneno is :" + super.employeePhone);
		System.out.println("**********");
		// printing the instance variable
		System.out.println("The Boss Id is :" +Id);
		System.out.println("The Boss Name is :" +Name);
		System.out.println("The Boss Address is :" +Address);
		System.out.println("The Boss Phone is :" +Phone);
		System.out.println("**********");
}

}