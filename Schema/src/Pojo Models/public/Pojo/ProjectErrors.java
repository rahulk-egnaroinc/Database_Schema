package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * ProjectErrors generated by hbm2java
 */
public class ProjectErrors implements java.io.Serializable {

	private int id;
	private Projects projects;
	private String error;
	private String toState;
	private Date createdAt;
	private Date updatedAt;

	public ProjectErrors() {
	}

	public ProjectErrors(int id, Projects projects, String toState) {
		this.id = id;
		this.projects = projects;
		this.toState = toState;
	}

	public ProjectErrors(int id, Projects projects, String error, String toState, Date createdAt, Date updatedAt) {
		this.id = id;
		this.projects = projects;
		this.error = error;
		this.toState = toState;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getToState() {
		return this.toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
