
public class Employee {
	
	private String eName;
	private int sal;
	private String id;
	
	public Employee(String eName,int sal,String id) {
		
			this.setEname(eName);
			this.setSal(sal);
			this.setId(id);
	}
	public String getEname() {
		return eName;
	}
	public void setEname(String eName) {
		this.eName=eName;
	}

	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String toString() {
		return "Employee Name= "+getEname()+"\nSalary= "+getSal()+"\nEmployee ID= "+getId();
	}
}
