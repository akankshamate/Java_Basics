package WorkOnStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author akanksha
 * {@code StreamMethods} contains one main() methods in which performing different operations on
 * Stream methods.
 * 
 *
 */
public class StreamMethods {

	/**
	 * @param args 
	 *
	 */
	public static void main(String[] args) {
		/* filter(Predicate)
		 * boolean value function
		 * e->e>10
		 */
		
		List<String> names=List.of("Akanksha","Vaibhavi","Pragati","Kajal");
		List<String> stream1=names.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(stream1);
		
		
		/*map(function)
		each element operation
		*/
		List<Integer> numbers=List.of(23,45,12,87,5);
		List<Integer> newNumbers=numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		//forEach()
		names.stream().forEach(System.out::println);
		
		//sorted()
		numbers.stream().sorted().forEach(System.out::println);
		
		//min()
		Integer i=numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min number:"+i);
		
		//max()
		Integer j=numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max number:"+j);
		
		
	}

}
