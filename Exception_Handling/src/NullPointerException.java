class NullPointerDemo{

	public static void main(String[] args){

		NullPointerDemo obj=null;//new NullPointerDemo();
		obj.fun();					
	}
	void fun(){

		System.out.println("In fun");
	}
}
/*Output:
Exception in thread "main" java.lang.NullPointerException
	at NullPointerDemo.main(NullPointerException.java:6)
*/
