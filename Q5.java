package Activity6th;

import java.util.ArrayList;
import java.util.List;

public class Q5 //create a generic method that takes two lists of the same type and merges them into a single list. 
//This method alternates the elements of each list.
{

	public static <T> List <T> toMergeLists(List<T> myList1, List<T> myList2)
	{
		List <T> singleList = new ArrayList <> ();
		
		for(int i = 0; i < myList1.size(); i++)
		{
			singleList.add(myList1.get(i));
			singleList.add(myList2.get(i));			
		}		
		return singleList;
	}
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List <Integer> studentID1 = List.of(2001, 8002, 5003, 1004, 4005, 6004);
		List <Integer> studentID2 = List.of(2411, 8855, 5765, 1179, 4123, 6821);
	    List <String> studentName1 = List.of("Roger", "Alice", "Caleb", "Clair", "Richard", "Kathy");
	    List <String> studentName2 = List.of("Aaaaa", "Ggggg", "Cccccc", "Hhhhh", "Zzzzz", "Bbbbbb");
	    
	    System.out.println("Original first list of student ID: " + studentID1);
	    System.out.println("Original second list of student ID: " + studentID2);
	    System.out.println("Merged student ID: " + toMergeLists(studentID1, studentID2));
	    System.out.println();
	    System.out.println("Original first list of student names: " + studentName1);
	    System.out.println("Original second list of student names: " + studentName2);
	    System.out.println("Merged student names: " + toMergeLists(studentName1, studentName2));
	}

}
