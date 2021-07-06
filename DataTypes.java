class DataTypesInJava{

	public static void main(String[] args){

		System.out.println("*****Byte Datatype****");
		byte b1=10;
		System.out.println(b1);//10
		byte b2=127;
		System.out.println(b2);//127
		//byte z=128; error: incompatible types: possible lossy conversion from int to byte
		b2++;
		System.out.println(b2);//-128 because this wrap up/round up through range -128 to 127 (Byte Range)
//_____________________________________________________________________________________________________________________
		
		System.out.println("*****Short Datatype****");		
		short s=32767;
		System.out.println(s);//32767
		s++;
		System.out.println(s);////-32768 wrap up/round up through range -32768 to 32767 (Short Range)
		//short y=32768; //error: incompatible types: possible lossy conversion from int to short
//______________________________________________________________________________________________________________________
		
		System.out.println("*****Boolean Datatype****");		
		boolean x=true;
		System.out.println(x);//true
		boolean y=false;
		System.out.println(y);//false
		//boolean z=0;//error:int can not be converted to boolean
//________________________________________________________________________________________________________________________
		
		System.out.println("*****Integer Datatype****");		
		int i=2147483647;
		System.out.println(i);//2147483647
		i++;
		System.out.println(i);//-2147483648 wrap up/round up through range -2147483648 to 2147483647 (Int Range)
		//int y=2147483648; // error: integer number too large: 2147483648
//_____________________________________________________________________________________________________________________
		
		System.out.println("*****Character Datatype****");		
		char c1=65;
		System.out.println(c1);//A ASCII value of 65 is A
		char c2=65535;
		System.out.println(c2);//￿
		c2++;
		c2++;
		System.out.println(c2);//  wrap up/round up through range 0 to 65535 (Char Range)

		char data='a';
		System.out.println(data);//a
		int data1='a';
		System.out.println(data1);//97 ASCII value of a=97
		//char z=65536; // error: incompatible types: possible lossy conversion from int to char
		//char myData="Akanksha";
		//System.out.println(myData);//error: incompatible types: String cannot be converted to char

//_____________________________________________________________________________________________________________________
		
		System.out.println("*****Float Datatype****");	
	
		//float f1=45.9;//error: incompatible types: possible lossy conversion from double to float
		float f=45.9f; // we need to specify f or F at the end of the float no. otherwise it declare f1 as 					double 
		System.out.println(f);//45.9
//_____________________________________________________________________________________________________________________
		
		System.out.println("*****Double Datatype****");		
		double d=45.9;
		System.out.println(d);//45.9
		
		if(f==d)
			System.out.println("Same values");
		else
			System.out.println("Different values");
		//here output is Different values because f is float and d is double.

		double d1=45.9F;
		if(f==d1)
			System.out.println("Same values");
		else
			System.out.println("Different values");
		//here output is same values as d1 is initialised as float value,so f & d1 both are floating values.
//_____________________________________________________________________________________________________________________
		
		long l=1234567891;
		System.out.println(l);//1234567891
		l++;
		System.out.println(l);//1234567892
	
	}
}
