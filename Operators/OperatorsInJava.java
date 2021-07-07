class Operators{
	public static void main(String[] args){
		
		//Arithmetic Operator
		int num1=10,num2=20,ans=0;

		ans=num1 + num2;
		System.out.println("Add="+ans);//Add=30

		ans=num1 - num2;
		System.out.println("Sub="+ans);//sub=-10

		ans=num1 * num2;
		System.out.println("Mult="+ans);//Mult=200

		ans=num1 / num2;
		System.out.println("Div="+ans);//Div=0

		ans=num1 % num2;
		System.out.println("Mod="+ans);//Mod=10
//_____________________________________________________________________________________________________________________
		
		//Assignment Operator
		int a=10;//value 10 is assigning to x
		System.out.println("a="+a);//X=10
		int b=20;
		b+=10;
		System.out.println("b="b);//30
//_____________________________________________________________________________________________________________________
		
		//Unary Operator
		int x=10;
		System.out.println(+x);//10
		System.out.println(-x);//-10
		System.out.println(++x);//11 internally x=x+1
		System.out.println(--x);//10 internally x=x-1
		//System.out.println(!x);//Error:bad operand type int for unary operator '!'
		boolean res=true;
		System.out.println(!res);//false

		int num=10;
		ans=0;
		
		ans=++num;
		System.out.println(ans);//11
		System.out.println(num);//11

		ans=--num;
		System.out.println(ans);//10
		System.out.println(num);//10

		ans=num++;
		System.out.println(ans);//10
		System.out.println(num);//11

		ans=num--;
		System.out.println(ans);//11
		System.out.println(num);//10

		num=10;
		ans=0;
		ans=++num + ++num;//11+12
		System.out.println(ans);//23
		System.out.println(num);//12

		ans=num++ + num++;//12+13
		System.out.println(ans);//25
		System.out.println(num);//14
	}
//_____________________________________________________________________________________________________________________
		//Relational Operator
		num1=10;
		num2=20;
		boolean ans1;
		ans=num1<num2;
		System.out.println("10<20:"+ans1);//returns true
		ans=num1>num2;
		System.out.println("10>20:"+ans1);//returns false
		ans=num1<=num2;
		System.out.println("10<=20:"+ans1);//returns true
		ans=num1>=num2;
		System.out.println("10>=20:"+ans1);//returns false
		ans=num1==num2;
		System.out.println("10==20:"+ans1);//returns false
		ans=num1!=num2;
		System.out.println("10!=20:"+ans1);//returns true
}
