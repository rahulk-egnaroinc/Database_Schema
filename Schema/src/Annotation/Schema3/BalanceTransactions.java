package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
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
import javax.persistence.UniqueConstraint;

/**
 * BalanceTransactions generated by hbm2java
 */
@Entity
@Table(name = "balance_transactions", schema = "public", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "project_id", "event_name", "user_id" }),
		@UniqueConstraint(columnNames = { "contribution_id", "event_name", "user_id" }) })
public class BalanceTransactions implements java.io.Serializable {

	private int id;
	private Contributions contributions;
	private Users users;
	private BalanceTransfers balanceTransfers;
	private Projects projects;
	private String eventName;
	private Date createdAt;
	private Date updatedAt;
	private BigDecimal amount;

	public BalanceTransactions() {
	}

	public BalanceTransactions(int id, Users users, String eventName, BigDecimal amount) {
		this.id = id;
		this.users = users;
		this.eventName = eventName;
		this.amount = amount;
	}

	public BalanceTransactions(int id, Contributions contributions, Users users, BalanceTransfers balanceTransfers,
			Projects projects, String eventName, Date createdAt, Date updatedAt, BigDecimal amount) {
		this.id = id;
		this.contributions = contributions;
		this.users = users;
		this.balanceTransfers = balanceTransfers;
		this.projects = projects;
		this.eventName = eventName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.amount = amount;
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
	@JoinColumn(name = "contribution_id")
	public Contributions getContributions() {
		return this.contributions;
	}

	public void setContributions(Contributions contributions) {
		this.contributions = contributions;
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
	@JoinColumn(name = "balance_transfer_id")
	public BalanceTransfers getBalanceTransfers() {
		return this.balanceTransfers;
	}

	public void setBalanceTransfers(BalanceTransfers balanceTransfers) {
		this.balanceTransfers = balanceTransfers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Column(name = "event_name", nullable = false)
	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	@Column(name = "amount", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
