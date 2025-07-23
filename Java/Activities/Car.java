package Activities;

public class Car {
	//Class Member Variables
	String Color;
	int make;
	String transmission;
	int tyres;
	int doors;
	
	//Constructor
	public Car(String Color,int make, String transmission, int tyres, int doors) { 
		this.Color = Color;
		this.make = make;
		this.transmission = transmission;
		this.tyres=tyres;
		this.doors=doors;
		
	
			}
		//Class Methods
   public void displaycharacteristics() {
	   System.out.println("Color of the Car: " +Color);
	   System.out.println("Make of the Car: " +make);
	   System.out.println("Transmission of the Car: " +transmission);
	   System.out.println("Number of tyres on the car: " +tyres);
	   System.out.println("Number of doors on the car: " +doors);
   }
   public void accelerate() {
	   System.out.println("Car speed will increase");
   }
   
   public void brake() {
	   System.out.println("Car speed will decrease");
   }
}
