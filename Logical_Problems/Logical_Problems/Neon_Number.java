/*Find whether a number is a Neon number or not. Neon Number -> A
neon number is a number where the sum of digits of square of the number is equal to
the number
e.g. 9 is a Neon number but how?
Square of 9 is 81, and sum of digits of 81 i.e. 8 + 1 is 9 again*/
class NeonNo{
	public static void main(String[] args){
		int num=9;
		int sum=0,rem;
		int square=num*num;
		int temp=square;
		while(temp!=0){
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}	
			if(num==sum)
				System.out.println(num+" is a Neon number");
			else
				System.out.println(num+" is not the Neon number");
	}
}
//9 is a Neon number
//There are only 3 Neon numbers.
//0,1,9
