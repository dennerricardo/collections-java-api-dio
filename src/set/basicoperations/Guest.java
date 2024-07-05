package set.basicoperations;

import java.util.Objects;

public class Guest {
	
	private String name; 
	private int guestCode;
	
	public Guest(String name, int guestCode) {
		this.name = name;
		this.guestCode = guestCode;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGuestCode() {
		return guestCode;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", guestCode=" + guestCode + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(guestCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return guestCode == other.guestCode;
	}

	
	
}
