class Array{
	public static void main(String[] args){
		int a[]={455, 800, 56, 39, 290, 18, 383, 3, 290, 29, 10};
		int b[]={10, 9, 4, 5, 6, 7, 8, 3};
		int c[]={10, 8, 56, 23, 45, 97};
		Array obj=new Array();
		obj.SecondLargestNo(a);
		obj.SecondLargestNo(b);
		obj.SecondLargestNo(c);
	}
	void SecondLargestNo(int a[]){
		int temp;
		int Arraylength=a.length;
		//System.out.println(length);
		for (int i=0;i<Arraylength;i++){
			for(int j=i+1;j<Arraylength;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					//length++;				
				}
			}
		}
		System.out.println("Second Largest no is "+a[Arraylength-2]);
	}

}
/*Second Largest no is 455
Second Largest no is 9
Second Largest no is 56
*/
