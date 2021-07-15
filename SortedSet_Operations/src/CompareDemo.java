import java.util.*;

public class CompareDemo {
	
	public static void main(String[] args) {
		
		SortedSet<Employee> s=new TreeSet<Employee>();
		
		s.add(new Employee("Akanksha",10,65000));
		s.add(new Employee("Kajal",11,55000));
		s.add(new Employee("Megha",12,45000));
		s.add(new Employee("Shweta",13,75000));
		s.add(new Employee("Priti",14,85000));
		
		for(Employee obj: s) {
			
			System.out.print(obj.empName+" ");
			System.out.print(obj.empId+" ");
			System.out.println(obj.sal);
			
		}
	}

}
