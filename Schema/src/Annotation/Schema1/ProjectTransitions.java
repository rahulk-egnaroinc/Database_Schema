package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectTransitions generated by hbm2java
 */
@Entity
@Table(name = "project_transitions", schema = "1")
public class ProjectTransitions implements java.io.Serializable {

	private ProjectTransitionsId id;

	public ProjectTransitions() {
	}

	public ProjectTransitions(ProjectTransitionsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "state", column = @Column(name = "state") ),
			@AttributeOverride(name = "metadata", column = @Column(name = "metadata") ),
			@AttributeOverride(name = "mostRecent", column = @Column(name = "most_recent") ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29) ) })
	public ProjectTransitionsId getId() {
		return this.id;
	}

	public void setId(ProjectTransitionsId id) {
		this.id = id;
	}

}
