class WithoutTryCatchDemo{

	public static void main(String[] args){

		System.out.println("Before Exception Occurs");
		TryCatchDemo obj=null;
		obj.fun();
		System.out.println("After Exception Occurs");
	}
	void fun(){
		System.out.println("In fun");
	}
}
/*Before Exception Occurs
Exception in thread "main" java.lang.NullPointerException
	at TryCatchDemo.main(TryCatch1.java:7)
*/
