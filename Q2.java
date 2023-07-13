package Activity6th;

import java.util.List;

public class Q2 //create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
{

	public static <T extends Number> void calculateOddEvenSum(List <T> numbers) 
	{
    double evenSum = 0;
    double oddSum = 0;

    for (T number: numbers) // for each number in my numbers list, then:
    {
    	if (number.doubleValue() % 2 == 0) 
    	{
    		evenSum += number.doubleValue();
    	} 
    	else 
    	{
    		oddSum += number.doubleValue();
    	}
    }
    
    System.out.println("Sum of all even numbers: " + evenSum);
    System.out.println("Sum of all odd numbers: " + oddSum);
  }
	
	public static void main(String[] args) 
	{
		List <Integer> integersList = List.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println("Original List of integers: " + integersList);
	    List <Double> doublesList = List.of(74.0, 51.1, 87.5, 98.9, 22.2);
	    System.out.println("Original List of doubles: " + doublesList);
	    List <Long> longsList = List.of(547l, 874l, 877l);
	    System.out.println("Original List of longs: " + longsList);
	    
		System.out.println("==============");
		System.out.println("For the list of integers the result is: ");
		calculateOddEvenSum(integersList);
		System.out.println();
		System.out.println("For the list of doubles the result is: ");
		calculateOddEvenSum(doublesList);
		System.out.println();
		System.out.println("For the list of longs the result is: ");		
		calculateOddEvenSum(longsList);
		

	}

}
