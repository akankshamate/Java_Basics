//ThreadDemo2 have two methods name run() and run(int) which is example of overloading scenario
public class ThreadDemo2 extends Thread {
	
	public void run(){
		
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());//thread-0
		
	}
	public void run(int x){
		
		System.out.println("In Parameterised Run method");
		System.out.println(Thread.currentThread().getName());//main
		
	}

}
