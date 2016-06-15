package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ProjectsId generated by hbm2java
 */
public class ProjectsId implements java.io.Serializable {

	private Integer projectId;
	private Integer categoryId;
	private String projectName;
	private String headline;
	private String permalink;
	private String mode;
	private String state;
	private Serializable stateOrder;
	private Date onlineDate;
	private Boolean recommended;
	private String projectImg;
	private Serializable remainingTime;
	private Date expiresAt;
	private BigDecimal pledged;
	private BigDecimal progress;
	private String stateAcronym;
	private String ownerName;
	private String cityName;
	private Serializable fullTextIndex;
	private Boolean openForContributions;
	private Serializable elapsedTime;

	public ProjectsId() {
	}

	public ProjectsId(Integer projectId, Integer categoryId, String projectName, String headline, String permalink,
			String mode, String state, Serializable stateOrder, Date onlineDate, Boolean recommended, String projectImg,
			Serializable remainingTime, Date expiresAt, BigDecimal pledged, BigDecimal progress, String stateAcronym,
			String ownerName, String cityName, Serializable fullTextIndex, Boolean openForContributions,
			Serializable elapsedTime) {
		this.projectId = projectId;
		this.categoryId = categoryId;
		this.projectName = projectName;
		this.headline = headline;
		this.permalink = permalink;
		this.mode = mode;
		this.state = state;
		this.stateOrder = stateOrder;
		this.onlineDate = onlineDate;
		this.recommended = recommended;
		this.projectImg = projectImg;
		this.remainingTime = remainingTime;
		this.expiresAt = expiresAt;
		this.pledged = pledged;
		this.progress = progress;
		this.stateAcronym = stateAcronym;
		this.ownerName = ownerName;
		this.cityName = cityName;
		this.fullTextIndex = fullTextIndex;
		this.openForContributions = openForContributions;
		this.elapsedTime = elapsedTime;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Serializable getStateOrder() {
		return this.stateOrder;
	}

	public void setStateOrder(Serializable stateOrder) {
		this.stateOrder = stateOrder;
	}

	public Date getOnlineDate() {
		return this.onlineDate;
	}

	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}

	public Boolean getRecommended() {
		return this.recommended;
	}

	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}

	public String getProjectImg() {
		return this.projectImg;
	}

	public void setProjectImg(String projectImg) {
		this.projectImg = projectImg;
	}

	public Serializable getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(Serializable remainingTime) {
		this.remainingTime = remainingTime;
	}

	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public BigDecimal getPledged() {
		return this.pledged;
	}

	public void setPledged(BigDecimal pledged) {
		this.pledged = pledged;
	}

	public BigDecimal getProgress() {
		return this.progress;
	}

	public void setProgress(BigDecimal progress) {
		this.progress = progress;
	}

	public String getStateAcronym() {
		return this.stateAcronym;
	}

	public void setStateAcronym(String stateAcronym) {
		this.stateAcronym = stateAcronym;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Serializable getFullTextIndex() {
		return this.fullTextIndex;
	}

	public void setFullTextIndex(Serializable fullTextIndex) {
		this.fullTextIndex = fullTextIndex;
	}

	public Boolean getOpenForContributions() {
		return this.openForContributions;
	}

	public void setOpenForContributions(Boolean openForContributions) {
		this.openForContributions = openForContributions;
	}

	public Serializable getElapsedTime() {
		return this.elapsedTime;
	}

	public void setElapsedTime(Serializable elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectsId))
			return false;
		ProjectsId castOther = (ProjectsId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getCategoryId() == castOther.getCategoryId()) || (this.getCategoryId() != null
						&& castOther.getCategoryId() != null && this.getCategoryId().equals(castOther.getCategoryId())))
				&& ((this.getProjectName() == castOther.getProjectName())
						|| (this.getProjectName() != null && castOther.getProjectName() != null
								&& this.getProjectName().equals(castOther.getProjectName())))
				&& ((this.getHeadline() == castOther.getHeadline()) || (this.getHeadline() != null
						&& castOther.getHeadline() != null && this.getHeadline().equals(castOther.getHeadline())))
				&& ((this.getPermalink() == castOther.getPermalink()) || (this.getPermalink() != null
						&& castOther.getPermalink() != null && this.getPermalink().equals(castOther.getPermalink())))
				&& ((this.getMode() == castOther.getMode()) || (this.getMode() != null && castOther.getMode() != null
						&& this.getMode().equals(castOther.getMode())))
				&& ((this.getState() == castOther.getState()) || (this.getState() != null
						&& castOther.getState() != null && this.getState().equals(castOther.getState())))
				&& ((this.getStateOrder() == castOther.getStateOrder()) || (this.getStateOrder() != null
						&& castOther.getStateOrder() != null && this.getStateOrder().equals(castOther.getStateOrder())))
				&& ((this.getOnlineDate() == castOther.getOnlineDate()) || (this.getOnlineDate() != null
						&& castOther.getOnlineDate() != null && this.getOnlineDate().equals(castOther.getOnlineDate())))
				&& ((this.getRecommended() == castOther.getRecommended())
						|| (this.getRecommended() != null && castOther.getRecommended() != null
								&& this.getRecommended().equals(castOther.getRecommended())))
				&& ((this.getProjectImg() == castOther.getProjectImg()) || (this.getProjectImg() != null
						&& castOther.getProjectImg() != null && this.getProjectImg().equals(castOther.getProjectImg())))
				&& ((this.getRemainingTime() == castOther.getRemainingTime())
						|| (this.getRemainingTime() != null && castOther.getRemainingTime() != null
								&& this.getRemainingTime().equals(castOther.getRemainingTime())))
				&& ((this.getExpiresAt() == castOther.getExpiresAt()) || (this.getExpiresAt() != null
						&& castOther.getExpiresAt() != null && this.getExpiresAt().equals(castOther.getExpiresAt())))
				&& ((this.getPledged() == castOther.getPledged()) || (this.getPledged() != null
						&& castOther.getPledged() != null && this.getPledged().equals(castOther.getPledged())))
				&& ((this.getProgress() == castOther.getProgress()) || (this.getProgress() != null
						&& castOther.getProgress() != null && this.getProgress().equals(castOther.getProgress())))
				&& ((this.getStateAcronym() == castOther.getStateAcronym())
						|| (this.getStateAcronym() != null && castOther.getStateAcronym() != null
								&& this.getStateAcronym().equals(castOther.getStateAcronym())))
				&& ((this.getOwnerName() == castOther.getOwnerName()) || (this.getOwnerName() != null
						&& castOther.getOwnerName() != null && this.getOwnerName().equals(castOther.getOwnerName())))
				&& ((this.getCityName() == castOther.getCityName()) || (this.getCityName() != null
						&& castOther.getCityName() != null && this.getCityName().equals(castOther.getCityName())))
				&& ((this.getFullTextIndex() == castOther.getFullTextIndex())
						|| (this.getFullTextIndex() != null && castOther.getFullTextIndex() != null
								&& this.getFullTextIndex().equals(castOther.getFullTextIndex())))
				&& ((this.getOpenForContributions() == castOther.getOpenForContributions())
						|| (this.getOpenForContributions() != null && castOther.getOpenForContributions() != null
								&& this.getOpenForContributions().equals(castOther.getOpenForContributions())))
				&& ((this.getElapsedTime() == castOther.getElapsedTime())
						|| (this.getElapsedTime() != null && castOther.getElapsedTime() != null
								&& this.getElapsedTime().equals(castOther.getElapsedTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getCategoryId() == null ? 0 : this.getCategoryId().hashCode());
		result = 37 * result + (getProjectName() == null ? 0 : this.getProjectName().hashCode());
		result = 37 * result + (getHeadline() == null ? 0 : this.getHeadline().hashCode());
		result = 37 * result + (getPermalink() == null ? 0 : this.getPermalink().hashCode());
		result = 37 * result + (getMode() == null ? 0 : this.getMode().hashCode());
		result = 37 * result + (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result + (getStateOrder() == null ? 0 : this.getStateOrder().hashCode());
		result = 37 * result + (getOnlineDate() == null ? 0 : this.getOnlineDate().hashCode());
		result = 37 * result + (getRecommended() == null ? 0 : this.getRecommended().hashCode());
		result = 37 * result + (getProjectImg() == null ? 0 : this.getProjectImg().hashCode());
		result = 37 * result + (getRemainingTime() == null ? 0 : this.getRemainingTime().hashCode());
		result = 37 * result + (getExpiresAt() == null ? 0 : this.getExpiresAt().hashCode());
		result = 37 * result + (getPledged() == null ? 0 : this.getPledged().hashCode());
		result = 37 * result + (getProgress() == null ? 0 : this.getProgress().hashCode());
		result = 37 * result + (getStateAcronym() == null ? 0 : this.getStateAcronym().hashCode());
		result = 37 * result + (getOwnerName() == null ? 0 : this.getOwnerName().hashCode());
		result = 37 * result + (getCityName() == null ? 0 : this.getCityName().hashCode());
		result = 37 * result + (getFullTextIndex() == null ? 0 : this.getFullTextIndex().hashCode());
		result = 37 * result + (getOpenForContributions() == null ? 0 : this.getOpenForContributions().hashCode());
		result = 37 * result + (getElapsedTime() == null ? 0 : this.getElapsedTime().hashCode());
		return result;
	}

}
