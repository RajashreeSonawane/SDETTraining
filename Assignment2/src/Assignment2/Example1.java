package Assignment2;
import java.util.LinkedList;
import java.util.List;
public class Example1 
{
public static String destCity(List<List<String>> paths)
{
	List<String> outgoingElements=new LinkedList<>();
	List<String> incomingElements=new LinkedList<>();
	for(int i=0; i<paths.size();i++)
	{
		List<String>individualElementsFromPaths=paths.get(i);
		String outgoingElement=individualElementsFromPaths.get(0);
		String incomingElement=individualElementsFromPaths.get(1);
		outgoingElements.add(outgoingElement);
		incomingElements.add(incomingElement);
	}
	for(int i=0; i<outgoingElements.size();i++)
	{
		String incomingElement=incomingElements.get(i);
		if(!outgoingElements.contains(incomingElement))
		{
			return incomingElement;
		}
		}
	return null;
	}
   public static void main(String args[])
    {
	   List<List<String>> testList=new LinkedList<>();
	   List<String> testindividualElementsToList1=new LinkedList<>();
	   testindividualElementsToList1.add("B");
	   testindividualElementsToList1.add("C");
	   List<String> testindividualElementsToList2=new LinkedList<>();
	   testindividualElementsToList2.add("D");
	   testindividualElementsToList2.add("B");
	   List<String> testindividualElementsToList3=new LinkedList<>();
	   testindividualElementsToList3.add("C");
	   testindividualElementsToList3.add("A");
	   testList.add(testindividualElementsToList1);
	   testList.add(testindividualElementsToList2);
	   testList.add(testindividualElementsToList3);
	   String returnDest=destCity(testList);
	   System.out.println(returnDest);
	}
}
