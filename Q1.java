package Activity6th;

import java.util.Arrays;

public class Q1 // create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
{
	
	public static <T> boolean checkTwoArrays(T[] array1, T[]array2)
	{
		if(array1.length != array2.length)
		{
			return false;
		}
		
		for(int i = 0; i < array1.length; i++)
		{
			if(!array1[i].equals(array2[i])) //
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Integer[] MyArrayInt1 = {1, 2, 3, 4, 5};
		Integer[] MyArrayInt2 = {1, 2, 3, 4, 5};
		Integer[] MyArrayInt3 = {10, 20, 30, 40, 50};
		
		String [] MyArrayStr1 = {"John", "Mary"};
		String [] MyArrayStr2 = {"Claire", "Maryanne"};
		String [] MyArrayStr3 = {"John", "Mary"};
				
		System.out.println("Original arrays:");
	    System.out.println("MyArrayInt1: " + Arrays.toString(MyArrayInt1));
	    System.out.println("MyArrayInt2: " + Arrays.toString(MyArrayInt2));
	    System.out.println("MyArrayInt3: " + Arrays.toString(MyArrayInt3));
	    System.out.println("MyArrayStr1: " + Arrays.toString(MyArrayStr1));
	    System.out.println("MyArrayStr2: " + Arrays.toString(MyArrayStr2));
	    System.out.println("MyArrayStr3: " + Arrays.toString(MyArrayStr3));	   
	    System.out.println("===========================================");
	    System.out.println();
		System.out.println("Compare MyArrayInt1 and MyArrayInt2: " + checkTwoArrays(MyArrayInt1, MyArrayInt2)); //true
		System.out.println("Compare MyArrayInt1 and MyArrayInt3: " + checkTwoArrays(MyArrayInt1, MyArrayInt3)); //false
		System.out.println();
		System.out.println("Compare MyArrayStr1 and MyArrayStr2: " + checkTwoArrays(MyArrayStr1, MyArrayStr2)); //false
		System.out.println("Compare MyArrayStr1 and MyArrayStr3: " + checkTwoArrays(MyArrayStr1, MyArrayStr3)); //true
	}
	
}
