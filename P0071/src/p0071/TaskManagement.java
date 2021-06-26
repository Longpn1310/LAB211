/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0071;

/**
 *
 * @author laptop
 */
import java.util.ArrayList;
import java.util.Date;

public class TaskManagement {
	ArrayList<Task> list = new ArrayList<>();
	Validate v = new Validate();

	public void addTask() {
		int id;
		if (list.isEmpty()) {
			id = 1;
		} else {
			id = list.get(list.size() - 1).getId() + 1;
		}
		String name = v.checkText("Requirement Name: ");
		int typeid = v.checkChoice("Task type: "); //Check 1-4
		String date = v.checkDate("Date: ");
		double from = v.checkFrom("From: ");
		double to = v.checkTo(from);
		String assignee = v.checkText("Assignee: ");
		String reviewer = v.checkText("Reviewer: ");
		Task t = new Task(id, name, typeid, date, from, to, assignee, reviewer);
		list.add(t);
	}

	public void deleteTask() {
		if (list.isEmpty()) {
			System.err.println("List empty");
			return;
		}
		int Id = findTaskExist(list);
		if (Id != -1) {
			list.remove(Id);
			for (int i = Id; i < list.size(); i++) {
				list.get(i).setId(list.get(i).getId() - 1);
			}
			System.err.println("Delete success.");
		}
	}

	public int findTaskExist(ArrayList<Task> t) {
		int id = v.checkID("Enter ID: ");
		for (int i = 0; i < t.size(); i++) {
			if (t.get(i).getId() == id) {
				return i;
			}
		}
		System.err.println("Not found.");
		return -1;
	}



	public void display() {
		System.out.println("---------------------------------------------Task---------------------------------------------");
		System.out.println(String.format("%s%20s%20s%20s%20s%20s%20s", "ID", "Name" ,"Task Type", "Date","Time", "Assignee", "Reviewer"));
		for(Task t: list){
			System.out.println(t);
		}
	}

}
