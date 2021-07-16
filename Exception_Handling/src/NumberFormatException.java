import java.io.*;
class NumberFormatDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int a = Integer.parseInt(br.readLine());
			
		System.out.println(a);
	}
}
/*Output:
Exception in thread "main" java.lang.NumberFormatException: For input string: "shashi"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at NumberFormatDemo.main(NumberFormatException.java:8)
*/
