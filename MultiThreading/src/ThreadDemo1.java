//ThreadDemo1 class extends Thread Class which have run method.
public class ThreadDemo1 extends Thread {
	
	//run() method prints currentThreadName and prints Mate 5 times.It returns nothing.
	public void run(){
		
		System.out.println(Thread.currentThread().getName());//main
		
		for(int i=0;i<5;i++){
			
			System.out.println("Mate");
		}
	}
}
