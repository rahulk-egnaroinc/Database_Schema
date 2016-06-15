package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.Date;

/**
 * PaymentTransfers generated by hbm2java
 */
public class PaymentTransfers implements java.io.Serializable {

	private int id;
	private Users users;
	private Payments payments;
	private String transferId;
	private Serializable transferData;
	private Date createdAt;
	private Date updatedAt;

	public PaymentTransfers() {
	}

	public PaymentTransfers(int id, Users users, Payments payments, String transferId) {
		this.id = id;
		this.users = users;
		this.payments = payments;
		this.transferId = transferId;
	}

	public PaymentTransfers(int id, Users users, Payments payments, String transferId, Serializable transferData,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.users = users;
		this.payments = payments;
		this.transferId = transferId;
		this.transferData = transferData;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Payments getPayments() {
		return this.payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	public String getTransferId() {
		return this.transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public Serializable getTransferData() {
		return this.transferData;
	}

	public void setTransferData(Serializable transferData) {
		this.transferData = transferData;
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

}
