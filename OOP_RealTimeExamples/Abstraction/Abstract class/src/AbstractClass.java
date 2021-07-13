//Abstract class is use to hiding the functionality

abstract class BreakOfCar{

	void TypeOfBreak(){

		System.out.println("Disk Break/Drum Break");
	}

	abstract void WorkingOfBreak();
}
class CarInternals extends BreakOfCar{

	void WorkingOfBreak(){

		System.out.println("To stop the car by using xyz electronic gadget");
	}
}
class CarDriving{

	public static void main(String[] args){

		//BreakOfCar b=new BreakOfCar(); We can't create object of abstract class
		CarInternals c=new CarInternals();
		c.TypeOfBreak();
		c.WorkingOfBreak();

		BreakOfCar b1=new CarInternals();
		b1.TypeOfBreak();
		b1.WorkingOfBreak();
	}
}
/*OutPut:
Disk Break/Drum Break
To stop the car by using xyz electronic gadget
Disk Break/Drum Break
To stop the car by using xyz electronic gadget
*/  
