package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Recommendations generated by hbm2java
 */
@Entity
@Table(name = "recommendations", schema = "1")
public class Recommendations implements java.io.Serializable {

	private RecommendationsId id;

	public Recommendations() {
	}

	public Recommendations(RecommendationsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "count", column = @Column(name = "count") ) })
	public RecommendationsId getId() {
		return this.id;
	}

	public void setId(RecommendationsId id) {
		this.id = id;
	}

}
