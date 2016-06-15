package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Settings generated by hbm2java
 */
@Entity
@Table(name = "settings", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "name") )
public class Settings implements java.io.Serializable {

	private int id;
	private String name;
	private String value;
	private Date createdAt;
	private Date updatedAt;

	public Settings() {
	}

	public Settings(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Settings(int id, String name, String value, Date createdAt, Date updatedAt) {
		this.id = id;
		this.name = name;
		this.value = value;
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

	@Column(name = "name", unique = true, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value")
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
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

}
