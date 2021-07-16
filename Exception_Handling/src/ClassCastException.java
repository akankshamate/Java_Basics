
class ClassCastDemo{
	
	public static void main(String[] args){

		Object o=new Integer(10);
		String s=(String)o;
				
	}
}
/*Output:

Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at ClassCastDemo.main(ClassCastException.java:6)
*/
