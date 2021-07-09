import java.io.*;

public class ArrayDemo1 {
	
		public static void main(String[] args)throws IOException{
			
			int jarr[]={10,20,30,40,50};//This is normal array but In java we have to write an array by using object.
			jarr[0]=1;
			jarr[1]=2;
			jarr[2]=3;
			jarr[3]=4;
			jarr[4]=5;
			for(int i=0;i<5;i++){
				
				System.out.println(jarr[i]);
			}
			
			/*int jarr1[]={};
			jarr1[0]=10;
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 
			Java gives memory to the array at the runtime but here we have to specify the 
			*/
			
			int[] arr=new int[5];//This is typical way to declare array in java.
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;
			for(int i=0;i<5;i++){
				
				System.out.println(arr[i]);
			}
		
			int[] akanksha=new int[5];
			System.out.println(akanksha.getClass());//class [I
			
			//getClass() is method of Object class which gives us Class name a particular object.
			
			float[] a=new float[5];//class [F
			System.out.println(a.getClass());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter size of array:");

			int x=Integer.parseInt(br.readLine());
			int[] iarr=new int[x];

			for(int i=0;i<x;i++){
				System.out.print("Enter element "+i+":");
				iarr[i]=Integer.parseInt(br.readLine());
			}

			System.out.println("Array Elements are:");
			for(int i=0;i<iarr.length;i++){ //length method is of Object class
				System.out.println(iarr[i]);
			}
		}

}
/*Output:
1
2
3
4
5
10
20
30
40
50
class [I
class [F
Enter size of array:5
Enter element 0:10
Enter element 1:20
Enter element 2:30
Enter element 3:40
Enter element 4:50
Array Elements are:
10
20
30
40
50
*/
