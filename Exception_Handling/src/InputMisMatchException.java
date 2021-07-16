import java.util.*;
class InputMisMatchDemo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);		
	}
}
/*Output
if we enter string instead of integer then it will give exception for that
Shashi
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at InputMisMatchDemo.main(InputMisMatchException.java:7)
*/
