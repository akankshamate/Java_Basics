//In java upto version 1.6  we can't write body for methods into interface it will give error
//we have to give only function declaration in interface

interface Yeole{

	//default void CreamRolls(){
		//System.out.println("Own CreamRolls");
	//}
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

		Yeole y1=new BaramatiYeole();
		y1.makingTea();
	}
}
/*Output:
Start at 5 AM
Best Taste
Start at 7 AM
Best Taste
*/
