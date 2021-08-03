//Write a java program to check if the taken number is palindrome or not.
class Palindrome{
	public static void main(String[] args){
		int num=121;
		int sum=0,rem;
		int temp=num;
		while(temp!=0){
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}	
			if(num==sum)
				System.out.println(num+" is a palindrome number");
			else
				System.out.println(num+" is not a palindrome number");
	}
}
//121 is a palindrome number
