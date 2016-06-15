package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * UserTransferNotifications generated by hbm2java
 */
public class UserTransferNotifications implements java.io.Serializable {

	private int id;
	private UserTransfers userTransfers;
	private Users users;
	private String fromEmail;
	private String fromName;
	private String templateName;
	private String locale;
	private Date sentAt;
	private Date deliverAt;
	private Date createdAt;
	private Date updatedAt;
	private String cc;

	public UserTransferNotifications() {
	}

	public UserTransferNotifications(int id, UserTransfers userTransfers, Users users, String fromEmail,
			String fromName, String templateName, String locale) {
		this.id = id;
		this.userTransfers = userTransfers;
		this.users = users;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
	}

	public UserTransferNotifications(int id, UserTransfers userTransfers, Users users, String fromEmail,
			String fromName, String templateName, String locale, Date sentAt, Date deliverAt, Date createdAt,
			Date updatedAt, String cc) {
		this.id = id;
		this.userTransfers = userTransfers;
		this.users = users;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.sentAt = sentAt;
		this.deliverAt = deliverAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.cc = cc;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserTransfers getUserTransfers() {
		return this.userTransfers;
	}

	public void setUserTransfers(UserTransfers userTransfers) {
		this.userTransfers = userTransfers;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Date getSentAt() {
		return this.sentAt;
	}

	public void setSentAt(Date sentAt) {
		this.sentAt = sentAt;
	}

	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
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

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

}
