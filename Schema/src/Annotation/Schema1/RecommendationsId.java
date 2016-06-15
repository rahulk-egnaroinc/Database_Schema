package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RecommendationsId generated by hbm2java
 */
@Embeddable
public class RecommendationsId implements java.io.Serializable {

	private Integer userId;
	private Integer projectId;
	private Long count;

	public RecommendationsId() {
	}

	public RecommendationsId(Integer userId, Integer projectId, Long count) {
		this.userId = userId;
		this.projectId = projectId;
		this.count = count;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "count")
	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RecommendationsId))
			return false;
		RecommendationsId castOther = (RecommendationsId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
						&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getCount() == castOther.getCount()) || (this.getCount() != null
						&& castOther.getCount() != null && this.getCount().equals(castOther.getCount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getCount() == null ? 0 : this.getCount().hashCode());
		return result;
	}

}
