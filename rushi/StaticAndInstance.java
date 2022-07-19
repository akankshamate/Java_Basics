class AWing{

	static float MaintainanceBill=30000.50f;     //Static Variable
		float LightBill=560.70f;	   //Instance Variable

		void PersonalBill(){		//Instance Method
			System.out.println("Personal Light Bill of A Wing Flat="+LightBill);
		}

		static void ChairManBill(){		//Static method
			System.out.println("Show Total Maintainance Bill of A Wing="+MaintainanceBill);
		}
}

class BWing{

	static float MaintainanceBill=35000.50f;	//Static Variable
		float LightBill=420.70f;		//Instance Variable

		void PersonalBill(){			//Instance method
			System.out.println("Personal Light Bill of B Wing Flat="+LightBill);
		}

		static void ChairManBill(){		//Static method
			System.out.println("Show Total Maintainance Bill of B Wing="+MaintainanceBill);
		}
}
class KrishnaHeights{

	public static void main(String[] args){

		AWing MateHouse=new AWing();
		MateHouse.LightBill=585.76f;

		MateHouse.PersonalBill();//Personal Light Bill of A Wing Flat=585.76
		MateHouse.ChairManBill();//Show Total Maintainance Bill of A Wing=30000.5

		AWing RenuseHouse=new AWing();
		RenuseHouse.LightBill=680.54f;

		RenuseHouse.PersonalBill();//Personal Light Bill of A Wing Flat=680.54
		RenuseHouse.ChairManBill();//Show Total Maintainance Bill of A Wing=30000.5

		BWing JadhavHouse=new BWing();
		JadhavHouse.LightBill=540.00f;

		JadhavHouse.PersonalBill();//Personal Light Bill of B wing Flat=540.0
		JadhavHouse.ChairManBill();//Show Total Maintainance Bill of B Wing=35000.5

		BWing TatheleHouse=new BWing();
		TatheleHouse.LightBill=790.66f;

		TatheleHouse.PersonalBill();//Personal Light Bill of B wing Flat =790.66
		TatheleHouse.ChairManBill();//Show Total Maintainance Bill of B Wing=35000.5
		
		
		JadhavHouse.PersonalBill();//Personal Light Bill of B wing Flat=540.0
		JadhavHouse.ChairManBill();//Show Total Maintainance Bill of B Wing=35000.5
		
		JadhavHouse.PersonalBill();//Personal Light Bill of B wing Flat=540.0
		JadhavHouse.ChairManBill();//Show Total Maintainance Bill of B Wing=35000.5
		
		
	}
}
