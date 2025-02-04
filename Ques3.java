<<<<<<< HEAD
package Assignment2;

class Vehicle{
	
	void startEngine() {
		System.out.println("Vehicle is starting......");
	}
}
class Car extends Vehicle{
	
	void startEngine() {
		
		System.out.println("Car is starting......");
		System.out.println("-----------------------");
	}
}
class MotorCycle extends Vehicle{
	
	void startEngine() {
		
		System.out.println("MotorCycle is starting......");
		System.out.println("-----------------------");
	}
}
class Ques3{
	
	public static void VehicleTestDrive(Vehicle vehicle) {
		vehicle.startEngine();
	}
	public static void main(String args[]) {
		Vehicle mycar = new Car();
		Vehicle motorcycle = new MotorCycle();
		
		VehicleTestDrive(mycar);
		VehicleTestDrive(motorcycle);
	}
	
=======
package Assignment3;

import java.util.*;

public class Ques3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		//Add five integer elements to the list
		al.add(1);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		
		//Remove the third element
		al.remove(2);
		
		//Update the second element with a new value
		al.set(1, 3);
		
		//Display all the elements using a loop
		for(Integer n : al) {
			System.out.print(n+" ");
		}

	}

>>>>>>> a4860b3 (A3)
}
