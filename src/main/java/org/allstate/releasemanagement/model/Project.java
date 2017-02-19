package org.allstate.releasemanagement.model;

public class Project {
	private String description;
	private String developerName;

	private String id;

	private String projectName;

	private String spocName;
	private String teamLead;

	public Project() {
	}

	public Project(String id, String description, String developerName, String spocName, String teamLead, String name) {
		super();
		this.id = id;
		this.description = description;
		this.developerName = developerName;
		this.spocName = spocName;
		this.teamLead = teamLead;
		this.projectName = name;
	}

	public String getDescription() {
		return description;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public String getId() {
		return id;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getSpocName() {
		return spocName;
	}

	public String getTeamLead() {
		return teamLead;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setSpocName(String spocName) {
		this.spocName = spocName;
	}

	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}

}
