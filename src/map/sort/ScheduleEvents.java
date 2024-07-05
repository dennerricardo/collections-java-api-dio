package map.sort;

import map.sort.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import map.search.StorageOfProducts;

public class ScheduleEvents {
	private Map<LocalDate, Event> eventMap;

	public ScheduleEvents() {
		this.eventMap = new HashMap<>();
	}
	
	public void addEvent(LocalDate data, String name, String description) {
		eventMap.put(data, new Event(name,description));
		
	}
	
	public void showSchedule() {
		Map<LocalDate,Event> eventsTreeMap = new TreeMap<>(eventMap);
		System.out.println(eventsTreeMap);
		
	}
	
	public void showNextEvent() {
//		Set<LocalDate> dataSet = eventMap.keySet();
//		Collection<Event> values = eventMap.values();
//		eventMap.get();
		
		LocalDate currentDate = LocalDate.now();
		LocalDate nextData = null; 
		Event nextEvent = null;
		Map<LocalDate,Event> eventsTreeMap = new TreeMap<>(eventMap);
		for(Map.Entry<LocalDate, Event> entry : eventsTreeMap.entrySet()) {
			if(entry.getKey().isEqual(currentDate)|| entry.getKey().isAfter(currentDate)) {
				nextData = entry.getKey(); 
				nextEvent = entry.getValue();
				System.out.println(nextData+">>>>"+ nextData );
				break;
			}
		}		
	}
	
public static void main(String[] args) {
		
		ScheduleEvents scheduleEvents = new ScheduleEvents();
		
		
		scheduleEvents.addEvent(LocalDate.of(2025, Month.NOVEMBER, 10), "Event 1", "Description 1" );
		scheduleEvents.addEvent(LocalDate.of(2025, Month.DECEMBER, 9), "Event 2", "Description 2" );
		scheduleEvents.addEvent(LocalDate.of(2021, Month.SEPTEMBER, 28), "Event 3", "Description 3" );
		scheduleEvents.addEvent(LocalDate.of(2020, Month.AUGUST, 7), "Event 4", "Description 4" );
		scheduleEvents.showSchedule();
		
		scheduleEvents.showNextEvent();
		

	}
	
}
