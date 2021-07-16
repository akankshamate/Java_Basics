class TryCatchDemo{

	public static void main(String[] args){

		System.out.println("Before Exception Occurs");

		TryCatchDemo obj=null;

		try{
			obj.fun();

		}catch(NullPointerException x){

		}
			
		System.out.println("After Exception Occurs");
	}
	void fun(){

		System.out.println("In fun");
	}
}
/*Output:
Before Exception Occurs
After Exception Occurs
*/
//When we use try catch then Programm will terminate normally
