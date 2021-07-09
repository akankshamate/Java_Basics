import java.util.*;

public class ArrayMethods {

	public static void main(String[] args) {
		
		//Array Declaration
		
		String[] aArray = new String[5];
		String[] bArray = {"a","b","c", "d", "e"};
		String[] cArray = new String[]{"a","b","c","d","e"};
		
		//Printing an array
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString(intArray);
		 
		// print directly will print reference value
		
		System.out.println(intArray);  // [I@7150bd4d
		
		System.out.println(intArrayString);  // [1, 2, 3, 4, 5]
		
		//Creating ArrayList
		
		String[] stringArray = { "a", "b", "c", "d", "e" };
		
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);  // [a, b, c, d, e]
		
		//contains()
		
		String[] stringArray1 = { "a", "b", "c", "d", "e" };
		boolean b = Arrays.asList(stringArray1).contains("a");
		System.out.println(b);  // true

		//Convert an ArrayList to an Array
		
		String[] stringArray2 = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(stringArray2));
		
		String[] stringArr2 = new String[arrayList.size()];
		arrayList.toArray(stringArr2);
		
		for (String s : stringArr2)
			System.out.println(s);
		
		//Convert an array to a set

		Set<String> set = new HashSet<String>(Arrays.asList(stringArray1));
		System.out.println(set); //[d, e, b, c, a]
		
		//binarySearch()
		
		int intArr[] = { 10, 20, 15, 22, 35 };
		  
        Arrays.sort(intArr);
  
        int intKey = 22;
  
        System.out.println(intKey + " found at index = "+ Arrays.binarySearch(intArr, intKey));  //22 found at index = 3
		
        //sort()
        
        Arrays.sort(intArr);
        
        System.out.println("Integer Array: "+ Arrays.toString(intArr));  //[10, 15, 20, 22, 35]
        
        //fill()
        Arrays.fill(intArr, intKey);
     
        System.out.println("Integer Array on filling: "+ Arrays.toString(intArr));  //[22, 22, 22, 22, 22]

        //equals()
        int arr1[] = { 10, 20, 15, 22, 35 };
        int arr2[] = { 10, 15, 22 };
        int arr3[] = { 10, 20, 15, 22, 35 };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "+ Arrays.equals(arr1, arr2)); //false
        System.out.println("Integer Arrays on comparison: "+ Arrays.equals(arr1, arr3)); //true
        
        //copyOfRange()
        int intArr3[] = { 10, 20, 15, 22, 35 };
        
        // To print the elements in one line
        System.out.println("Integer Array: "+ Arrays.toString(intArr3));
  
        System.out.println("\nNew Arrays by copyOfRange:\n");
  
        // To copy the array into an array of new length
        System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOfRange(intArr3, 1, 4)));
        
        int arrInt[] = { 10, 20, 15, 22, 35 };
        int arrInt1[] = { 10, 20 };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "+ Arrays.compare(arrInt, arrInt1));
    
	}

}
