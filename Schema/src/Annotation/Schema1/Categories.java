package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", schema = "1")
public class Categories implements java.io.Serializable {

	private CategoriesId id;

	public Categories() {
	}

	public Categories(CategoriesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id") ),
			@AttributeOverride(name = "name", column = @Column(name = "name") ),
			@AttributeOverride(name = "onlineProjects", column = @Column(name = "online_projects") ),
			@AttributeOverride(name = "followers", column = @Column(name = "followers") ),
			@AttributeOverride(name = "following", column = @Column(name = "following") ) })
	public CategoriesId getId() {
		return this.id;
	}

	public void setId(CategoriesId id) {
		this.id = id;
	}

}
