package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ChannelPostNotifications generated by hbm2java
 */
@Entity
@Table(name = "channel_post_notifications", schema = "public")
public class ChannelPostNotifications implements java.io.Serializable {

	private int id;
	private Users users;
	private ChannelPosts channelPosts;
	private String fromEmail;
	private String fromName;
	private String templateName;
	private String locale;
	private Date sentAt;
	private Date createdAt;
	private Date updatedAt;
	private Date deliverAt;

	public ChannelPostNotifications() {
	}

	public ChannelPostNotifications(int id, Users users, ChannelPosts channelPosts, String fromEmail, String fromName,
			String templateName, String locale) {
		this.id = id;
		this.users = users;
		this.channelPosts = channelPosts;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
	}

	public ChannelPostNotifications(int id, Users users, ChannelPosts channelPosts, String fromEmail, String fromName,
			String templateName, String locale, Date sentAt, Date createdAt, Date updatedAt, Date deliverAt) {
		this.id = id;
		this.users = users;
		this.channelPosts = channelPosts;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.sentAt = sentAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deliverAt = deliverAt;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "channel_post_id", nullable = false)
	public ChannelPosts getChannelPosts() {
		return this.channelPosts;
	}

	public void setChannelPosts(ChannelPosts channelPosts) {
		this.channelPosts = channelPosts;
	}

	@Column(name = "from_email", nullable = false)
	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	@Column(name = "from_name", nullable = false)
	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Column(name = "template_name", nullable = false)
	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@Column(name = "locale", nullable = false)
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sent_at", length = 29)
	public Date getSentAt() {
		return this.sentAt;
	}

	public void setSentAt(Date sentAt) {
		this.sentAt = sentAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deliver_at", length = 29)
	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
	}

}
