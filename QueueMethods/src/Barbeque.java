import java.util.*;


public class Barbeque {

	public static void main(String[] args) {
		Queue<String> bbqLine=new LinkedList<String>();
		bbqLine.add("Akanksha");
		bbqLine.add("Vaibhavi");
		bbqLine.add("Pragati");
		
		System.out.println("Members:"+bbqLine);
		System.out.println("First Member:"+bbqLine.element());
		
		System.out.println("Member which recieve food first:"+bbqLine.peek());
		bbqLine.poll();
		System.out.println("Remaining member in line:"+bbqLine);
		
		System.out.println("Next Member to receive food :"+bbqLine.peek());
		bbqLine.poll();
		System.out.println("Remaining member in line:"+bbqLine);
		
		bbqLine.offer("Kajal");
		System.out.println("One Member added in queue:"+bbqLine);
		
		System.out.println("Next Member to receive food :"+bbqLine.peek());
		bbqLine.poll();
		System.out.println("Remaining member in line:"+bbqLine);
		
		bbqLine.remove();
		System.out.println("Queue is empty now:"+bbqLine);
		
		
		
		
		
		

	}

}
