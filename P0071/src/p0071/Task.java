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
public class Task {

	private int ID;
	private String requirement_Name;
	private int Task_typeid; //a number from 1-4
	private String date; //format dd-MM-yyyy
	private double Plan_from; //< PlanTo  and within 8h-17h30> 8.0, 8.5, 9.0, ⇔ 9.5 ...-> 17.5 .
	private double Plan_to;
	private String assignee;
	private String reviewer;

	public Task() {
	}

	public Task(int id, String name, int typeid, String date, double from, double to, String assignee, String reviewer) {
		this.ID = id;
		this.requirement_Name = name;
		this.Task_typeid = typeid;
		this.date = date;
		this.Plan_from = from;
		this.Plan_to = to;
		this.assignee = assignee;
		this.reviewer = reviewer;
	}

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}

	public String getName() {
		return requirement_Name;
	}

	public void setName(String name) {
		this.requirement_Name = name;
	}

	public int getTypeid() {
		return Task_typeid;
	}

	public void setTypeid(int typeid) {
		this.Task_typeid = typeid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getFrom() {
		return Plan_from;
	}

	public void setFrom(double from) {
		this.Plan_from = from;
	}

	public double getTo() {
		return Plan_to;
	}

	public void setTo(double to) {
		this.Plan_to = to;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public double getTime() {
		return Plan_to - Plan_from;
	}

	/*
	 * The type of task: (ID, Name contains the following data fixed:
ID  Name
1	Code
2	Test
3	Design
4	Review 

	 */
	public String taskname() {
		String taskname = "";
		switch (Task_typeid) {
		case 1:
			taskname = "Code";
			break;
		case 2:
			taskname = "Test";
			break;
		case 3:
			taskname = "Design";
			break;
		case 4:
			taskname = "Review";
			break;
		}
		return taskname;
	}

	@Override
	public String toString() {
		String out = String.format("%d%19s%17s%28s%16.1f%18s%20s", ID, requirement_Name, taskname(), date,getTime(), assignee, reviewer);
		return out;
	}
}
