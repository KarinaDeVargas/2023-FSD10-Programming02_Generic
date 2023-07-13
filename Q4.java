package Activity6th;

import java.util.ArrayList;
import java.util.List;

public class Q4 //create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.
{

	public static <T> List <T> toReverseList(List <T> originalList)
	{
		List <T> reversedListArray = new ArrayList <> ();
		
		for(int i = originalList.size() -1; i >= 0; i--)
		{
			reversedListArray.add(originalList.get(i));
		}
		return reversedListArray;
	}
	
	public static void main(String[] args) 
	{
	    List <Integer> studentID = List.of(2001, 8002, 5003, 1004, 4005, 6004);
	    List <String> studentName = List.of("Roger", "Alice", "Caleb", "Clair", "Richard", "Kathy");
	    
	    System.out.println("Original list of student ID: " + studentID);
	    System.out.println("Reversed student ID: " + toReverseList(studentID));
	    System.out.println();
	    System.out.println("Original list of student Name: " + studentName);
	    System.out.println("Reversed student Name: " + toReverseList(studentName));
	}
}
