package Activity6th;

import java.util.Arrays;

public class Q3 //create a generic method that takes a list of any type and a target element. 
//It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.
{

	public static <T> int findIndexOfTarget(T[] array, T target)
	{
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i].equals(target))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Integer[] MyArrayInteger = {5, 2, 10, 21, 8, 4};
		System.out.println("My Array of integer numbers is: " + Arrays.toString(MyArrayInteger));
		String[] MyArrayString = {"ABC", "DEF", "GHI", "JKL"};
		System.out.println("My Array of strings is: " + Arrays.toString(MyArrayString));
		System.out.println();
		System.out.println("Target Element = 4, result: " + findIndexOfTarget(MyArrayInteger, 4));
		System.out.println("=====");
		System.out.println("Target Element = 20, result: " + findIndexOfTarget(MyArrayInteger, 20));
		System.out.println("=====");
		System.out.println("Target Element = DEF, result: " + findIndexOfTarget(MyArrayString, "DEF"));
		
		
	}

}
