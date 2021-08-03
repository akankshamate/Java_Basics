//Write a program to accept some number and print them in reverse order

class ReverseNo{
	public static void main(String[] args){
		int num=420,count=0;
		int arr[];
		int temp=num;
		int temp1=num;
		while(temp!=0){
			rem=temp%10;
			count++;
			temp=temp/10;	
		}
		while(temp1!=0){
			rem=temp1%10;
			for(int i=0;i<count;i++){
				a[i]=rem;	
			}
			temp1=temp1/10;	
		}
		
		
		
		else
			System.out.println(num+" is not a Prime no ");
	
	}
}
//13 is a Prime no
