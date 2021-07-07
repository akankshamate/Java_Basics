class Bitwise{
	public static void main(String[] args){
		int i1=10,i2=20,ans;
		float f1=10.5f,f2=20.5f;
		double d1=13.80,d2=70.89;
		char c1='a',c2='b';
		long l1=12345,l2=12345,ans1;
		byte b1=1,b2=2;
		short s1=23,s2=25;

		System.out.println("Bitwise AND(&)");
		ans=i1 & i2;
		System.out.println("10 & 20:"+ans);

		/*ans=f1 & f2;
		System.out.println("10.5 & 20.5:"+ans);//error: bad operand types for binary operator '&'

		ans=d1 & d2;
		System.out.println("13.80 & 70.80:"+ans);//error: bad operand types for binary operator '&'*/

		ans=c1 & c2;
		System.out.println("'A' & 'B':"+ans);

	        ans1=l1 & l2;
		System.out.println("12345 & 12345:"+ans1);

		ans=b1 & b2;
		System.out.println("1 & 2:"+ans);

		ans=s1 & s2;
		System.out.println("23 & 25:"+ans);

		//Bitwise OR(|)
		ans=i1 | i2;
		System.out.println("10 | 20:"+ans);

		ans=c1 | c2;
		System.out.println("'A'|'B':"+ans);

		ans1=l1 | l2;
		System.out.println("12345 | 12345:"+ans1);

		ans=b1 | b2;
		System.out.println("1 | 2:"+ans);

		ans=s1 | s2;
		System.out.println("23 | 25:"+ans);

		//Bitwise XOR(^)		
		ans=i1 ^ i2;
		System.out.println("10 ^ 20:"+ans);

		ans=c1 ^ c2;
		System.out.println("'A' ^ 'B':"+ans);

		ans1=l1 ^ l2;
		System.out.println("12345 ^ 12345:"+ans1);

		ans=b1 ^ b2;
		System.out.println("1 ^ 2:"+ans);

		ans=s1 ^ s2;
		System.out.println("23 ^ 25:"+ans);
	}
}
/* Output
Bitwise AND(&)
10 & 20:0
'A' & 'B':96
12345 & 12345:12345
1 & 2:0
23 & 25:17
10 | 20:30
'A'|'B':99
12345 | 12345:12345
1 | 2:3
23 | 25:31
10 ^ 20:30
'A' ^ 'B':3
12345 ^ 12345:0
1 ^ 2:3
23 ^ 25:14
*/
//We can conclude that only float and double values are not used for bitwise operator remaining all are suitable.
