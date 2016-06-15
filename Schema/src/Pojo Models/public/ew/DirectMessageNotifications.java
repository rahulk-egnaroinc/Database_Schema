package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
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
 * DirectMessageNotifications generated by hbm2java
 */
@Entity
@Table(name = "direct_message_notifications", schema = "public")
public class DirectMessageNotifications implements java.io.Serializable {

	private int id;
	private Users users;
	private DirectMessages directMessages;
	private String fromEmail;
	private String fromName;
	private String templateName;
	private String locale;
	private Date sentAt;
	private Date deliverAt;
	private Date createdAt;
	private Date updatedAt;
	private Serializable metadata;
	private String cc;

	public DirectMessageNotifications() {
	}

	public DirectMessageNotifications(int id, Users users, DirectMessages directMessages, String fromEmail,
			String fromName, String templateName, String locale, Serializable metadata) {
		this.id = id;
		this.users = users;
		this.directMessages = directMessages;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.metadata = metadata;
	}

	public DirectMessageNotifications(int id, Users users, DirectMessages directMessages, String fromEmail,
			String fromName, String templateName, String locale, Date sentAt, Date deliverAt, Date createdAt,
			Date updatedAt, Serializable metadata, String cc) {
		this.id = id;
		this.users = users;
		this.directMessages = directMessages;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.sentAt = sentAt;
		this.deliverAt = deliverAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.metadata = metadata;
		this.cc = cc;
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
	@JoinColumn(name = "direct_message_id", nullable = false)
	public DirectMessages getDirectMessages() {
		return this.directMessages;
	}

	public void setDirectMessages(DirectMessages directMessages) {
		this.directMessages = directMessages;
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
	@Column(name = "deliver_at", length = 29)
	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
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

	@Column(name = "metadata", nullable = false)
	public Serializable getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Serializable metadata) {
		this.metadata = metadata;
	}

	@Column(name = "cc")
	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

}
