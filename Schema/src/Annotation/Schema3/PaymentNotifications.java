package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

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
 * PaymentNotifications generated by hbm2java
 */
@Entity
@Table(name = "payment_notifications", schema = "public")
public class PaymentNotifications implements java.io.Serializable {

	private int id;
	private Contributions contributions;
	private Payments payments;
	private String extraData;
	private Date createdAt;
	private Date updatedAt;

	public PaymentNotifications() {
	}

	public PaymentNotifications(int id, Contributions contributions, Date createdAt, Date updatedAt) {
		this.id = id;
		this.contributions = contributions;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public PaymentNotifications(int id, Contributions contributions, Payments payments, String extraData,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.contributions = contributions;
		this.payments = payments;
		this.extraData = extraData;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	@JoinColumn(name = "contribution_id", nullable = false)
	public Contributions getContributions() {
		return this.contributions;
	}

	public void setContributions(Contributions contributions) {
		this.contributions = contributions;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_id")
	public Payments getPayments() {
		return this.payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	@Column(name = "extra_data")
	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
