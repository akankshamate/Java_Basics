package WorkOnStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author akanksha
 * {@code StreamObject} contains one main() method which represents Stream-API collection process,   
 * Stream object is basically used for collection /group of object
 */
public class StreamObject {

	/**
	 * @param args
	 * 1.Way is to create an empty Stream by using empty()
	 * 2.way is to passing array/collection to the Stream by using of() method
	 * 3.way is to create Stream by using builder()
	 * 4.way is to passing int[] to IntStream interface method
	 * 5.way is to passing List/Set to the Stream by using asList()
	 */
	public static void main(String[] args) {
		
		//1-empty Stream
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		
		//2-array,object,Collection
		String names[]= {"Akanksha","Kajal","Divya"};
		
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		//3
		Stream<Object> streamBuilder=Stream.builder().build();
		
		//4
		IntStream stream=Arrays.stream(new int[] {2,3,4,5,6});
		stream.forEach(e->{
			System.out.println(e);
		});
		
		//5 List,Set
		List<Integer> list2=Arrays.asList(19,54,30,29,545,256);
		Stream<Integer> stream2=list2.stream();
		stream2.forEach(e->{ System.out.println(e); });

	}

}
