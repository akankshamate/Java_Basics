class GCD{
	 public static void main(String [] args){
		int num1=12,num2=8;
		int gcd=0;
		for(int i=1;i<=num1 && i<=num2;i++){
			if(num1%i==0 && num2%i==0)
				gcd=i;
		}
		System.out.println("GCD of "+num1+" & "+num2+" is "+gcd);
	}
}
/*
GCD of 8 & 12 is 4
*/ 
