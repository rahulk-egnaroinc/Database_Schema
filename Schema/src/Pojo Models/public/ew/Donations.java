package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Donations generated by hbm2java
 */
@Entity
@Table(name = "donations", schema = "public")
public class Donations implements java.io.Serializable {

	private int id;
	private Users users;
	private Date createdAt;
	private Date updatedAt;
	private Integer amount;
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);
	private Set<DonationNotifications> donationNotificationses = new HashSet<DonationNotifications>(0);

	public Donations() {
	}

	public Donations(int id) {
		this.id = id;
	}

	public Donations(int id, Users users, Date createdAt, Date updatedAt, Integer amount,
			Set<Contributions> contributionses, Set<DonationNotifications> donationNotificationses) {
		this.id = id;
		this.users = users;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.amount = amount;
		this.contributionses = contributionses;
		this.donationNotificationses = donationNotificationses;
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
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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

	@Column(name = "amount")
	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donations")
	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donations")
	public Set<DonationNotifications> getDonationNotificationses() {
		return this.donationNotificationses;
	}

	public void setDonationNotificationses(Set<DonationNotifications> donationNotificationses) {
		this.donationNotificationses = donationNotificationses;
	}

}
