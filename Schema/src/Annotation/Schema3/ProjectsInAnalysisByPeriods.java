package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectsInAnalysisByPeriods generated by hbm2java
 */
@Entity
@Table(name = "projects_in_analysis_by_periods", schema = "public")
public class ProjectsInAnalysisByPeriods implements java.io.Serializable {

	private ProjectsInAnalysisByPeriodsId id;

	public ProjectsInAnalysisByPeriods() {
	}

	public ProjectsInAnalysisByPeriods(ProjectsInAnalysisByPeriodsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "label", column = @Column(name = "label", length = 35) ),
			@AttributeOverride(name = "currentYear", column = @Column(name = "current_year") ),
			@AttributeOverride(name = "lastYear", column = @Column(name = "last_year") ) })
	public ProjectsInAnalysisByPeriodsId getId() {
		return this.id;
	}

	public void setId(ProjectsInAnalysisByPeriodsId id) {
		this.id = id;
	}

}