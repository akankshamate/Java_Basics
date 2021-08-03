//Write a program to check Date is valid or not take user input.
import java.util.*;
class CheckDateIsValidOrNot{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Date: ");
		int d=sc.nextInt();
		System.out.print("Enter Month: ");
		int m=sc.nextInt();
		System.out.print("Enter Year: ");
		int y=sc.nextInt();

		int temp=y;
		int count=0;
		while(temp!=0){
			int rem=temp %10;
			count++;
			temp=temp/10;
		}
		
		if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)){

			if(d>=1 && d<=31 && (count==4))
				System.out.println("Date is valid");
			else
				System.out.println("Date is invalid");
		
		}
		if(m==4 || m==6 || m==9 || m==11){

			if(d>=1 && d<=30 && (count==4))
				System.out.println("Date is valid");
			else
				System.out.println("Date is invalid");
		
		}
		if(m==2 && (d>=1 && d<=29) && (count==4)){
	
			if((y%4==0 && y%100!=0) || (y%400==0))
				System.out.println("Date is valid");
			else
				System.out.println("Date is invalid");
		}
		else if(m==2 && d>29)
			System.out.println("Date is invalid as February has max 29 days!!");
			
	}
}
