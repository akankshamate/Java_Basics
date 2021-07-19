
public class ThreadDemo extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());//Thread-0

		for(int i=0;i<5;i++){
				
			System.out.println("Akanksha");
		}
		
	}
}
