class WrapperClassMethods{
	public static void main(String[] args){

		//AutoBoxing
		int num=100;  
		Integer iObj=Integer.valueOf(num);// Explicitly Conversion into object by using method 
		Integer jObj=num;// Internally Conversion into object

		System.out.println(iObj);//100
		System.out.println(jObj);//100

		Character cObj=Character.ValueOf('A');
		System.out.println(cObj);//A

		Float fObj=Float.valueOf(10.5);
		System.out.println(fObj);//10.5

		//Unboxing
		int i=iObj.intValue();// Prints value from object explicitly by using method
		int j=iObj;// Prints value from object. Here internally conversion Occures.

		System.out.println(i);//100
		System.out.println(j);//100

		char c=cObj.charValue();
		System.out.println(c);//A

		float f=fObj.floatValue();
		System.out.println(f);//10.5

		//Converting Strings to Wrapper Object
		Boolean boolObj1 = new Boolean("TrUe"); // case ignored: true
		Boolean boolObj2 = new Boolean("XX"); // false
		//Character charObj =new Character("C");// error:incompatible types: String cannot be converted to char
		Integer intObj = new Integer("2003");
		Double doubleObj = new Double("3.14");
		
		//Coverting Wrapper Objects to Strings
		String boolStr = boolObj1.toString(); // "true"
		String intStr = intObj.toString(); // "2003"
		String doubleStr = doubleObj.toString(); // "3.14"

		/*Number Format Exception Error
		Integer intObj = new Integer("2003.22");// NumberFormatException
		Long longObj = new Long("3.14"); // NumberFormatException
		*/
	}
}
