package list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
	
	private List<Task> taskList;
	
	public TaskList() {
		this.taskList = new ArrayList<>();
	}
	
	public void addTask(String description) {
		taskList.add(new Task(description));
	}
	
	public void removeTask(String description) {
		List<Task> taskToRemove = new ArrayList<>();
		for (Task t : taskList) {
			if(t.getDescription().equalsIgnoreCase(description)) {
				taskToRemove.add(t);
			}
		}
		taskList.removeAll(taskToRemove);
	}
	
	public int allTask() {
		return taskList.size();
	}
	
	public void taskDescriptions() {
		System.out.println(taskList);
	}
	
	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		System.out.println("Numbers of Tasks: "+taskList.allTask());
		
//		taskList.addTask("TASK 1");
		taskList.addTask("TASK 1");
		taskList.addTask("TASK 2");
		taskList.addTask("TASK 3");
		taskList.addTask("TASK 4");
		System.out.println("Numbers of Tasks: "+taskList.allTask());
		
		taskList.removeTask("TASK 1");
		System.out.println("Numbers of Tasks: "+taskList.allTask());
		
		taskList.taskDescriptions();
		
	}
	
	
	
	
}
