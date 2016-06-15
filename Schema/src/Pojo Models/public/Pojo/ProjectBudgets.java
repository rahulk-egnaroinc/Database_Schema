package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * ProjectBudgets generated by hbm2java
 */
public class ProjectBudgets implements java.io.Serializable {

	private int id;
	private Projects projects;
	private String name;
	private BigDecimal value;
	private Date createdAt;
	private Date updatedAt;

	public ProjectBudgets() {
	}

	public ProjectBudgets(int id, Projects projects, String name, BigDecimal value) {
		this.id = id;
		this.projects = projects;
		this.name = name;
		this.value = value;
	}

	public ProjectBudgets(int id, Projects projects, String name, BigDecimal value, Date createdAt, Date updatedAt) {
		this.id = id;
		this.projects = projects;
		this.name = name;
		this.value = value;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
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