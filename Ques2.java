<<<<<<< HEAD
package Assignment2;

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
class Ques2{
	
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

=======
package Assignment3;

import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//Insert five student records
		map.put(101,"Reshu");
		map.put(102, "Vyshu");
		map.put(103, "Yash");
		map.put(104, "Rama");
		map.put(105, "Jyosh");
		
		//Retrieve and display the name of a student using a specific roll number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rn = sc.nextInt();
		System.out.println(map.get(rn));
		
		//Remove a student entry using a roll number
		System.out.println("Enter roll number that to be removed: ");
		int rn1 = sc.nextInt();
		map.remove(rn1);
		
		//Display all student records
		for(Map.Entry<Integer,String> name : map.entrySet()) {
			System.out.print(name.getValue()+ " ");
		}

	}

}
>>>>>>> a4860b3 (A3)
