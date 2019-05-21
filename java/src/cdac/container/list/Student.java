package cdac.container.list;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private int age;
	Student(int roll,String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
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
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Student st) {
	//Ascending order
	if(age==st.age) 
		return 0;
	else if(age>st.age)
		return 1;				//for descending order change 1 to -1 and -1 to 1 
	else 
		return -1;	
}

}
