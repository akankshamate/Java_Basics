class Facebook{
	public static void main(String[] args){
		Instagram akankshaa_940=new Instagram();
		Instagram.posts(akankshaa_940);//passing object as an arguement to the static method.
		akankshaa_940.followers();//calling Instance method
	}

}
class Instagram{
	static void posts(Instagram akankshaa_940){ //object is the function parameter. 
		String res=(akankshaa_940 instanceof Instagram)?"akankshaa_940 is belongs to Instagram":"akankshaa_940 is not belongs to Instagram";
		System.out.println(res);//akankshaa_940 is Belongs to Instagram
	}
	void followers(){
		int followersNo=521;
		System.out.println("Followers:"+followersNo);//521
	}

}
/*Output:
akankshaa_940 is Belongs to Instagram
Followers:521
*/
