
public class CheckPriority {
	
	public static void main(String[] args){

		Thread1 obj=new Thread1();
		obj.start();
		System.out.println(Thread.currentThread().getName());//main
		System.out.println(Thread.currentThread().getPriority());//5
		System.out.println("In main");
	}

}
