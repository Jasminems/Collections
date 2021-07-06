/*A Java Program to perform HashMap and its operations*/
import java.util.*;  
class Hashmap
{  
	public static void main(String args[])
	{  
		HashMap<Integer,String> m=new HashMap<Integer,String>();//creating HashMap
		m.put(1,"Jasmine");   
		m.put(2,"Kumar");    
		m.put(3,"Anitha");   
		m.put(4,"Mithun"); 
		m.put(5,"Santhosh");
		m.put(6,"Claire");
		m.put(7,"Elisha");
		m.put(8,"Gokul");
		m.put(9,"Tamilarasan");
		m.put(10,"Zerol");
		System.out.println("StudentID\t Name\t\t");  
		for(Map.Entry m1 : m.entrySet())
		{    
			System.out.println(m1.getKey()+"\t \t"+m1.getValue());  
		}  
		System.out.println("Insert a key value in the map:");
		m.put(11, "Flora");
		System.out.println(m.put(11, "Flora"));
		for(Map.Entry m1 : m.entrySet())
		{    
			System.out.println(m1.getKey()+"\t \t"+m1.getValue());  
		}
		System.out.println("Fetch the value of the key:");
		m.get(5);
		System.out.println(m.get(5));
		System.out.println("Creating a clone/copy of hashmap:");
		m.clone();
		System.out.println(m.clone());
		System.out.println("Check if given key is in the map:");
		m.containsKey(6);
		System.out.println(m.containsKey(6));
		System.out.println("Check if Value is in the map:");
		m.containsValue("Rose");
		System.out.println(m.containsValue("Rose"));
		System.out.println("Check if the map is empty:");
		m.isEmpty();
		System.out.println(m.isEmpty());
		System.out.println("The size of the map is:");
		m.size();
		System.out.println(m.size());
		System.out.println("The keys of the map:");
		m.keySet();
		System.out.println(m.keySet());
		System.out.println("Remove a specific key-value pair in the map:");
		m.remove(7);
		/*System.out.println(m.remove(7));*/
		System.out.println("StudentID\t Name\t\t");
		for(Map.Entry m1 : m.entrySet())
		{    
			System.out.println(m1.getKey()+"\t \t"+m1.getValue());  
		}
		System.out.println("Copy all the elements to the another map:");
		HashMap<Integer,String> m2=new HashMap<Integer,String>();
		m2.putAll(m);
		System.out.println(m2);
		System.out.println("StudentID\t Name\t\t");
		for(Map.Entry m1 : m2.entrySet())
		{    
			System.out.println(m1.getKey()+"\t \t"+m1.getValue());  
		}
}
}