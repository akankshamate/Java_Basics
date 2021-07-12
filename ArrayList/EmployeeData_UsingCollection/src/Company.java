import java.util.ArrayList;

public class Company {
	
	int size=0;
	ArrayList al=null;
	
	public Company(int size) {
		
		this.size=size;
		al=new ArrayList<>();
		
	}
	void createEmployee(String eName,int sal,String id){
		
			Employee eObj=new Employee(eName,sal,id);
			al.add(eObj);
	}
	ArrayList getEmpData() {
		
		return al;
	}

}
