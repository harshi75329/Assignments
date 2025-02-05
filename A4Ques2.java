package Assignment4;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	
	String empName;
	int age;
	int salary;
	
	public Employee(String empName,int age, int salary) {
		this.empName=empName;
		this.age=age;
		this.salary=salary;
	}
	
	String getEmpName() {
		return empName;
	}
	
	int getAge() {
		return age;
	}
	
	int getSalary() {
		return salary;
	}
}
class A4Ques2{
	
	public static void main(String args[]) {
		
		//List of Employees
		List<Employee> emp = Arrays.asList(
				new Employee("Ram",20,15000),
				new Employee("Anu",25,25000),
				new Employee("Reshu",32,30000),
				new Employee("Ramu",35,50000),
				new Employee("Suresh",40,70000));
		
		//Filtering Employess using streams
		List<Employee> stream = emp.stream()
				.filter(employe -> employe.getAge()>30)
				.collect(Collectors.toList());
		
		List<String> EmpNames = stream.stream()
				.map(Employee::getEmpName)
				.collect(Collectors.toList());
		System.out.println("Employees with age greater than 30 :");
		EmpNames.forEach(System.out::println);
		
		//Average Salary
		double avgsalary = stream.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0.0);
		
		System.out.println("Average Salary : ");
		System.out.println(avgsalary);
	}
}
