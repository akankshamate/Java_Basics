
class IPL{

	IPL(){//class name & constructor name is same

		//super();//calls to the construcor of parent class. here for IPL class there is no parent class in that case Object class is the parent class.
		
	}

	String pName="KLRahul"; //instance variable place:heap/object/constructor
	int tRuns20=524;
	static int totalRuns=5230;//Static variable place:Method Area

	void playerInfo(){        //instance method

		System.out.println("Orange cap");
	}	

	public static void main(String[] args){ //static method

		IPL ipl2020=new IPL();
		ipl2020.playerInfo(); //if we have to call instance method from static method then we have to create object & then we can call that method.
		
	}
}
