package WorkOnOptionalClass;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

/**
 * @author akanksha
 * {@code Database} having all customers data.
 *
 */
public class Database {
	/**
	 * 
	 * @return it returns the List of a customers throgh Stream 
	 */
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101,"Akanksha","akanksha@gmail.com",Arrays.asList("7620235623","2287638041")),
				new Customer(102,"Kajal","kajal@gmail.com",Arrays.asList("9530245693","8887268949")),
				new Customer(101,"Tejaswini","tejaswini@gmail.com",Arrays.asList("8600538620","7482238997")),
				new Customer(101,"Pooja","pooja@gmail.com",Arrays.asList("9890115729","2457520046"))
		).collect(Collectors.toList());
	}

}
