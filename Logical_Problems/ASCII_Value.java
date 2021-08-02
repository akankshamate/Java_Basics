class ASCII{
	public static void main(String[] args){
		String s="abcd";
		int length=s.length();
		for(int i=0;i<length;i++){
			char j=s.charAt(i);
			int ascii=j;
			System.out.println(j+"="+ascii);
		}
	}
}
