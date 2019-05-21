package cdac.container.list;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
								//allows duplicates,based on index,dynamic array
		//add element in list
		list.add("Ganesh");
		list.add("Akshay");
		list.add("Pratham");
		list.add("Pratik");
		list.add("Ganesh");
		list.add("Akshay");
		list.add("Pratham");
		list.add("Pratik");
		
		//add element at particular index
		list.add(2,"Amit");
		
		//index of element
		int num=list.indexOf("Pratham");
		System.out.println("Index of Pratham= "+num);
		
		//index of element at last occurance
		int num1=list.lastIndexOf("Akshay");
		System.out.println("Last index of akshay= "+num1);
		
		//size of arraylist
		int s=list.size();
		System.out.println("element in list= "+s);
		
		//iterator
		System.out.println("Iterator value:");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String val=iterator.next();
			System.out.println(val);
		}
		
		//update element at particular index
		list.set(6,"Pramod");
		
		//to see element at particular index
		System.out.println("Value at index 5 : "+list.get(5));
		
		//element is present or not
		System.out.println("Element present : "+list.contains("shri"));
		System.out.println("Element present : "+list.contains("Pratham"));
		
		//remove element
		list.remove(3);
		list.remove("Pratik");
		
		//display all the element in list
		System.out.println(list.toString());
		
		//remove all elemnts
		list.clear();
		
		//checking isempty
		System.out.println(list.isEmpty());
	}
}
