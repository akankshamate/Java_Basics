class Occurance{
	 public static void main(String [] args){
		long num1=345669760562l,rem=0;
		int frq=0,num=6;
		long temp=num1;
		while(temp!=0){
			rem=temp%10;
			if(rem==num)
				frq++;
			temp=temp/10;
		}
		System.out.println("The occurrence of "+ num+" in number "+num1+" is "+frq);
	}
}
/*
The occurrence of 6 in number 345669760562 is 4
*/
