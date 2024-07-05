package set.search;

import java.util.HashSet;
import java.util.Set;





public class SetOfContact {
	private Set<Contact> contactSet;

	public SetOfContact() {
		this.contactSet = new HashSet<>();
	}
	
	public void addContact(String name, int numberContact) {
		contactSet.add(new Contact(name,numberContact));
	}
	
	public void showContacts() {
		System.out.println(contactSet);
	}
	
	public Set<Contact> searchByName(String name) {
		Set<Contact> contactByName = new HashSet<>();
		for(Contact c : contactSet) {
			if(c.getName().startsWith(name)){
				contactByName.add(c);				
			}
		}
		return contactByName;
	}
	
	public Contact updateContact(String name, int newNumber) {
		Contact contactUpdate = null ;
		for(Contact c : contactSet) {
			if(c.getName().equals(name)) {
				c.setNumberContact(newNumber);
				contactUpdate = c;
				break;
			}
		}
		return 	contactUpdate;
		
	}
	
	public static void main(String[] args) {
		SetOfContact setOfContact = new SetOfContact();
		setOfContact.addContact("Denner" , 2020);
		setOfContact.addContact("Ricardo" , 2022);
		setOfContact.addContact("Denner Ricardo" , 2001);
		setOfContact.addContact("Denner DIO" , 2005);
		setOfContact.addContact("Joao Jose" , 2012);
		
//		setOfContact.showContacts();
		
		
		System.out.println(setOfContact.searchByName("Denner"));
		
		setOfContact.updateContact("Denner",123123);
		
		setOfContact.showContacts();
	
	}
}
