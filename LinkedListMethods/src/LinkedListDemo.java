import java.util.*;

//Class LinkedListDemo is about LinkedList collection in java.In which Some methods and operations are performing.
public class LinkedListDemo {
	
	public static void main(String[] args) {
			
		LinkedList l=new LinkedList();
		
		//Add elements
		l.add("Akanksha");
		l.add(21);
		l.add(12.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());
		
		//remove()
		l.remove(2);
		System.out.println("After removing 2nd element:"+l);
	
		//Insert
		l.add(3, "Java");
		System.out.println("After insrting element:"+l);
		
		//retriving the value
		System.out.println(l.get(0));
		
		//change the value
		l.set(5, "Z");
		System.out.println("After changing the value:"+l);
		
		//contains()
		System.out.println(l.contains("Java"));//true
		System.out.println(l.contains("Python"));//false
		
		//isEmpty()
		System.out.println(l.isEmpty());//false
		
		//Reading elements from LL using for loop
		for(int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i));
		}
		
		//for each loop
		for(Object e:l) {
			
			System.out.println(e);
		}
		
		//iterator method
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		//addAll()
				LinkedList new_l = new LinkedList();

				new_l.add("Y");
				new_l.add("X");
				new_l.add("Z");
				
				LinkedList l1 = new LinkedList();
				l1.add("A");
				l1.add("B");
				l1.add("C");
				l1.addAll(new_l);
				System.out.println("After Adding new list to existing:"+l1);
		
				//sort()
				System.out.println("Before sorting:"+new_l);
				Collections.sort(new_l);
				System.out.println("After sorting:"+new_l);
				
				//reverse order
				Collections.sort(new_l,Collections.reverseOrder());
				System.out.println("Reverse order:"+new_l);
				
				//addFirst()
				LinkedList animals=new LinkedList();
				animals.add("Dog");
				animals.add("Cat");
				animals.add("Horse");
				
				System.out.println(animals);
				
				animals.addFirst("Tiger");
				animals.addLast("Lion");
				System.out.println(animals);
				
				System.out.println(animals.getFirst());
				System.out.println(animals.getLast());
				
				animals.removeFirst();
				animals.removeLast();
				System.out.println("After removing First and last element"+animals);
	}

}
