/*
Write a program to check whether given hardcoded char is a vowel or a
consonant.
*/
class LCM{
	public static void main(String[] args){
		int a=10,b=15,lcm=0,max;
		if(a>b)
			max=a;
		else
			max=b;
		while(true){
			if(max%a==0 && max%b==0){
				lcm=max;
				break;
			}
			max++;
		}
		System.out.println("LCM of "+a+" "+b+" is: "+lcm);
	}
}
//LCM of 10 15 is: 30
