package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectDetailsId generated by hbm2java
 */
@Embeddable
public class ProjectDetailsId implements java.io.Serializable {

	private Integer projectId;
	private Integer id;
	private Integer userId;
	private String name;
	private String headline;
	private String budget;
	private BigDecimal goal;
	private String aboutHtml;
	private String permalink;
	private String videoEmbedUrl;
	private String videoUrl;
	private String categoryName;
	private Integer categoryId;
	private String originalImage;
	private String thumbImage;
	private String smallImage;
	private String largeImage;
	private String videoCoverImage;
	private BigDecimal progress;
	private BigDecimal pledged;
	private Long totalContributions;
	private Long totalContributors;
	private String state;
	private String mode;
	private Serializable stateOrder;
	private Date expiresAt;
	private Date zoneExpiresAt;
	private Date onlineDate;
	private Date zoneOnlineDate;
	private Date sentToAnalysisAt;
	private Boolean isPublished;
	private Boolean isExpired;
	private Boolean openForContributions;
	private Integer onlineDays;
	private Serializable remainingTime;
	private Serializable elapsedTime;
	private Long postsCount;
	private Serializable address;
	private Serializable user;
	private Long reminderCount;
	private Boolean isOwnerOrAdmin;
	private Boolean userSignedIn;
	private Boolean inReminder;
	private Long totalPosts;
	private Boolean isAdminRole;

	public ProjectDetailsId() {
	}

	public ProjectDetailsId(Integer projectId, Integer id, Integer userId, String name, String headline, String budget,
			BigDecimal goal, String aboutHtml, String permalink, String videoEmbedUrl, String videoUrl,
			String categoryName, Integer categoryId, String originalImage, String thumbImage, String smallImage,
			String largeImage, String videoCoverImage, BigDecimal progress, BigDecimal pledged, Long totalContributions,
			Long totalContributors, String state, String mode, Serializable stateOrder, Date expiresAt,
			Date zoneExpiresAt, Date onlineDate, Date zoneOnlineDate, Date sentToAnalysisAt, Boolean isPublished,
			Boolean isExpired, Boolean openForContributions, Integer onlineDays, Serializable remainingTime,
			Serializable elapsedTime, Long postsCount, Serializable address, Serializable user, Long reminderCount,
			Boolean isOwnerOrAdmin, Boolean userSignedIn, Boolean inReminder, Long totalPosts, Boolean isAdminRole) {
		this.projectId = projectId;
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.headline = headline;
		this.budget = budget;
		this.goal = goal;
		this.aboutHtml = aboutHtml;
		this.permalink = permalink;
		this.videoEmbedUrl = videoEmbedUrl;
		this.videoUrl = videoUrl;
		this.categoryName = categoryName;
		this.categoryId = categoryId;
		this.originalImage = originalImage;
		this.thumbImage = thumbImage;
		this.smallImage = smallImage;
		this.largeImage = largeImage;
		this.videoCoverImage = videoCoverImage;
		this.progress = progress;
		this.pledged = pledged;
		this.totalContributions = totalContributions;
		this.totalContributors = totalContributors;
		this.state = state;
		this.mode = mode;
		this.stateOrder = stateOrder;
		this.expiresAt = expiresAt;
		this.zoneExpiresAt = zoneExpiresAt;
		this.onlineDate = onlineDate;
		this.zoneOnlineDate = zoneOnlineDate;
		this.sentToAnalysisAt = sentToAnalysisAt;
		this.isPublished = isPublished;
		this.isExpired = isExpired;
		this.openForContributions = openForContributions;
		this.onlineDays = onlineDays;
		this.remainingTime = remainingTime;
		this.elapsedTime = elapsedTime;
		this.postsCount = postsCount;
		this.address = address;
		this.user = user;
		this.reminderCount = reminderCount;
		this.isOwnerOrAdmin = isOwnerOrAdmin;
		this.userSignedIn = userSignedIn;
		this.inReminder = inReminder;
		this.totalPosts = totalPosts;
		this.isAdminRole = isAdminRole;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "headline")
	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Column(name = "budget")
	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Column(name = "goal", precision = 131089, scale = 0)
	public BigDecimal getGoal() {
		return this.goal;
	}

	public void setGoal(BigDecimal goal) {
		this.goal = goal;
	}

	@Column(name = "about_html")
	public String getAboutHtml() {
		return this.aboutHtml;
	}

	public void setAboutHtml(String aboutHtml) {
		this.aboutHtml = aboutHtml;
	}

	@Column(name = "permalink")
	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	@Column(name = "video_embed_url")
	public String getVideoEmbedUrl() {
		return this.videoEmbedUrl;
	}

	public void setVideoEmbedUrl(String videoEmbedUrl) {
		this.videoEmbedUrl = videoEmbedUrl;
	}

	@Column(name = "video_url")
	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Column(name = "category_name")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "category_id")
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "original_image")
	public String getOriginalImage() {
		return this.originalImage;
	}

	public void setOriginalImage(String originalImage) {
		this.originalImage = originalImage;
	}

	@Column(name = "thumb_image")
	public String getThumbImage() {
		return this.thumbImage;
	}

	public void setThumbImage(String thumbImage) {
		this.thumbImage = thumbImage;
	}

	@Column(name = "small_image")
	public String getSmallImage() {
		return this.smallImage;
	}

	public void setSmallImage(String smallImage) {
		this.smallImage = smallImage;
	}

	@Column(name = "large_image")
	public String getLargeImage() {
		return this.largeImage;
	}

	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

	@Column(name = "video_cover_image")
	public String getVideoCoverImage() {
		return this.videoCoverImage;
	}

	public void setVideoCoverImage(String videoCoverImage) {
		this.videoCoverImage = videoCoverImage;
	}

	@Column(name = "progress", precision = 131089, scale = 0)
	public BigDecimal getProgress() {
		return this.progress;
	}

	public void setProgress(BigDecimal progress) {
		this.progress = progress;
	}

	@Column(name = "pledged", precision = 131089, scale = 0)
	public BigDecimal getPledged() {
		return this.pledged;
	}

	public void setPledged(BigDecimal pledged) {
		this.pledged = pledged;
	}

	@Column(name = "total_contributions")
	public Long getTotalContributions() {
		return this.totalContributions;
	}

	public void setTotalContributions(Long totalContributions) {
		this.totalContributions = totalContributions;
	}

	@Column(name = "total_contributors")
	public Long getTotalContributors() {
		return this.totalContributors;
	}

	public void setTotalContributors(Long totalContributors) {
		this.totalContributors = totalContributors;
	}

	@Column(name = "state")
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "mode")
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "state_order")
	public Serializable getStateOrder() {
		return this.stateOrder;
	}

	public void setStateOrder(Serializable stateOrder) {
		this.stateOrder = stateOrder;
	}

	@Column(name = "expires_at", length = 29)
	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	@Column(name = "zone_expires_at", length = 29)
	public Date getZoneExpiresAt() {
		return this.zoneExpiresAt;
	}

	public void setZoneExpiresAt(Date zoneExpiresAt) {
		this.zoneExpiresAt = zoneExpiresAt;
	}

	@Column(name = "online_date", length = 29)
	public Date getOnlineDate() {
		return this.onlineDate;
	}

	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}

	@Column(name = "zone_online_date", length = 29)
	public Date getZoneOnlineDate() {
		return this.zoneOnlineDate;
	}

	public void setZoneOnlineDate(Date zoneOnlineDate) {
		this.zoneOnlineDate = zoneOnlineDate;
	}

	@Column(name = "sent_to_analysis_at", length = 29)
	public Date getSentToAnalysisAt() {
		return this.sentToAnalysisAt;
	}

	public void setSentToAnalysisAt(Date sentToAnalysisAt) {
		this.sentToAnalysisAt = sentToAnalysisAt;
	}

	@Column(name = "is_published")
	public Boolean getIsPublished() {
		return this.isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	@Column(name = "is_expired")
	public Boolean getIsExpired() {
		return this.isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
	}

	@Column(name = "open_for_contributions")
	public Boolean getOpenForContributions() {
		return this.openForContributions;
	}

	public void setOpenForContributions(Boolean openForContributions) {
		this.openForContributions = openForContributions;
	}

	@Column(name = "online_days")
	public Integer getOnlineDays() {
		return this.onlineDays;
	}

	public void setOnlineDays(Integer onlineDays) {
		this.onlineDays = onlineDays;
	}

	@Column(name = "remaining_time")
	public Serializable getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(Serializable remainingTime) {
		this.remainingTime = remainingTime;
	}

	@Column(name = "elapsed_time")
	public Serializable getElapsedTime() {
		return this.elapsedTime;
	}

	public void setElapsedTime(Serializable elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	@Column(name = "posts_count")
	public Long getPostsCount() {
		return this.postsCount;
	}

	public void setPostsCount(Long postsCount) {
		this.postsCount = postsCount;
	}

	@Column(name = "address")
	public Serializable getAddress() {
		return this.address;
	}

	public void setAddress(Serializable address) {
		this.address = address;
	}

	@Column(name = "user")
	public Serializable getUser() {
		return this.user;
	}

	public void setUser(Serializable user) {
		this.user = user;
	}

	@Column(name = "reminder_count")
	public Long getReminderCount() {
		return this.reminderCount;
	}

	public void setReminderCount(Long reminderCount) {
		this.reminderCount = reminderCount;
	}

	@Column(name = "is_owner_or_admin")
	public Boolean getIsOwnerOrAdmin() {
		return this.isOwnerOrAdmin;
	}

	public void setIsOwnerOrAdmin(Boolean isOwnerOrAdmin) {
		this.isOwnerOrAdmin = isOwnerOrAdmin;
	}

	@Column(name = "user_signed_in")
	public Boolean getUserSignedIn() {
		return this.userSignedIn;
	}

	public void setUserSignedIn(Boolean userSignedIn) {
		this.userSignedIn = userSignedIn;
	}

	@Column(name = "in_reminder")
	public Boolean getInReminder() {
		return this.inReminder;
	}

	public void setInReminder(Boolean inReminder) {
		this.inReminder = inReminder;
	}

	@Column(name = "total_posts")
	public Long getTotalPosts() {
		return this.totalPosts;
	}

	public void setTotalPosts(Long totalPosts) {
		this.totalPosts = totalPosts;
	}

	@Column(name = "is_admin_role")
	public Boolean getIsAdminRole() {
		return this.isAdminRole;
	}

	public void setIsAdminRole(Boolean isAdminRole) {
		this.isAdminRole = isAdminRole;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectDetailsId))
			return false;
		ProjectDetailsId castOther = (ProjectDetailsId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null
						&& this.getId().equals(castOther.getId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getHeadline() == castOther.getHeadline()) || (this.getHeadline() != null
						&& castOther.getHeadline() != null && this.getHeadline().equals(castOther.getHeadline())))
				&& ((this.getBudget() == castOther.getBudget()) || (this.getBudget() != null
						&& castOther.getBudget() != null && this.getBudget().equals(castOther.getBudget())))
				&& ((this.getGoal() == castOther.getGoal()) || (this.getGoal() != null && castOther.getGoal() != null
						&& this.getGoal().equals(castOther.getGoal())))
				&& ((this.getAboutHtml() == castOther.getAboutHtml()) || (this.getAboutHtml() != null
						&& castOther.getAboutHtml() != null && this.getAboutHtml().equals(castOther.getAboutHtml())))
				&& ((this.getPermalink() == castOther.getPermalink()) || (this.getPermalink() != null
						&& castOther.getPermalink() != null && this.getPermalink().equals(castOther.getPermalink())))
				&& ((this.getVideoEmbedUrl() == castOther.getVideoEmbedUrl())
						|| (this.getVideoEmbedUrl() != null && castOther.getVideoEmbedUrl() != null
								&& this.getVideoEmbedUrl().equals(castOther.getVideoEmbedUrl())))
				&& ((this.getVideoUrl() == castOther.getVideoUrl()) || (this.getVideoUrl() != null
						&& castOther.getVideoUrl() != null && this.getVideoUrl().equals(castOther.getVideoUrl())))
				&& ((this.getCategoryName() == castOther.getCategoryName())
						|| (this.getCategoryName() != null && castOther.getCategoryName() != null
								&& this.getCategoryName().equals(castOther.getCategoryName())))
				&& ((this.getCategoryId() == castOther.getCategoryId()) || (this.getCategoryId() != null
						&& castOther.getCategoryId() != null && this.getCategoryId().equals(castOther.getCategoryId())))
				&& ((this.getOriginalImage() == castOther.getOriginalImage())
						|| (this.getOriginalImage() != null && castOther.getOriginalImage() != null
								&& this.getOriginalImage().equals(castOther.getOriginalImage())))
				&& ((this.getThumbImage() == castOther.getThumbImage()) || (this.getThumbImage() != null
						&& castOther.getThumbImage() != null && this.getThumbImage().equals(castOther.getThumbImage())))
				&& ((this.getSmallImage() == castOther.getSmallImage()) || (this.getSmallImage() != null
						&& castOther.getSmallImage() != null && this.getSmallImage().equals(castOther.getSmallImage())))
				&& ((this.getLargeImage() == castOther.getLargeImage()) || (this.getLargeImage() != null
						&& castOther.getLargeImage() != null && this.getLargeImage().equals(castOther.getLargeImage())))
				&& ((this.getVideoCoverImage() == castOther.getVideoCoverImage())
						|| (this.getVideoCoverImage() != null && castOther.getVideoCoverImage() != null
								&& this.getVideoCoverImage().equals(castOther.getVideoCoverImage())))
				&& ((this.getProgress() == castOther.getProgress()) || (this.getProgress() != null
						&& castOther.getProgress() != null && this.getProgress().equals(castOther.getProgress())))
				&& ((this.getPledged() == castOther.getPledged()) || (this.getPledged() != null
						&& castOther.getPledged() != null && this.getPledged().equals(castOther.getPledged())))
				&& ((this.getTotalContributions() == castOther.getTotalContributions())
						|| (this.getTotalContributions() != null && castOther.getTotalContributions() != null
								&& this.getTotalContributions().equals(castOther.getTotalContributions())))
				&& ((this.getTotalContributors() == castOther.getTotalContributors())
						|| (this.getTotalContributors() != null && castOther.getTotalContributors() != null
								&& this.getTotalContributors().equals(castOther.getTotalContributors())))
				&& ((this.getState() == castOther.getState()) || (this.getState() != null
						&& castOther.getState() != null && this.getState().equals(castOther.getState())))
				&& ((this.getMode() == castOther.getMode()) || (this.getMode() != null && castOther.getMode() != null
						&& this.getMode().equals(castOther.getMode())))
				&& ((this.getStateOrder() == castOther.getStateOrder()) || (this.getStateOrder() != null
						&& castOther.getStateOrder() != null && this.getStateOrder().equals(castOther.getStateOrder())))
				&& ((this.getExpiresAt() == castOther.getExpiresAt()) || (this.getExpiresAt() != null
						&& castOther.getExpiresAt() != null && this.getExpiresAt().equals(castOther.getExpiresAt())))
				&& ((this.getZoneExpiresAt() == castOther.getZoneExpiresAt())
						|| (this.getZoneExpiresAt() != null && castOther.getZoneExpiresAt() != null
								&& this.getZoneExpiresAt().equals(castOther.getZoneExpiresAt())))
				&& ((this.getOnlineDate() == castOther.getOnlineDate()) || (this.getOnlineDate() != null
						&& castOther.getOnlineDate() != null && this.getOnlineDate().equals(castOther.getOnlineDate())))
				&& ((this.getZoneOnlineDate() == castOther.getZoneOnlineDate())
						|| (this.getZoneOnlineDate() != null && castOther.getZoneOnlineDate() != null
								&& this.getZoneOnlineDate().equals(castOther.getZoneOnlineDate())))
				&& ((this.getSentToAnalysisAt() == castOther.getSentToAnalysisAt())
						|| (this.getSentToAnalysisAt() != null && castOther.getSentToAnalysisAt() != null
								&& this.getSentToAnalysisAt().equals(castOther.getSentToAnalysisAt())))
				&& ((this.getIsPublished() == castOther.getIsPublished())
						|| (this.getIsPublished() != null && castOther.getIsPublished() != null
								&& this.getIsPublished().equals(castOther.getIsPublished())))
				&& ((this.getIsExpired() == castOther.getIsExpired()) || (this.getIsExpired() != null
						&& castOther.getIsExpired() != null && this.getIsExpired().equals(castOther.getIsExpired())))
				&& ((this.getOpenForContributions() == castOther.getOpenForContributions())
						|| (this.getOpenForContributions() != null && castOther.getOpenForContributions() != null
								&& this.getOpenForContributions().equals(castOther.getOpenForContributions())))
				&& ((this.getOnlineDays() == castOther.getOnlineDays()) || (this.getOnlineDays() != null
						&& castOther.getOnlineDays() != null && this.getOnlineDays().equals(castOther.getOnlineDays())))
				&& ((this.getRemainingTime() == castOther.getRemainingTime())
						|| (this.getRemainingTime() != null && castOther.getRemainingTime() != null
								&& this.getRemainingTime().equals(castOther.getRemainingTime())))
				&& ((this.getElapsedTime() == castOther.getElapsedTime())
						|| (this.getElapsedTime() != null && castOther.getElapsedTime() != null
								&& this.getElapsedTime().equals(castOther.getElapsedTime())))
				&& ((this.getPostsCount() == castOther.getPostsCount()) || (this.getPostsCount() != null
						&& castOther.getPostsCount() != null && this.getPostsCount().equals(castOther.getPostsCount())))
				&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
				&& ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
						&& this.getUser().equals(castOther.getUser())))
				&& ((this.getReminderCount() == castOther.getReminderCount())
						|| (this.getReminderCount() != null && castOther.getReminderCount() != null
								&& this.getReminderCount().equals(castOther.getReminderCount())))
				&& ((this.getIsOwnerOrAdmin() == castOther.getIsOwnerOrAdmin())
						|| (this.getIsOwnerOrAdmin() != null && castOther.getIsOwnerOrAdmin() != null
								&& this.getIsOwnerOrAdmin().equals(castOther.getIsOwnerOrAdmin())))
				&& ((this.getUserSignedIn() == castOther.getUserSignedIn())
						|| (this.getUserSignedIn() != null && castOther.getUserSignedIn() != null
								&& this.getUserSignedIn().equals(castOther.getUserSignedIn())))
				&& ((this.getInReminder() == castOther.getInReminder()) || (this.getInReminder() != null
						&& castOther.getInReminder() != null && this.getInReminder().equals(castOther.getInReminder())))
				&& ((this.getTotalPosts() == castOther.getTotalPosts()) || (this.getTotalPosts() != null
						&& castOther.getTotalPosts() != null && this.getTotalPosts().equals(castOther.getTotalPosts())))
				&& ((this.getIsAdminRole() == castOther.getIsAdminRole())
						|| (this.getIsAdminRole() != null && castOther.getIsAdminRole() != null
								&& this.getIsAdminRole().equals(castOther.getIsAdminRole())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getHeadline() == null ? 0 : this.getHeadline().hashCode());
		result = 37 * result + (getBudget() == null ? 0 : this.getBudget().hashCode());
		result = 37 * result + (getGoal() == null ? 0 : this.getGoal().hashCode());
		result = 37 * result + (getAboutHtml() == null ? 0 : this.getAboutHtml().hashCode());
		result = 37 * result + (getPermalink() == null ? 0 : this.getPermalink().hashCode());
		result = 37 * result + (getVideoEmbedUrl() == null ? 0 : this.getVideoEmbedUrl().hashCode());
		result = 37 * result + (getVideoUrl() == null ? 0 : this.getVideoUrl().hashCode());
		result = 37 * result + (getCategoryName() == null ? 0 : this.getCategoryName().hashCode());
		result = 37 * result + (getCategoryId() == null ? 0 : this.getCategoryId().hashCode());
		result = 37 * result + (getOriginalImage() == null ? 0 : this.getOriginalImage().hashCode());
		result = 37 * result + (getThumbImage() == null ? 0 : this.getThumbImage().hashCode());
		result = 37 * result + (getSmallImage() == null ? 0 : this.getSmallImage().hashCode());
		result = 37 * result + (getLargeImage() == null ? 0 : this.getLargeImage().hashCode());
		result = 37 * result + (getVideoCoverImage() == null ? 0 : this.getVideoCoverImage().hashCode());
		result = 37 * result + (getProgress() == null ? 0 : this.getProgress().hashCode());
		result = 37 * result + (getPledged() == null ? 0 : this.getPledged().hashCode());
		result = 37 * result + (getTotalContributions() == null ? 0 : this.getTotalContributions().hashCode());
		result = 37 * result + (getTotalContributors() == null ? 0 : this.getTotalContributors().hashCode());
		result = 37 * result + (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result + (getMode() == null ? 0 : this.getMode().hashCode());
		result = 37 * result + (getStateOrder() == null ? 0 : this.getStateOrder().hashCode());
		result = 37 * result + (getExpiresAt() == null ? 0 : this.getExpiresAt().hashCode());
		result = 37 * result + (getZoneExpiresAt() == null ? 0 : this.getZoneExpiresAt().hashCode());
		result = 37 * result + (getOnlineDate() == null ? 0 : this.getOnlineDate().hashCode());
		result = 37 * result + (getZoneOnlineDate() == null ? 0 : this.getZoneOnlineDate().hashCode());
		result = 37 * result + (getSentToAnalysisAt() == null ? 0 : this.getSentToAnalysisAt().hashCode());
		result = 37 * result + (getIsPublished() == null ? 0 : this.getIsPublished().hashCode());
		result = 37 * result + (getIsExpired() == null ? 0 : this.getIsExpired().hashCode());
		result = 37 * result + (getOpenForContributions() == null ? 0 : this.getOpenForContributions().hashCode());
		result = 37 * result + (getOnlineDays() == null ? 0 : this.getOnlineDays().hashCode());
		result = 37 * result + (getRemainingTime() == null ? 0 : this.getRemainingTime().hashCode());
		result = 37 * result + (getElapsedTime() == null ? 0 : this.getElapsedTime().hashCode());
		result = 37 * result + (getPostsCount() == null ? 0 : this.getPostsCount().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getReminderCount() == null ? 0 : this.getReminderCount().hashCode());
		result = 37 * result + (getIsOwnerOrAdmin() == null ? 0 : this.getIsOwnerOrAdmin().hashCode());
		result = 37 * result + (getUserSignedIn() == null ? 0 : this.getUserSignedIn().hashCode());
		result = 37 * result + (getInReminder() == null ? 0 : this.getInReminder().hashCode());
		result = 37 * result + (getTotalPosts() == null ? 0 : this.getTotalPosts().hashCode());
		result = 37 * result + (getIsAdminRole() == null ? 0 : this.getIsAdminRole().hashCode());
		return result;
	}

}
