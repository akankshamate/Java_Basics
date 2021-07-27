package WorkOnLambda;
import java.io.*;

/**
 * @author akanksha
 * {@code LambdaMain} implements simple lambda Function to check whether the number entered by user
 * is prime number or not.
 * 
 * @see SampleInterface
 * @see PrimeNoInterface
 *
 */
public class LambdaMain {

	/**
	 *In main() Creates object of interfaces SampleInterface and PrimeNoInterface and calling its abstract methods.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
			
		SampleInterface obj1=()-> System.out.println("This is First Lambda Function");
		obj1.sayHello();
			
		SampleInterface obj2=()-> System.out.println("This is Second Lambda Function");
		obj2.sayHello();
			
		System.out.print("Enter a number: ");
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
			
		PrimeNoInterface p1=(a)->{
				
			int count=0;
				
			for(int i=1;i<=a;i++) {
					
				if(a%i==0) {
					count++;
				}
			}
				
			if(count==2) {
				return "Number is Prime";
			}
				
			else {
				return "Number is not prime";
			}
		};
			
		System.out.println(p1.prime(num));
				
	}
}
