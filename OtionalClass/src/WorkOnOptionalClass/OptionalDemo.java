package WorkOnOptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author akanksha 
 * {@code OptionalDemo} performs the operation on Optional class.
 *
 */
public class OptionalDemo {
	/**
	 * 
	 * @param email
	 * @return Customer type value if entered email is equal to the any of the value 
	 * in customers database info then it will return nothing otherwise it throws Exception.
	 * @throws Exception
	 */
	public static Customer getCustomerByEmailId(String email) throws Exception {
		
		List<Customer> customers=Database.getAll();
		return customers.stream()
				.filter(customer-> customer.getEmail().equals(email))
				.findAny().orElseThrow(()->new Exception("No customer present with this email id"));
	}

	public static void main(String[] args) throws Exception {
		
		Customer customer=new Customer(101,"Akanksha","akanksha@gmail.com"/*null*/,Arrays.asList("9342567497","8234156780"));
		
		//empty()
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		
		/*of()
		Optional<Object> emailOptional1=Optional.of(obj.getEmail());
		System.out.println(emailOptional1);*/
		
		//ofNullable
		Optional<Object> emailOptional2=Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional2);
		
		if(emailOptional2.isPresent()) {
			System.out.println(emailOptional2.get());
		}
		System.out.println(emailOptional2.orElse("default@gmail.com"));
		//System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("Email not present")));
		
		getCustomerByEmailId("abc@gmail.com"); //Exception in thread "main" java.lang.Exception: No customer present with this email id
	
	}

}
