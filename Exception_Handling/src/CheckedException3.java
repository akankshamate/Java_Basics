import java.io.*;

class CheckedDemo2{

	public static void main(String[] args){

		try{
			System.out.println(10/0);

		}catch(IOException obj){

			System.out.println("In catch");
		}
	}
}
/*
 error: exception IOException is never thrown in body of corresponding try statement
		}catch(IOException obj){

We can write any Unchecked exception in catch ,but for checked exception we have to write sutaible exception in catch
*/
