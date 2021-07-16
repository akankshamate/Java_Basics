
class WithoutTryCatch{

	public static void main(String[] args){

		System.out.println("Core2Web");
		System.out.println(10/0);
		System.out.println("Biencaps");
	}
}
/*
Core2Web
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at WithoutTryCatch.main(TryCatch3.java:5)
*/
//here Abnormal termination of program occurs because we didn't use try catch
