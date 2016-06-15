package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectContributionsPerDayId generated by hbm2java
 */
@Embeddable
public class ProjectContributionsPerDayId implements java.io.Serializable {

	private Integer projectId;
	private Serializable source;

	public ProjectContributionsPerDayId() {
	}

	public ProjectContributionsPerDayId(Integer projectId, Serializable source) {
		this.projectId = projectId;
		this.source = source;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "source")
	public Serializable getSource() {
		return this.source;
	}

	public void setSource(Serializable source) {
		this.source = source;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectContributionsPerDayId))
			return false;
		ProjectContributionsPerDayId castOther = (ProjectContributionsPerDayId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getSource() == castOther.getSource()) || (this.getSource() != null
						&& castOther.getSource() != null && this.getSource().equals(castOther.getSource())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getSource() == null ? 0 : this.getSource().hashCode());
		return result;
	}

}
