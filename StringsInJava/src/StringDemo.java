
public class StringDemo {
	
	public static void main(String[] args){
		
		char[] carr= {'M','A','T','E'};//it passes to the constructor of string class 
		String obj= new String(carr);// constructor: String(char[] carr)

		byte[] barr = {100,101,102,103,104};
		String obj1 = new String(barr);//Constructor: String(byte[] barr);

		System.out.println(obj);//MATE String(char[] carr) returns String  
		System.out.println(obj1);//defgh String(byte[] barr) returns ASCII value of the numbers 
		
		String s1="Akanksha";//only referncing on String constant pool-method area
		String s2=new String("Akanksha");//object on heap-ref & on scp without refernce.
		
		String s3="Akanksha";//only referncing on String constant pool-method area
		String s4=new String("Akanksha");//object on heap-ref & on scp without refernce.
		

		System.out.println(s1);//Akanksha
		System.out.println(s2);//Akanksha
		System.out.println(s3);//Akanksha
		System.out.println(s4);//Akanksha

		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s2==s4);//false
		
		s1=s1.intern();//it makes reference to the string constant pool where s2 is referencing. so the address of both Strings are equal and hence it gives true
		System.out.println(s1==s2);//true
		
	}
}
//upto 1.6 the String constant pool is on method area.
//1.7 onwards the String constant pool is on heap in (permanant/old Generation block) 

//there are no duplicate strings in String constant pool by using scp performance increases as well as memory storage decreases as two same strings are referenced to one address only. 


