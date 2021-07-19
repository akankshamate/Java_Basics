//Class scenario2 have main method.
public class Scenario2 {
	//main method creates one object of ThreadDemo2 class and calling its methods.
	public static void main(String[] args){

		ThreadDemo2 obj=new ThreadDemo2();//here only Thread is created
		obj.start();//this calls to run method which have no Parameter

		System.out.println(Thread.currentThread().getName());//main
		System.out.println("In main");
		obj.run(10);//this calls to run method which have one integer parameter.
		
	}

}
