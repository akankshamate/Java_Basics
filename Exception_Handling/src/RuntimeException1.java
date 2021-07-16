
class TryRuntimeDemo{

	int x=10;

	public static void main(String[] args){

		try{
			TryRuntimeDemo obj=null;
			System.out.println(obj.x);

		}catch(NullPointerException e){

			System.out.println("Exception handled");
		}
		System.out.println("After try catch");
	}
}
/*
Exception handled
After try catch
*/
