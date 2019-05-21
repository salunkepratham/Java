package cdac.container.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();			//allows duplicates,based on index,
																//underlying ds is doubly linkedlist
		//add element in list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);
		list.add(3,66);
		list.add(new Integer(22));
		
		//size
		System.out.println("Size of list="+list.size());
		
		//add element at first
		list.addFirst(77);
		
		//add element at last
		list.addLast(99);
		
		//to get particular value
		int val=list.get(5);
		System.out.println("value is : "+val);
		
		//Iterator
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
		int value=listIterator.next();
		if(value==33)
			System.out.println("value= "+value);
		else if(value==50)
			listIterator.remove();
		}
		
		//get first value
		int valfirst=list.getFirst();
		System.out.println("First value is : "+valfirst);
		
		//get last value
		int vallast=list.getLast();
		System.out.println("Last value is :"+vallast);
		
		//index of element
		System.out.println("Index of element: "+list.indexOf(66));
		System.out.println("Index of last element: "+list.lastIndexOf(30));
		
		//show all values
		System.out.println(list);
	}
}
