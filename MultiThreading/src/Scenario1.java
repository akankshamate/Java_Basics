//Scenario1 class has one static main method.

public class Scenario1 {
	
	//which creates object of ThreadDemo1 class and then print CurrentThread and next Synerzip printed 5 times. 
	public static void main(String[] args){

		ThreadDemo1 obj=new ThreadDemo1();//here only Thread is created
		
		obj.run();//this calls to user defined run method not method of thread class.
		
		System.out.println(Thread.currentThread().getName());//main
		
		for(int i=0;i<5;i++){
			
			System.out.println("Synerzip");
		}
		
	}

}
//here same sequence of output arrives for each run process.Because No one thread is born. 
/*Output:
main
Mate
Mate
Mate
Mate
Mate
main
Synerzip
Synerzip
Synerzip
Synerzip
Synerzip
*/

