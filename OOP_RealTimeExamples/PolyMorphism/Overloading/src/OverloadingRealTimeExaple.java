class NewDress{

	void getDress(){

		System.out.println("Western Top");
	}
	void getDress(String Traditional){

		System.out.println(Traditional);
	}
}
class Shopping{

	public static void main(String[] args){

		NewDress s=new NewDress();
		s.getDress();
		s.getDress("Lehenga");
	}
}
/*Output:
Western Top
Lehenga
*/
