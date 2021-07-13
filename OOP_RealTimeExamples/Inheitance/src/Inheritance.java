class BCCI{

	BCCI(){

		System.out.println("In BCCI Constructor");
	}
	int x=10;
	void rules(){

		System.out.println("Rules by BCCI");
	}
}
class IPL extends BCCI{ //here BCCI is the parent class of the IPL class(child class)

	int y=20;
	IPL(){

		//Super();here it call to the parent class constructor i.e. BCCI's constructor
		System.out.println("In IPL Constructor");
	}
	void rulesIPL(){

		System.out.println("Rules of IPL");
	}
}
class Match{

	public static void main(String[] args){

		BCCI obj=new BCCI();//call to the BCCI constructor
		obj.rules();
		//obj.rulesIPL();// error: cannot find symbol. parent class object can't call to the child class's method 
		
		
		IPL obj1=new IPL();//call to the BCCI's constructor as well as IPL's Constructor
		obj1.rules();//child class object can call to the parent class method
		obj1.rulesIPL();
	}
}
/*
In BCCI Constructor
Rules by BCCI
In BCCI Constructor
In IPL Constructor
Rules by BCCI
Rules of IPL
*/
