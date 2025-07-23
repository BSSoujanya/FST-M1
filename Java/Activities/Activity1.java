package Activities;

public class Activity1 {
	public static void main (String[] args) {
		Car Honda = new Car("Orange", 2015, "Manual", 4,4);
		/*Honda.Color = "Orange";
		Honda.make = 2015;
		Honda.transmission = "Manual";
		Honda.tyres=4;
		Honda.doors=4;*/
				
	Honda.displaycharacteristics();
	Honda.accelerate();
	Honda.brake();
	
	}
}
