package set.basicoperations;

import java.util.HashSet;
import java.util.Set;


public class SetGuests {
	private Set<Guest> guestSet;

	public SetGuests() {
		this.guestSet = new HashSet<>() ;
	} 
	
	public void addGuest(String name, int guestCode) {
		guestSet.add(new Guest(name, guestCode));
	}
	
	public void removeGuestbyCode(int guestCode) {
		Guest guestToRemove = null ;
		for(Guest g : guestSet) {
			if(g.getGuestCode() == guestCode) {
				guestToRemove = g ;
				break;
			}
		}
		guestSet.remove(guestToRemove);
	}
	
	public int countGuests() {
		return guestSet.size();
	}
	
	public void showGuests() {
		System.out.println(guestSet);		
	}
	
	public static void main(String[] args) {
		SetGuests setGuests = new SetGuests();
		
		setGuests.addGuest("Guest 1", 123);
		setGuests.addGuest("Guest 2", 125);
		setGuests.addGuest("Guest 3", 201);
		setGuests.addGuest("Guest 4", 201);
		setGuests.addGuest("Guest 5", 212);
		setGuests.addGuest("Guest 6", 197);
		
		setGuests.removeGuestbyCode(212);
		
		System.out.println(setGuests.countGuests());
		setGuests.showGuests();

	}	
}
