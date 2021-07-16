class IndexOutDemo{

	public static void main(String[] args){

		int arr[]=new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;

		System.out.println(arr[2]);

		String s="Shashi";
		System.out.println(s.charAt(7));
	}
}
/*Output:

if we write System.out.println(arr[3]); then
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at IndexOutDemo.main(IndexOutException.java:11)

30
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
	at java.lang.String.charAt(String.java:658)
	at IndexOutDemo.main(IndexOutException.java:14)
*/
