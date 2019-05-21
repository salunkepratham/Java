package cdac.container.list;

import java.util.Comparator;

public class Studentcomparator  implements Comparator<Studentcomparator>{
	private int roll;
	private String name;
	private int age;
	Studentcomparator(int roll,String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	
	public Studentcomparator() {
	}
	
/*
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
*/
	@Override
	public String toString() {
		return "Studentcomparator [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

	public int compare(Studentcomparator o1, Studentcomparator o2) {
		if(o1.roll==o2.roll)
			return 0;
		else if(o1.roll>o2.roll)
			return 1;
		else if(o1.roll<o2.roll)
			return -1;
		return 0;
	}
	
}
