
class TryCatchDemo1{

	public static void main(String[] args){
		
		System.out.println("Core2Web");

		try{
			System.out.println(10/0);

		}catch(ArithmeticException e){

			System.out.println("Caught Arithmetic Exception 10/0 here");
		}
		System.out.println("Biencaps");
	}
}
/*Output:
Core2Web
Caught Arithmetic Exception 10/0 here
Biencaps
*/
