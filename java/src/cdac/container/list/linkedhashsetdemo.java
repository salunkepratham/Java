package cdac.container.list;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetdemo {
	public static void main(String[] args) {					//maintain insertion order,does not follow index based
		LinkedHashSet<String> set=new LinkedHashSet<>();		//follows hashcode and doubly linked to store element
		set.add("Mumbai");
		set.add("Pune");
		set.add("Banglore");
		set.add("Mysore");
		set.add("Ulhasnagar");
		set.add(null);
		set.add(null);       //having unique element
		
		Iterator<String> val=set.iterator();
		while(val.hasNext()) {
			String str=val.next();
			System.out.println(str);
			//val.remove();				to remove value after every next
		}
		
		//to remove value
		set.remove(null);
		
		System.out.println(set);
	}
}
