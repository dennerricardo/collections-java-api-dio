package list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import list.search.Book;
import list.search.BooksCataloge;

public class SortPeople {
	private List<People> peopleList;
	
	public SortPeople() {
		this.peopleList = new ArrayList<>();
	}
	
	public void addPeople(String name, int age, double height) {
		peopleList.add(new People(name,age,height));
	}
	
	public List<People> sortByAge(){
		List<People> peopleByAge = new ArrayList<>(peopleList);
		Collections.sort(peopleByAge);
		return peopleByAge;
	}
	
	public List<People> sortByHeight(){
		List<People> peopleByHeight = new ArrayList<>(peopleList);
		Collections.sort(peopleByHeight, new ComparatorbyHeight());
		return peopleByHeight;
	}
	
	public static void main(String[] args) {
		SortPeople sortPeople = new SortPeople();
		sortPeople.addPeople("DENNER" ,20, 1.65);
		sortPeople.addPeople("RICARDO" ,17, 1.75);
		sortPeople.addPeople("SOARES" ,56, 1.75);
		sortPeople.addPeople("FERREIRA" ,40, 1.78);
		
		System.out.println(sortPeople.sortByAge());
		System.out.println(sortPeople.sortByHeight());
		
		
//		
//		System.out.println(booksCataloge.searchByAuthor("author 2"));
	}

}



