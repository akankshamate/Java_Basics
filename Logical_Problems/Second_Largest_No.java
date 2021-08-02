class SecondLargestNo{
	public static void main(String[] args){
		SecondLargestNo obj=new SecondLargestNo();
		obj.fun(10,20,30);
		obj.fun(23334,1010,10000);
		obj.fun(1999,2000,1998);
	}
		void fun(int a,int b,int c){
			if(a>=b && a>=c){
				if(b>=c)
					System.out.println("second largest number is "+b);
				else
					System.out.println("second largest number is "+c);
			}
			else if(b>=a && b>=c){
				if(a>=c)
					System.out.println("second largest number is "+a);
				else
					System.out.println("second largest number is "+c);
			}
			else if(a>=b){
				System.out.println("second largest number is "+a);
			}
			else
				System.out.println("second largest number is "+b);
		}
	
}
/*
second largest number is 20
second largest number is 10000
second largest number is 1999
*/
