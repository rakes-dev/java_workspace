class Vehicle{
	public void drive(){
		System.out.println("Car is running");
	}
}
class Car extends Vehicle{
	public void drive(){
		System.out.println("Repairing a car");
	}
}
class Test{
	public static void main(String[] args){
		Vehicle c = new Car();
		c.drive();
	}
}
