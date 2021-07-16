
class InterruptDemo{

	public static void main(String[] args){

		Thread t=new Thread();
		t.start();
		System.out.println("Core2Web");
		t.sleep(5000);
		System.out.println("Biencaps");
	}
}
/*
error: unreported exception InterruptedException; must be caught or declared to be thrown
		t.sleep(5000);

we have to write public static void main(String[] args)throws InterruptedException {

		 }
*/
