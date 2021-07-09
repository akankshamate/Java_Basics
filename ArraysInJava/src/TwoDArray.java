import java.util.*;
public class TwoDArray {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		int marr[][]=new int[3][3];//In two dimensional array there is two subscripts first for rows and second for columns
		
		System.out.println("Enter values in Array:");
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				marr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(marr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//int marr[][]={1,2,3,4,5,6,7,8,9};error: incompatible types: int cannot be converted to int[]

		int marr1[][]={{1,2,3},{4,5,6},{7,8,9}}; // It represents 3 rows and 3 columns
			for(int i=0;i<3;i++){
				
				for(int j=0;j<3;j++){
					
					System.out.print(marr1[i][j]+" ");
				}
				System.out.println();
			}
	}

}
/*Output:
 Enter values in Array:
10
20
30
40
50
60
70
80
90
10 20 30 
40 50 60 
70 80 90 

1 2 3 
4 5 6 
7 8 9 
*/
