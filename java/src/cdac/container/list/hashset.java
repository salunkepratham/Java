package cdac.container.list;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String args[]) {
		HashSet <String> value=new HashSet<>();
		
		//add values							//allow unique element,not based on index,not maintain insertion order
		value.add("one");						//follows hashcode to store the element
		value.add("two");
	    value.add("three");			
		value.add("four");
		value.add(null);
	//	value.add(null);			duplicates values are ignored
		
		String s=new String("one");
		value.add(s);
		System.out.println("Hashcode s="+s.hashCode());
		String s1=new String("two");
		value.add(s1);
		System.out.println("Hashcode s1="+s1.hashCode());
		
		//Duplicates values are ignored
		String s3=new String("one");							//duplicates value are ignored
		value.add(s3);
		System.out.println("Hashcode s3="+s3.hashCode());		//hashcode is same for s3 and s
		
		
		//size 
		System.out.println("size="+value.size());
		
		//contain or search
		System.out.println("Value of three = "+value.contains("three"));
		System.out.println("Value of Three = "+value.contains("Three"));
		
		//Isempty()
		System.out.println("IsEmpty ="+value.isEmpty());
		
		//display
		Iterator<String> iterator=value.iterator();
		while(iterator.hasNext()) {
			String num=iterator.next();
			System.out.println(num);
		}
		//remove one element
		value.remove("three");
		
		System.out.println(value);
		
		//remove all values
		value.clear();
		
	}
	
}
