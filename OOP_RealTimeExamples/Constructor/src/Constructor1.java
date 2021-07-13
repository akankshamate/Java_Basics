class PuneCity{

	int x=10;
	String str="Akanksha"; //this variables are intializes in constructor

	PuneCity(){ //implicitely call after creating object.

		System.out.println("In no Argument Constructor");
		//x=10;
		//str="AKanksha";
		//In constructor instance variable are getting initialized.
	}
	public static void main(String[] args){

		PuneCity narhe=new PuneCity();//call to the non parameterised constructor. 
	}
}
