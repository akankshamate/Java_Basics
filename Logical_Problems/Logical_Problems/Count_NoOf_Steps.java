/*Write a java code to count the number of steps required for a number to reduce it to zero.*/
class CountNoOfSteps{
	public static void main(String[] args){
		fun(8);
		fun(123);
	}
	static void fun(int num){
		int count=0,ans=0;  CCCCCCCCCCCCC
		int temp=0;
		if(num%2==0)
			count=num/2;
		else
			temp=num;
			while(temp!=0){
				ans=temp/2;
				count++;
				if(ans%2!=0)
					count++;
				temp=ans;
			}
		System.out.println("num:"+ num+" steps required to reduce it Zero = "count);	
	}

}
/*
num:8 steps required to reduce it Zero = 4
num:123 steps required to reduce it Zero = 12
*/
