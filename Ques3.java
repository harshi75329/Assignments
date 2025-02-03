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
	
}
