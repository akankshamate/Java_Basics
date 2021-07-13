//In java from version 1.7 onwords we can write methods into interface by using default or static keyword.

interface Yeole{

	default void CreamRolls(){

		System.out.println("Own CreamRolls");
	}
	void makingTea(); //this methods are bydefault public abstract
}
class PuneYeole implements Yeole{

	public void makingTea(){

		System.out.println("Start at 5 AM");
		System.out.println("Best Taste");
	}
}
class BaramatiYeole implements Yeole{

	public void makingTea(){

		System.out.println("Start at 7 AM");
		System.out.println("Best Taste");
	}
}
class Sukh{
	public static void main(String[] args){

		//Yeole y=new Yeole(); Error:Yeole is abstract; cannot be instantiated
		Yeole y=new PuneYeole();
		y.makingTea();
		y.CreamRolls();

		Yeole y1=new BaramatiYeole();
		y1.makingTea();
		y1.CreamRolls();
	}
}
/*Output:
Start at 5 AM
Best Taste
Own CreamRolls
Start at 7 AM
Best Taste
Own CreamRolls
*/
