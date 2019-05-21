package cdac.container.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] arags) {		
		TreeSetDemo.strTreeSet();
		TreeSetDemo.studTreeSet();
		
	}	
	public static void strTreeSet() {												//allows unique element,not based on index
		TreeSet<String> name=new TreeSet<>();		//not maintain the insertion order
		name.add("bhimesh");
		name.add("Pratham");
		name.add("Vijay");
		name.add("Akshay");
		name.add("akshay");
		//name.add(null);				//it does not allow null values
		
		Iterator<String> val=name.iterator();
		while(val.hasNext()) {
			String str=val.next();
			System.out.println(str);
		}
	}
	
	public static void studTreeSet() {
		System.out.println("In comparator :");
		Studentcomparator sc=new Studentcomparator();
		TreeSet<Studentcomparator> a1=new TreeSet<>(sc);
		
		//System.out.println("In comparable");
		//TreeSet<Student> a1=new TreeSet<>();
		
		a1.add(new Studentcomparator(1,"Ganesh",24));
		a1.add(new Studentcomparator(2,"Ajinkya",21));
		Studentcomparator s1=new Studentcomparator(4,"Bhimesh",22);
		a1.add(s1);
		
	Iterator<Studentcomparator> val=a1.iterator();
		while(val.hasNext()) {
			Studentcomparator str=val.next();
			System.out.println(str);
			
		}
	}
}
