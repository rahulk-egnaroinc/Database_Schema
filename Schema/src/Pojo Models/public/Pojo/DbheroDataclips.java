package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * DbheroDataclips generated by hbm2java
 */
public class DbheroDataclips implements java.io.Serializable {

	private int id;
	private String description;
	private String rawQuery;
	private String token;
	private String user;
	private boolean private_;
	private Date createdAt;
	private Date updatedAt;

	public DbheroDataclips() {
	}

	public DbheroDataclips(int id, String description, String rawQuery, String token, boolean private_, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.description = description;
		this.rawQuery = rawQuery;
		this.token = token;
		this.private_ = private_;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public DbheroDataclips(int id, String description, String rawQuery, String token, String user, boolean private_,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.description = description;
		this.rawQuery = rawQuery;
		this.token = token;
		this.user = user;
		this.private_ = private_;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRawQuery() {
		return this.rawQuery;
	}

	public void setRawQuery(String rawQuery) {
		this.rawQuery = rawQuery;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean isPrivate_() {
		return this.private_;
	}

	public void setPrivate_(boolean private_) {
		this.private_ = private_;
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
