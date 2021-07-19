
public class Change extends Thread{

	public void run(){
		
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());//Thread-0
		System.out.println(Thread.currentThread().getPriority());//7
		
	}
}
