//wrapper classes are objects encapsulating primitive Java types.
class WrapperClass{
	public static void main(String[] args){
		//Numeric Wrapper classes
		//All of the numeric wrapper classes are subclasses of the abstract class Number.
		int i=100;
		Integer iObj=new Integer(i);
		System.out.println("Integer Object:"+iObj);

		float f=100.50f;
		Float fObj=new Float(f);
		System.out.println("Float Object:"+fObj);

		double d=1000.20;
		Double dObj=new Double(d);
		System.out.println("Double Object:"+dObj);

		long l=1234567890;
		Long lObj=new Long(l);
		System.out.println("Long Object:");

		short s=10;
		Short sObj=new Short(s);
		System.out.println("Short Object:"+sObj);

		byte b=20;
		Byte bObj=new Byte(b);
		System.out.println("Byte Object:"+bObj);

		//Character Class implements java.io.Serializable
		char c='A';
		Character cObj=new Character(c);
		System.out.println("Character Object:"+cObj);

		
		
		
	}
}
