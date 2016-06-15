package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * CategoryFollowers generated by hbm2java
 */
public class CategoryFollowers implements java.io.Serializable {

	private int id;
	private Users users;
	private Categories categories;
	private Date createdAt;
	private Date updatedAt;

	public CategoryFollowers() {
	}

	public CategoryFollowers(int id, Users users, Categories categories) {
		this.id = id;
		this.users = users;
		this.categories = categories;
	}

	public CategoryFollowers(int id, Users users, Categories categories, Date createdAt, Date updatedAt) {
		this.id = id;
		this.users = users;
		this.categories = categories;
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

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
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
