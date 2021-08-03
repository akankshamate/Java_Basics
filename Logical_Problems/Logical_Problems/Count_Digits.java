/*Write a Java program, take a number (Hardcoded) and print the count of
its digits.*/
class CountDigit{
	public static void main(String[] args){
		
		int num=234,count=0,rem;
		int temp=num;
		
		while(temp!=0){
			rem=temp%10;
			count++;
			temp=temp/10;

		}
		System.out.println("In a No. "+num+" ,number of digits is: "+count);
	}
}
//In a No. 234 ,number of digits is: 3
