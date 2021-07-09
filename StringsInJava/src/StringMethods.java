
public class StringMethods {
	
	public static void main(String[] args){
		
	
		String s1="Akanksha";
		String s2=new String("Akanksha");
		String s3="Mate";
		String s4="Madhavi";
		String s5="AkankshaMate";
		
		//length()
		System.out.println(s1.length());  //8
		System.out.println(s3.length());  //4
		
		//equals()
		System.out.println(s1.equals(s2));  //true because equals method compares whole strings & it has return type boolean
		System.out.println(s2.equals(s3));  //false because both strings are different.

		//CompareTo
				//Scenario1:
				System.out.println(s1.compareTo(s2));  //0 compareTo method returns int value ,0 means Strings are equal

				//Scenario2:		
				System.out.println(s1.compareTo(s3));  //-12 it checks character by character it found differnt character at first i.e. A & M then it returns diffence from their ASCII values i.e. A-M(65-77)=-12
				
				//Scenario3:
				System.out.println(s1.compareTo(s5));  //-4 it checks the length of the string.

				//Scenario4:
				System.out.println(s3.compareTo(s4));  //16 comparing Mate & Madhavi the different characters found at 3rd index i.e. t & d then it returns difference between them t-d(84-68)=16
				
		//Concat()
		s1.concat(s3);   //it concatenates the string as AKankshaMate but we can't store it in any variable so we can't get proper result.
		System.out.println(s1);  //Akanksha 
		System.out.println(s3);  //Mate 

		System.out.println(s1.concat(s3));  //AkankshaMate here the return type of concat method is String so it prints proper concatenated string.
			
	    s1=s1.concat(s3);  //now s1 references to the concatenated string and first reference from Akanksha it gets removed by this.
		System.out.println(s1);  //AkankshaMate 
		
		//indexOf()
		System.out.println(s1.indexOf('s'));  //5
		
		System.out.println(s3.indexOf('e',2));  //3 -from 2rd index onwards it checks the character and then return the index.
		
		System.out.println(s1.indexOf("sha"));  //5
		System.out.println(s2.indexOf("ksha",5));  //-1 because there is no string ksha from 5th index onwards hence it gives false as -1.
		System.out.println(s1.lastIndexOf('k'));  //4 lastIndexOf searches from last character to first
		
		//replace()
		String s6=new String("ABCD");

		System.out.println(s6.replace('C','D'));  //ABDD

		System.out.println(s6);  //ABCD we have to save the result in particular variable so we can see the change in string.

		s6=s6.replace('A','B');  //s6 is now referencing to the replaced string i.e.BBCD & reference from Core2Web has removed.
		System.out.println(s6);  //BBCD
		
		//toUpperCase()
		System.out.println(s2.toUpperCase());  //AKANKSHA
		
		//toLowerCase()
		System.out.println(s2.toLowerCase());  //akanksha
		
		//trim()
		String s7="       Akanksha  ";
		String s8="       Akanksha Mate ";
	
		System.out.println(s7);//       Akanksha  
		System.out.println(s7.trim());//Akanksha trim method removes all begining and ending spaces from string

		System.out.println(s8);  //       Akanksha Mate
		System.out.println(s8.trim());  //Akanksha Mate it can not remove space between two strings.
		
		//SubString
		String s9=s1.substring(3);  //it starts from 3rd index onwards
		System.out.println(s9);  //nkshaMate

		String s10=s2.substring(2,7);  //it starts from 2rd index & ends at 6th index it excuded the 6th index and ends at 6-1th index.  
		System.out.println(s10);  //anksh
		
		//startsWith
		System.out.println(s1.startsWith("Aka"));//true startsWith method returns boolean value.
		System.out.println(s2.startsWith("Aka"));//true it checks starting characters of string
		System.out.println(s3.startsWith("ate"));//false

		//endsWith method
		System.out.println(s2.endsWith("sha"));//true it checks ending characters of string 
		System.out.println(s2.endsWith("kan"));//false
		System.out.println(s3.endsWith("ate"));//true
	}
}
