package CarExample;

import java.util.Optional;
/**
 * 
 * @author akanksha
 * {@code Buyer} has two constructors which assigns value to the instance variable.
 *
 */
class Buyer {
	private Optional<Car> car;
	/**
	 * 
	 * @param c which has Car class return type
	 */
	Buyer(Car c){
		this.car=Optional.of(c);
	}
	Buyer(){
		car=Optional.empty();
	}
	/**
	 * 
	 * @return instance variable value
	 */
	public Optional<Car> getCar() {
		return car;
	}

}
/**
 * 
 * @author akanksha
 * {@code Car} has one enum type variable which assigns a particular value from enum.
 *
 */
class Car {
	private Make make;
	Car(Make make){
		this.make=make;
	}
	/**
	 * @
	 * @return a single element from the Make enum.
	 */
	public Make getMake() {
		return make;
	}
}
//This enum has Cars name as a value.
enum Make{
	RollsRoyce, Ford, Odi, Skoda;
}

/**
 * @author akanksha
 * {@code CarShowRoom} have one main method and one getBuyerCarMake() method which perform operation on Make enum. 
 *
 */
public class CarShowRoom {

	public static void main(String[] args) {
		Buyer obj=new Buyer(new Car(Make.Skoda));
		String make=getBuyerCarMake(obj).map(Make::name).orElse("Unknown value");
		System.out.println(make);
	}
	/**
	 * 
	 * @param buyer
	 * @return value of car name from enum Make
	 */
	public static Optional<Make> getBuyerCarMake(Buyer buyer) {
		return buyer.getCar().map(Car::getMake);
	}

}
