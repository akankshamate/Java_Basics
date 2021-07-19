
public class ChangePriority {
	
	public static void main(String[] args){

		Change obj=new Change();
		obj.start();
		obj.setPriority(7);
		//obj.setPriority(-7);//java.lang.IllegalArgumentException
		//obj.setPriority(11);//java.lang.IllegalArgumentException
		
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		System.out.println("In main");
	}

}
