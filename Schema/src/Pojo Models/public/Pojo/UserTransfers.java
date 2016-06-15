package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserTransfers generated by hbm2java
 */
public class UserTransfers implements java.io.Serializable {

	private int id;
	private Users users;
	private String status;
	private int amount;
	private Serializable transferData;
	private Integer gatewayId;
	private Date createdAt;
	private Date updatedAt;
	private Set<UserTransferNotifications> userTransferNotificationses = new HashSet<UserTransferNotifications>(0);

	public UserTransfers() {
	}

	public UserTransfers(int id, Users users, String status, int amount) {
		this.id = id;
		this.users = users;
		this.status = status;
		this.amount = amount;
	}

	public UserTransfers(int id, Users users, String status, int amount, Serializable transferData, Integer gatewayId,
			Date createdAt, Date updatedAt, Set<UserTransferNotifications> userTransferNotificationses) {
		this.id = id;
		this.users = users;
		this.status = status;
		this.amount = amount;
		this.transferData = transferData;
		this.gatewayId = gatewayId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userTransferNotificationses = userTransferNotificationses;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Serializable getTransferData() {
		return this.transferData;
	}

	public void setTransferData(Serializable transferData) {
		this.transferData = transferData;
	}

	public Integer getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
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

	public Set<UserTransferNotifications> getUserTransferNotificationses() {
		return this.userTransferNotificationses;
	}

	public void setUserTransferNotificationses(Set<UserTransferNotifications> userTransferNotificationses) {
		this.userTransferNotificationses = userTransferNotificationses;
	}

}
