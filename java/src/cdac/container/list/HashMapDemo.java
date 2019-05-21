package cdac.container.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();		//map is not derived from collection interface
		map.put(1, "One");
		map.put(2,"Two");
		map.put(3, "Three");
		map.put(4,null);
		map.put(null, null);
		
		//Duplicate entry will be replaced
		map.put(1, "ONE");
		map.put(null, "Four");
		
		Set<Entry<Integer,String>> entries=map.entrySet();//return set view of mapping  contained in map		
		
		Iterator<Entry<Integer,String>> iterator=entries.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> set=iterator.next();
			System.out.println(set);
		}
		System.out.println();

		//cloned
		HashMap <Integer,String> clonedmap=(HashMap<Integer, String>) map.clone(); 
		System.out.println(clonedmap);

		System.out.println();
		//contain key
		System.out.println("Key 2 available : "+map.containsKey(2));
		System.out.println("Key 200 available : "+map.containsKey(200));
		
		//contain value
		System.out.println("Contain value One : "+map.containsValue("One"));
		System.out.println("Contain value ONE : "+map.containsValue("ONE"));
		
		//get value using key
		String val=map.get(1);
		System.out.println("Value= "+val);
		
		String val1=map.get(3);
		System.out.println("Value = "+val1);
		
		int size=map.size();
		System.out.println("Size= "+size);
		
		System.out.println();
		System.out.println();
		
		Set<Integer> keys=map.keySet();
		System.out.println("Keys = "+keys);
		
		Set<String> uniqval=new HashSet<String>(map.values());
		System.out.println("Unival="+uniqval);
		
		List<String> allvalue=new ArrayList<String>( map.values());
		System.out.println("allvalue="+allvalue);
	
		
	}
}
