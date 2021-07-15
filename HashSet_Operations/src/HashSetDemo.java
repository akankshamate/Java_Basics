import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();//default capacity 16 and Load Factor 0.75
		HashSet hs1=new HashSet(100);
		HashSet hs2=new HashSet(100,(float)0.90);
		HashSet<Integer> hs3=new HashSet<Integer>();
		
		//Add Objects:
		hs.add(100);
		hs.add("Akanksha");
		hs.add(10.6);
		hs.add(true);
		hs.add('A');
		hs.add(null);
		
		System.out.println(hs);//print all objects in random order
	
		//remove()
		hs.remove(10.6);
		System.out.println("After removing element:"+hs);//
	
		//contains
		System.out.println(hs.contains('A'));//true
		System.out.println(hs.contains("xyz"));//false
		
		//isEmpty()
		System.out.println(hs.isEmpty());//false
		
		//Reading object or elements by using for each loop
		for(Object e:hs) {
			
			System.out.println(e);
		}
		
		//Reading objects by using Iterator
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//AddAll()
		HashSet<Integer> evenNumber=new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("HashSet Even Number:"+evenNumber);
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(8);
		
		System.out.println("New HashSet:"+numbers);
		
		//removeAll()
		numbers.removeAll(evenNumber);
		System.out.println("After removing all elements from first hashset"+numbers);
		
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set1);
		System.out.println(set2);
		//union
		//set1.addAll(set2);
		//System.out.println("Union:"+set1);//[1,2,3,4,5]
		
		//set1.retainAll(set2);//it gives common elements
		//System.out.println("Intersection:"+set1);//[3,4,5]
		
		//difference
		//set1.removeAll(set2);
		//System.out.println("Difference:"+set1);//[1,2]
	
		//chcek subset or not
		System.out.println(set1.containsAll(set2));//true
	}
}
