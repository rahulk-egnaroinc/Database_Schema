package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BalanceTransferTransitions generated by hbm2java
 */
@Entity
@Table(name = "balance_transfer_transitions", schema = "1")
public class BalanceTransferTransitions implements java.io.Serializable {

	private BalanceTransferTransitionsId id;

	public BalanceTransferTransitions() {
	}

	public BalanceTransferTransitions(BalanceTransferTransitionsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "balanceTransferId", column = @Column(name = "balance_transfer_id") ),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "state", column = @Column(name = "state") ),
			@AttributeOverride(name = "metadata", column = @Column(name = "metadata") ),
			@AttributeOverride(name = "mostRecent", column = @Column(name = "most_recent") ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29) ) })
	public BalanceTransferTransitionsId getId() {
		return this.id;
	}

	public void setId(BalanceTransferTransitionsId id) {
		this.id = id;
	}

}
