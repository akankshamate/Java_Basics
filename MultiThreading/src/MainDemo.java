
public class MainDemo {

	public static void main(String[] args){

		ThreadDemo t=new ThreadDemo();
		t.start();//it calls to start0- private native void start0(); which is called by jvm

		/*
		public void run() {
		
			if (target != null) {
			
	    		target.run();  //here target is ThreadDemo class and then calls to the our run method
	    	}
	    }
		*/
		System.out.println(Thread.currentThread().getName());//main

		for(int i=0;i<5;i++){
				
			System.out.println("Kajal");
		}
	}
}
//We can't Predict the sequence of output in MultiThreading.Every Thread is independent to run or execute hence the output sequence will change after every execution. 
