
//1. Create a class employee with the following instance variables
public class Employee {
	//Instance Variable - Inside a class and outside a method/const/Block
	long employeeId = 5; 
	String employeeName ="Harish";
	String employeeAddress="pune";
	long employeePhone=32587263872l;
	double basicSalary = 20000;
	double specialAllowance = 250.80d;
	double HRA =1000.50d;
	
//2. Create an overloaded constructor in the employee class, which takes the below
//constructor parameters and initializes them to their respective instance variables.
	
	public Employee(long Id, String Name, String Address, long Phone)
	{
		this.employeeId = Id;
		this.employeeName = Name;
		 this.employeeAddress=	Address;
		this.employeePhone = Phone;
		
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(Address);
		System.out.println(Phone);
		System.out.println("***********");
	
		}
	
public Employee() {
	// TODO Auto-generated constructor stub
}

//3. Create a method calculateSalary in which the salary needs to be calculated 
	
	public void CalculateSalary()
	{
		double Salary;
		Salary = basicSalary + (basicSalary * specialAllowance/100) +(basicSalary * HRA/100);
		System.out.println("The salary of the employee will be :" +Salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Employee e = new Employee(1,"avinash","chennai", 638726325l);
			Employee e1 = new Employee(2,"abhi","bangalore", 638726325l);
			Employee e2 = new Employee(3,"bharathi","hyderabad", 638726325l);
			e.CalculateSalary();
		}
	}

	
	
}
