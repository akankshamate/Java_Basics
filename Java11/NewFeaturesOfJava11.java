
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Optional;



public class NewFeaturesOfJava11 {

	
	public static void main(String[] args){
		
			var userID=1234; //userID => int In java11 we need not to write dataTypes for each and every variable
			
			//Strings
			var country="  India  ";
			var blankStr=" ";
			//repeat(int)
			System.out.println("country.repeat(3)"+country.repeat(3));
			
			//isBlank()
			System.out.println("country.isBlank()"+country.isBlank());//false
			System.out.println("blankStr.isBlank()"+blankStr.isBlank());//true
			
			//Strip()
			System.out.println("country.strip()"+country.strip());//Same as trim() remove white spaces
			System.out.println("country.stripLeading()"+country.stripLeading());//remove whitespaces from start
			System.out.println("country.stripTrailing()"+country.stripTrailing());//remove whitespaces from end
			
			//lines()
			String s=" akanksha \n"
					+ "kaluram \n"
					+ " \n"
					+ "Mate \n";
			s.lines().forEach(System.out::println);
			Stream<String> st= s.lines();
			List<String> list= st.collect(Collectors.toList());
			System.out.println(list);
			
			//Optional.isEmpty()
			Optional o=Optional.of("  ");
			o=o.empty();
			o.ifPresent(a -> System.out.println(a));
			System.out.println(o.isEmpty());//true
			
			Optional l=Optional.of("  ");
			l.ifPresent(b -> System.out.println(b));
			System.out.println(l.isEmpty());//false
			
	}

}
