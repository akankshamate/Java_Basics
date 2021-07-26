package WorkOnStream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

/**
 * @author akanksha 
 * {@code StreamMain1}contains one main() method which prints even number list by using Stream and 
 * without using stream
 * 
 */
public class StreamMain1 {
	
	/**
	 * @param args
	 * This method performing opeartion on lists which fetching even numbers into another list
	 *  without using stream and with using stream.  
	 */
	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>();
		list1.add(2);
		list1.add(10);
		list1.add(28);
		list1.add(69);
		list1.add(100);
		
		List<Integer> list2=Arrays.asList(19,54,30,29,545,256);
		List<Integer> list3=List.of(10,20,30,40);
		
		//Without Stream
		List<Integer> evenList=new ArrayList<>();
		for(int i: list2) {
			
			if(i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println(list2);
		System.out.println(evenList);
		
		//Using Stream
		Stream<Integer> stream=list1.stream(); 
		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> newList1=list3.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList1);
	}

}
