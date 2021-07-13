//Method Overloading means same function name but different parameters
//it achieve in same class only

class Hospital{

	void getBed(){

		System.out.println("Normal Bed");
	}
	void getBed(String Specific){

		System.out.println(Specific);
	}
}
class Patient{

	public static void main(String[] args){

		Hospital h=new Hospital();
		h.getBed();
		h.getBed("ICU Bed");
	}
}

//in c we cant write same name for two different functions to avoid such redundancy polymorphism comes in picture. 
/*Output:
Normal Bed
ICU Bed
*/


