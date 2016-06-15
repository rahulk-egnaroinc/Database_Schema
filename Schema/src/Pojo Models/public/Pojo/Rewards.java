package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rewards generated by hbm2java
 */
public class Rewards implements java.io.Serializable {

	private int id;
	private Projects projects;
	private BigDecimal minimumValue;
	private Integer maximumContributions;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	private Integer rowOrder;
	private String lastChanges;
	private Date deliverAt;
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);

	public Rewards() {
	}

	public Rewards(int id, Projects projects, BigDecimal minimumValue, String description) {
		this.id = id;
		this.projects = projects;
		this.minimumValue = minimumValue;
		this.description = description;
	}

	public Rewards(int id, Projects projects, BigDecimal minimumValue, Integer maximumContributions, String description,
			Date createdAt, Date updatedAt, Integer rowOrder, String lastChanges, Date deliverAt,
			Set<Contributions> contributionses) {
		this.id = id;
		this.projects = projects;
		this.minimumValue = minimumValue;
		this.maximumContributions = maximumContributions;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.rowOrder = rowOrder;
		this.lastChanges = lastChanges;
		this.deliverAt = deliverAt;
		this.contributionses = contributionses;
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

	public BigDecimal getMinimumValue() {
		return this.minimumValue;
	}

	public void setMinimumValue(BigDecimal minimumValue) {
		this.minimumValue = minimumValue;
	}

	public Integer getMaximumContributions() {
		return this.maximumContributions;
	}

	public void setMaximumContributions(Integer maximumContributions) {
		this.maximumContributions = maximumContributions;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Integer getRowOrder() {
		return this.rowOrder;
	}

	public void setRowOrder(Integer rowOrder) {
		this.rowOrder = rowOrder;
	}

	public String getLastChanges() {
		return this.lastChanges;
	}

	public void setLastChanges(String lastChanges) {
		this.lastChanges = lastChanges;
	}

	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
	}

	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

}
