package map.sort;

public class Event {
	private String name;
	private String description;
	
	public Event(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Events [name=" + name + ", description=" + description + "]";
	} 
	
	
}
