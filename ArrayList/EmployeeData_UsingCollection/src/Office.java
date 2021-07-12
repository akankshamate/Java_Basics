import java.util.ArrayList;

public class Office {
	
	public static void main(String[] args) {
		
		Company cObj=new Company(2);
		cObj.createEmployee("Akanksha",10000,"a100");
		cObj.createEmployee("Tejaswini",10000,"t100");
		
		ArrayList al2=cObj.getEmpData();
		System.out.println(al2.get(0));
		System.out.println(al2.get(1));
	}
	

}
