package LogicalProgram;

import java.util.Arrays;

//CompareArrays Program

public class Arraycompare {

	public static void main(String[] args)
	{
		int arr1[]= {10,12,13};
		int arr2[]= {23,34,45};
		int arr3[]= {10,12,13};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println(Arrays.equals(arr2, arr3));
		

	}

}
