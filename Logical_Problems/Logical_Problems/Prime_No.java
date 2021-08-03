/*Write a Program that takes a number as input from and prints only those digits from that number, which are prime.*/
class PrimeNo{
	public static void main(String[] args){
		int num=346,primeNo=0;
		int temp=num;
		while(temp!=0){
			int rem=temp%10;
			int count=0;
			for(int i=1;i<=rem;i++){
				if(rem%i==0){
					count++;
				}
			}
			if(count==2){
				primeNo=rem;
			}
			temp=temp/10;
		}
		System.out.println("The prime digit from the number "+num+" is "+primeNo);
	
	}
}
//The prime digit from the number 346 is 3
