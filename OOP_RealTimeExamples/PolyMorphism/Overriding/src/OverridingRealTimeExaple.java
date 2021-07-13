class Aai{
	void safSafai(){
		System.out.println("Pasara Awarne is Must Before Diwali fest!!");
	}
	void faral(){
		System.out.println("Shankarpalya karnar aahe");
	}
	void rangoli(){
		System.out.println("Thipkyanchi rangoli kadnar");
	}
}
class Akanksha extends Aai{
	void faral(){
		System.out.println("I want Chakali");
	}
	void rangoli(){
		System.out.println("Galicha Rangoli chan diste");
	}
}
class DiwaliFestival{
	public static void main(String[] args){
		Aai a=new Aai();
		a.faral();
		a.rangoli();
		a.safSafai();

		Akanksha a1=new Akanksha();
		a1.faral();
		a1.rangoli();
		a1.safSafai();

		Aai a2=new Akanksha();//we can create reference of parent class
		//this methods are overrided by child class's methods.
		a2.faral();
		a2.rangoli();
		a2.safSafai();
	}
}
/*OutPut:
Shankarpalya karnar aahe
Thipkyanchi rangoli kadnar
Pasara Awarne is Must Before Diwali fest!!
I want Chakali
Galicha Rangoli chan diste
Pasara Awarne is Must Before Diwali fest!!
I want Chakali
Galicha Rangoli chan diste
Pasara Awarne is Must Before Diwali fest!!
*/
