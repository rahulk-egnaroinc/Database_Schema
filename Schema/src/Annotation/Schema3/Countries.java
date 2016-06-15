package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Countries generated by hbm2java
 */
@Entity
@Table(name = "countries", schema = "public")
public class Countries implements java.io.Serializable {

	private int id;
	private String name;
	private Date createdAt;
	private Date updatedAt;
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);

	public Countries() {
	}

	public Countries(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Countries(int id, String name, Date createdAt, Date updatedAt, Set<Users> userses,
			Set<Contributions> contributionses) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userses = userses;
		this.contributionses = contributionses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countries")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countries")
	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

}
