import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Akanksha");
		hm.put(102, "Kajal");
		hm.put(103, "Mangesh");
		hm.put(104, "Abhishek");
		hm.put(105, "Megha");
		hm.put(103,"x");//old value replaces with new value
		hm.put(106,"Gauri");

		System.out.println(hm);//{101=Akanksha, 102=Kajal, 103=x, 104=Abhishek, 105=Megha, 106=Gauri}
		System.out.println(hm.get(101));//Akanksha
		
		hm.remove(106);//remove pair from hashmap
		System.out.println(hm);//{101=Akanksha, 102=Kajal, 103=x, 104=Abhishek, 105=Megha}
		
		System.out.println(hm.containsKey(102));//true
		System.out.println(hm.containsKey(106));//false
		
		System.out.println(hm.containsValue("Akanksha"));//true
		System.out.println(hm.containsValue("AKANKSHA"));//false
		
		System.out.println(hm.isEmpty());//false
		System.out.println(hm.keySet());//return all the keys as Set
		
		System.out.println(hm.values());//return all the values as Collection
		System.out.println(hm.entrySet());//return all the entries
		
		for(Object i:hm.keySet()) {
			
			System.out.println(i);
		}
		//get all the Entries by using entry
		for(Map.Entry entry:hm.entrySet() ) {
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		//iterator()
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
