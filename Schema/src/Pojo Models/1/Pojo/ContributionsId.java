package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * ContributionsId generated by hbm2java
 */
public class ContributionsId implements java.io.Serializable {

	private Integer id;
	private Integer projectId;
	private Integer userId;
	private Integer publicUserId;
	private Integer rewardId;
	private Date createdAt;

	public ContributionsId() {
	}

	public ContributionsId(Integer id, Integer projectId, Integer userId, Integer publicUserId, Integer rewardId,
			Date createdAt) {
		this.id = id;
		this.projectId = projectId;
		this.userId = userId;
		this.publicUserId = publicUserId;
		this.rewardId = rewardId;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPublicUserId() {
		return this.publicUserId;
	}

	public void setPublicUserId(Integer publicUserId) {
		this.publicUserId = publicUserId;
	}

	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
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
		if (!(other instanceof ContributionsId))
			return false;
		ContributionsId castOther = (ContributionsId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
						&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getPublicUserId() == castOther.getPublicUserId())
						|| (this.getPublicUserId() != null && castOther.getPublicUserId() != null
								&& this.getPublicUserId().equals(castOther.getPublicUserId())))
				&& ((this.getRewardId() == castOther.getRewardId()) || (this.getRewardId() != null
						&& castOther.getRewardId() != null && this.getRewardId().equals(castOther.getRewardId())))
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this.getCreatedAt().equals(castOther.getCreatedAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getPublicUserId() == null ? 0 : this.getPublicUserId().hashCode());
		result = 37 * result + (getRewardId() == null ? 0 : this.getRewardId().hashCode());
		result = 37 * result + (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		return result;
	}

}
