package cdac.container.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetcomparable {
	public static void main(String[] args) {
		TreeSetcomparable.studTreeSet();
	}
	public static void studTreeSet() {
		System.out.println("In comparable");
		TreeSet<Student> a1=new TreeSet<>();
		
		a1.add(new Student(1,"Ganesh",24));
		a1.add(new Student(2,"Ajinkya",21));
		Student s1=new Student(4,"Bhimesh",22);
		a1.add(s1);
		
	Iterator<Student> val=a1.iterator();
		while(val.hasNext()) {
			Student str=val.next();
			System.out.println(str);
			
		}
//	System.out.println(a1.toString());	
		}
	
}

