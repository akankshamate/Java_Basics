import java.util.*;
//Declaration
//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable  
public class MethodsOfArrayList {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();//creating old non-generic arraylist 
		
		ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist
		
		//add()
		list.add("Akanksha");//Adding object in arraylist    
	    list.add("Kajal");    
	    list.add("Teju");    
	    list.add("Pooja");    
	    
	    //Iterating Values
	    Iterator itr=list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }

	    //get() 
	    System.out.println(list.get(0));//Akanksha
	    
	    //set()
	    list.set(3, "Vaibhavi");
	    
	    //sort()
	    Collections.sort(list);
	    for(String name:list) 
	    	System.out.print(name+" "); //Akanksha Kajal Teju Vaibhavi
	    
	    //addAll()
	    ArrayList<String> al=new ArrayList<String>();
	    al.add("Megha");
	    al.add("Rutuja");
	    
	    list.addAll(al);
	    System.out.println("\nAfter adding second List:"+list);//[Akanksha, Kajal, Teju, Vaibhavi, Megha, Rutuja]
	    
	    //remove
	    list.remove(3);
	    System.out.println("After Removing 3rd Index value:"+list);//[Akanksha, Kajal, Teju, Megha, Rutuja]
	    
	    //removeAll
	    list.removeAll(al);
	    System.out.println("After Removing all values from 2nd list:"+list);//[Akanksha, Kajal, Teju]
	    
	    //deleting all elements from list
	    list.clear();
	    System.out.println("After deleting all elements:"+list);//[]
	    
	    //isEMpty()
	    System.out.println("Is ArrayList Empty: "+al.isEmpty()); //false 
	    System.out.println("Is ArrayList Empty: "+list.isEmpty()); //true
	    
	}
	

}
