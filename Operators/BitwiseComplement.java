class BitwiseComp{
	public static void main(String[] args){
		int num =10;
		long num1=234567;
		float num2=60.80f;
		double num3=345.90;
		char c='A';
		int ans;

		ans=~num;
		System.out.println("Ans:"+ans);//-11

		long ans1=~num1;
		System.out.println("Ans:"+ans1);//-234568

		/*ans=~num2;
		System.out.println("Ans:"+ans);

		ans=~num3;
		System.out.println("Ans:"+ans);*/
		
		ans=~c;
		System.out.println("Ans:"+ans);//-66
	}
}
//Bitwise Operators can't be use on float and double values.
//so here ~(Complement) is also bitwise operator so we can't use float and double.
//It is only used with int,long,char,short & byte
/*Output:
Ans:-11
Ans:-234568
Ans:-66
*/
