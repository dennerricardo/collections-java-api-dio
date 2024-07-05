package map.basicoperations;

import java.util.HashMap;
import java.util.Map;


public class MapOfContacts {
	
	private Map<String, Integer> mapOfContact;

	public MapOfContacts() {
		this.mapOfContact = new HashMap<>();
	}
	

	
	public void addContact(String name, Integer phone) {
		mapOfContact.put(name, phone);
		
	}
	
	public void removeContact(String name) {
		if(!mapOfContact.isEmpty()) {
			mapOfContact.remove(name);
		}
	}
	
	public void showContacts() {
		System.out.println(mapOfContact);
	}
	
//	public Integer showContac() {
//		System.out.println(mapOfContact);
//	}
	
	public Integer searchByName(String name) {
		Integer phoneByName = null;
		if(!mapOfContact.isEmpty()) {
			phoneByName = mapOfContact.get(name);
		}
		return phoneByName;
	}
	
	public static void main(String[] args) {
		MapOfContacts mapOfContacts = new MapOfContacts();
		mapOfContacts.addContact("Denner" , 2020);
		mapOfContacts.addContact("Denner" , 2022);
		mapOfContacts.addContact("Denner Ricardo" , 2001);
		mapOfContacts.addContact("Denner DIO" , 2005);
		mapOfContacts.addContact("Joao Jose" , 2012);
		
//		setOfContact.showContacts();
		
		
		System.out.println(mapOfContacts.searchByName("Denner"));
		
		mapOfContacts.removeContact("Denner");
		
		mapOfContacts.showContacts();
	
	}
	
	
}