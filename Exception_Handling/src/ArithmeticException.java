//RuntimeException
class ArithmeticDemo{

	public static void main(String[] args){

		System.out.println("ExceptionDemo");
		System.out.println(10/0);	
	}
}

/*Output:
ExceptionDemo
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ArithmeticDemo.main(ArithmeticException.java:7)
*/
