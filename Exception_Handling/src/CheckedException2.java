import java.io.*;

class CheckedDemo1{

	public static void main(String[] args){

		try{
			System.out.println("Hello");

		}catch(ArithmeticException obj){

			System.out.println("In catch");
		}
	}
}
/*
Hello
*/
