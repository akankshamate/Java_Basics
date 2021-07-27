package WorkOnStream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author akanksha
 * {@code MappingCities} Perform operation on Map which has Integer key(rtoCode)
 * and String value(City Name)
 *   
 * @see City
 *
 */
public class MappingCities {

	public static void main(String[] args) {
		
		Map<Integer,String> mhCity =new HashMap<Integer,String>();
		
		City obj1=new City(12,"Pune");
		City obj2=new City(11,"Satara");
		City obj3=new City(9,"Kolhapur");
		City obj4=new City(43,"Navi Mumbai");
		City obj5=new City(4,"Thane");
		City obj6=new City(15,"Nashik");
		City obj7=new City(19,"Aurangabad");
		
		mhCity.put(obj1.getRTOCode(), obj1.getCityName());
		mhCity.put(obj2.getRTOCode(), obj2.getCityName());
		mhCity.put(obj3.getRTOCode(), obj3.getCityName());
		mhCity.put(obj4.getRTOCode(), obj4.getCityName());
		mhCity.put(obj5.getRTOCode(), obj5.getCityName());
		mhCity.put(obj6.getRTOCode(), obj6.getCityName());
		mhCity.put(obj7.getRTOCode(), obj7.getCityName());
		
		//Calling member function of City class display() by using entrySet() 
		for(Map.Entry<Integer, String> city:mhCity.entrySet()){
			
			City obj=new City(city.getKey(),city.getValue());
			obj.display();
		}
		
		System.out.println("____________________________________");
		
		//by using Stream forEach() loop
		System.out.println("RTO Code: City");
		mhCity.entrySet().stream().forEach(System.out::println);
		
		System.out.println("____________________________________");
		
		//by using Stream sorted() method to sort the cities by RTO code wise.
		System.out.println("Sorted Cities by their RTO Code");
		mhCity.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}
