
class ThrowsDemo{

	public static void main(String[] args)throws NullPointerException{

		System.out.println(10/0);		
	}
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ThrowsDemo.main(RuntimeException.java:6)
When we throws runtime exception it doesn't matter in Code only compile time exceptions are assumed to be thrown
*/
