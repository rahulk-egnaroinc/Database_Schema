package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectContributionsPerLocation generated by hbm2java
 */
@Entity
@Table(name = "project_contributions_per_location", schema = "1")
public class ProjectContributionsPerLocation implements java.io.Serializable {

	private ProjectContributionsPerLocationId id;

	public ProjectContributionsPerLocation() {
	}

	public ProjectContributionsPerLocation(ProjectContributionsPerLocationId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "source", column = @Column(name = "source") ) })
	public ProjectContributionsPerLocationId getId() {
		return this.id;
	}

	public void setId(ProjectContributionsPerLocationId id) {
		this.id = id;
	}

}
