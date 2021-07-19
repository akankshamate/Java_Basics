//ThreadLife class have main method
public class ThreadLife {
	//In main method Object is created for ThreadDemo3 and how start method works internally is mentioned in method
	public static void main(String[] args){

		ThreadDemo3 obj=new ThreadDemo3();//Initialisation of new Thread
		obj.start();//Thread Class's method
		
		/*start0(){
			//Native(C/C++) call 
			target.run()//here target is ThreadDemo class & hence it calls to the ThreadDemo run method.
		} 
		*/
		System.out.println(Thread.currentThread().getName());//main
		System.out.println("In main");
	}

}
