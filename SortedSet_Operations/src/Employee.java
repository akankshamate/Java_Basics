import java.util.SortedSet;

public class Employee implements Comparable<Employee> {
	
	String empName=null;
	int empId=0;
	double sal=0.0;
	
	Employee(String empName,int empId,double sal){
		
		this.empId=empId;
		this.sal=sal;
		this.empName=empName;
		
	}
	public int compareTo(Employee emp) {
		
		return (int)(sal-emp.sal);
	}

}

