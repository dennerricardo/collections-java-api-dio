package set.search;

import java.util.Objects;

public class Contact {
	
	private String name;
	private int numberContact;
	
	public Contact(String name, int numberContact) {
		super();
		this.name = name;
		this.numberContact = numberContact;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberContact() {
		return numberContact;
	}

	public void setNumberContact(int numberContact) {
		this.numberContact = numberContact;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "[" + name + ", " + numberContact + "]";
	}
	
	
	

}
