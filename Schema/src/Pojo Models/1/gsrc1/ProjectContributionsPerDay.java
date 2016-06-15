package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectContributionsPerDay generated by hbm2java
 */
@Entity
@Table(name = "project_contributions_per_day", schema = "1")
public class ProjectContributionsPerDay implements java.io.Serializable {

	private ProjectContributionsPerDayId id;

	public ProjectContributionsPerDay() {
	}

	public ProjectContributionsPerDay(ProjectContributionsPerDayId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "source", column = @Column(name = "source") ) })
	public ProjectContributionsPerDayId getId() {
		return this.id;
	}

	public void setId(ProjectContributionsPerDayId id) {
		this.id = id;
	}

}
