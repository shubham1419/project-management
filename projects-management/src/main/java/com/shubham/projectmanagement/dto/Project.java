package com.shubham.projectmanagement.dto;

import java.util.List;

public class Project {

	private int id;
	private String projectName;
	private List<String> projectTasks;
	private List<Integer> developersId;
	private List<Integer> teamLeadId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<String> getProjectTasks() {
		return projectTasks;
	}
	public void setProjectTasks(List<String> projectTasks) {
		this.projectTasks = projectTasks;
	}
	public List<Integer> getDevelopersId() {
		return developersId;
	}
	public void setDevelopersId(List<Integer> developersId) {
		this.developersId = developersId;
	}
	public List<Integer> getTeamLeadId() {
		return teamLeadId;
	}
	public void setTeamLeadId(List<Integer> teamLeadId) {
		this.teamLeadId = teamLeadId;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectTasks=" + projectTasks
				+ ", developersId=" + developersId + ", teamLeadId=" + teamLeadId + "]";
	}
	
	
}
