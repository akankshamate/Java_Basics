import java.util.LinkedHashSet;

//LinkedHashSetDemo class represents some basic operations.

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//In HashSet insertion order is not preserved but in LinkedHashSet insertion order is preserved.
		//here also duplicates are not allowed.
		LinkedHashSet lset=new LinkedHashSet();
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		
		System.out.println("LinkedHashSet:"+lset);
		
		LinkedHashSet lset1=new LinkedHashSet();
		System.out.println(lset.hashCode());
		System.out.println(lset1.hashCode());
		
		//addAll
		lset1.addAll(lset);
		System.out.println(lset1);
		
		//all remaining methods are same as HashSet class
		System.out.println(lset.containsAll(lset1));//true
		System.out.println(lset.equals(lset1));//true
		System.out.println(lset.getClass());//class java.util.LinkedHashSet
		lset1.removeAll(lset);
		System.out.println("After removing all elements from lset1:"+lset1);
		
		

	}

}
