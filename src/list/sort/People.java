package list.sort;

import java.util.Comparator;

public class People implements Comparable<People> {
	private String name; 
	private int age;
	private double height;
	
	public People(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int compareTo(People p) {
		return Integer.compare(age, p.getAge());
	}
	
}
class ComparatorbyHeight implements Comparator<People> {

	@Override
	public int compare(People p1, People p2) {

		return Double.compare(p1.getHeight(), p2.getHeight());
	}
	
}
