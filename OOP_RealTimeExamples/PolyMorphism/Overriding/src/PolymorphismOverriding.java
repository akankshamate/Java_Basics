//Method Overriding is achieve in two differnt class which has parent-child relation

class Baba{

	void getProperty(){

		System.out.println("Bunglow");
	}
	void career(){

		System.out.println("Doctor");
	}
	void marry(){

		System.out.println("Ranbir");
	}
}
class Akanksha extends Baba{

	void career(){

		System.out.println("Engineer");
	}
	void marry(){

		System.out.println("Vijay Deverkonda");
	}
}
class Overriding{

	public static void main(String[] args){

		Baba b=new Baba();
		b.getProperty();
		b.career();
		b.marry();

		Akanksha a=new Akanksha();
		a.getProperty();
		a.career();
		a.marry();

		Baba b1=new Akanksha();//we can create reference of parent class
		b1.getProperty();//this methods are overrided by child class's methods.
		b1.career();
		b1.marry();

		//Akanksha a1=new Baba();  error: incompatible types: Baba cannot be converted to Akanksha
						//we can;t create object of a parent class
	}
}
/*Output:
Bunglow
Doctor
Ranbir
Bunglow
Engineer
Vijay Deverkonda
Bunglow
Engineer
Vijay Deverkonda
*/
