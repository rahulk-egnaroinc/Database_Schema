package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * ProjectAccountErrorsId generated by hbm2java
 */
public class ProjectAccountErrorsId implements java.io.Serializable {

	private Integer projectId;
	private Integer projectAccountId;
	private String reason;
	private Boolean solved;
	private Date zoneTimestamp;
	private Date createdAt;

	public ProjectAccountErrorsId() {
	}

	public ProjectAccountErrorsId(Integer projectId, Integer projectAccountId, String reason, Boolean solved,
			Date zoneTimestamp, Date createdAt) {
		this.projectId = projectId;
		this.projectAccountId = projectAccountId;
		this.reason = reason;
		this.solved = solved;
		this.zoneTimestamp = zoneTimestamp;
		this.createdAt = createdAt;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getProjectAccountId() {
		return this.projectAccountId;
	}

	public void setProjectAccountId(Integer projectAccountId) {
		this.projectAccountId = projectAccountId;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Boolean getSolved() {
		return this.solved;
	}

	public void setSolved(Boolean solved) {
		this.solved = solved;
	}

	public Date getZoneTimestamp() {
		return this.zoneTimestamp;
	}

	public void setZoneTimestamp(Date zoneTimestamp) {
		this.zoneTimestamp = zoneTimestamp;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectAccountErrorsId))
			return false;
		ProjectAccountErrorsId castOther = (ProjectAccountErrorsId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getProjectAccountId() == castOther.getProjectAccountId())
						|| (this.getProjectAccountId() != null && castOther.getProjectAccountId() != null
								&& this.getProjectAccountId().equals(castOther.getProjectAccountId())))
				&& ((this.getReason() == castOther.getReason()) || (this.getReason() != null
						&& castOther.getReason() != null && this.getReason().equals(castOther.getReason())))
				&& ((this.getSolved() == castOther.getSolved()) || (this.getSolved() != null
						&& castOther.getSolved() != null && this.getSolved().equals(castOther.getSolved())))
				&& ((this.getZoneTimestamp() == castOther.getZoneTimestamp())
						|| (this.getZoneTimestamp() != null && castOther.getZoneTimestamp() != null
								&& this.getZoneTimestamp().equals(castOther.getZoneTimestamp())))
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this.getCreatedAt().equals(castOther.getCreatedAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getProjectAccountId() == null ? 0 : this.getProjectAccountId().hashCode());
		result = 37 * result + (getReason() == null ? 0 : this.getReason().hashCode());
		result = 37 * result + (getSolved() == null ? 0 : this.getSolved().hashCode());
		result = 37 * result + (getZoneTimestamp() == null ? 0 : this.getZoneTimestamp().hashCode());
		result = 37 * result + (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		return result;
	}

}
