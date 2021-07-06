/*A Java Program to perform ArrayList and its operations*/
import java.util.*;  
class Arlist
{  
	public static void main(String args[])
	{  
		ArrayList<String> l=new ArrayList<String>(); //creating ArrayList
		l.add("Jasmine");
		l.add("Kumar");  
		l.add("Anitha");  
		l.add("Mithun"); 
		l.add("Santhosh");
		l.add("Claire");
		l.add("Elisha");
		l.add("Gokul");
		l.add("Yuvaraj");
		l.add("Zerol");
		System.out.println("The Given List:"+l);
		System.out.println("The New list after adding element at specified position:");
		l.add(8,"Tamilarasan");
		System.out.println(l);
		System.out.println("Updated list after removing element at specified position:");
		l.remove(9);
		System.out.println(l);
		System.out.println("Updating element at specified index");
		l.set(9, "Rose");
		System.out.println(l);
		System.out.println("Checking the element is present in list:"+l.indexOf("Lotus"));
		int p=l.indexOf("Lotus");
		System.out.println("The particular element present in the list:"+l.get(9));
		l.get(9);
		System.out.println("The Size of Array List:"+l.size());
		l.size();
		System.out.println("Checking the given element is present in list:" +l.get(6));
		String str=l.get(6);
		/*System.out.println("Remove all elements in list:");
		l.clear();
		System.out.println(l);*/
		Iterator it=l.iterator();  //Iterating through iterator object
		while(it.hasNext())
		{  
			System.out.println(it.next());  
		}  
	}  
}  
