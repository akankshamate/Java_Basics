package WorkOnLambda;

/**
 * @author akanksha
 * {@code PrimeNoInterface} has one abstract method prime(int) which is implemented by class LambdaMain.java
 * using lambda function.
 * 
 */
public interface PrimeNoInterface {
	/**
	 * This method is used to check the given no. is prime or not
	 * @param a
	 * @return String value  if the given no. is prime return "Number is Prime" else return "Number is not Prime.
	 */
	public abstract String prime(int a);
}
