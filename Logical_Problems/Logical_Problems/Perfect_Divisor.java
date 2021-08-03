//Write a Program that accepts an integer from user and prints all of its perfect divisors.
class PerfectDivisor{
	public static void main(String[] args){
		int num=24;
		System.out.print("Perfect Divisors of "+num+" are:");
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.print(i+",");
			}
		}
		System.out.println();
	}
}
//Perfect Divisors of 24 are:2,3,4,6,8,12
