package com.shubham.projectmanagement.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String projectName;
	private List<Developer> developersId;
	private int teamLeadId;
	private boolean status;
	/*@OneToMany(mappedBy="project")
	private Task tasks;*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Developer> getDevelopersId() {
		return developersId;
	}
	public void setDevelopersId(List<Developer> developersId) {
		this.developersId = developersId;
	}
	public int getTeamLeadId() {
		return teamLeadId;
	}
	public void setTeamLeadId(int teamLeadId) {
		this.teamLeadId = teamLeadId;
	}
	/*public Task getTasks() {
		return tasks;
	}
	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", developersId=" + developersId + ", teamLeadId="
				+ teamLeadId + ", status=" + status + ", tasks=" + tasks + "]";
	}*/
	
    
	
	
	
}
