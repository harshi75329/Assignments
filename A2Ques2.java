package Assign2;

abstract class Employee{
	
	String EmpName;
	int EmpID;
	public Employee(String EmpName,int EmpID) {
		this.EmpName=EmpName;
		this.EmpID=EmpID;
	}
	abstract double calculateSalary();
	abstract void displayDetails();
}
class FullTimeEmployee extends Employee{
	
	double Salary;
	public FullTimeEmployee(String EmpName,int EmpID,double Salary) {
		super(EmpName,EmpID);
		this.Salary=Salary;
	}
	double calculateSalary() {
		return Salary;
	}
	void displayDetails() {
		System.out.println("Employee Name : "+EmpName);
		System.out.println("Employee ID : "+EmpID);
		System.out.println("Monthly Salary : "+calculateSalary());
	}
}
class parttimeEmployee extends Employee{
	int hoursWorked;
	double Salaryperhour;
	public parttimeEmployee(String EmpName,int EmpID,int hoursWorked,double Salaryperhour) {
		super(EmpName,EmpID);
		this.hoursWorked=hoursWorked;
		this.Salaryperhour=Salaryperhour;
	}
	double calculateSalary() {
		
		double Salary = hoursWorked*Salaryperhour;
		return Salary;
	}
	void displayDetails() {

		System.out.println("Employee Name : "+EmpName);
		System.out.println("Employee ID : "+EmpID);
		System.out.println("Hours Worked : "+hoursWorked);
		System.out.println("Salary per Hour: "+Salaryperhour);
		System.out.print("Hourly based Salary : "+calculateSalary());
		
	}
}
class A2Ques2{
	
	public static void main(String args[]) {
		Employee obj[] = new Employee[3];
		obj[0] = new parttimeEmployee("Ram",101,5,100);
		obj[1] = new FullTimeEmployee("raheem",102,10000);
		obj[2] = new parttimeEmployee("Ram",101,7,300);
		
		for(Employee emp : obj) {
			
			emp.displayDetails();
		}
	}
}

