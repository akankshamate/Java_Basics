//ThreadDemo3 class have only one public method run()
public class ThreadDemo3 extends Thread{
	
	public void run(){
		
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());//thread-0
		
	}

}
