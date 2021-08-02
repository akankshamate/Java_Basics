class LeapYear{
	 public static void main(String [] args){
		int year=2020;
		if((year%4==0 && year%100!=0)||year%400==0)
			System.out.println("Year "+year+" is Leap Year");
		else 
			System.out.println("Year "+year+" is Not Leap Year");
	}
}
/*
Year 2020 is Leap Year
*/
