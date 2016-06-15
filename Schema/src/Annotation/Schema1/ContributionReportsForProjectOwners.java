package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ContributionReportsForProjectOwners generated by hbm2java
 */
@Entity
@Table(name = "contribution_reports_for_project_owners", schema = "1")
public class ContributionReportsForProjectOwners implements java.io.Serializable {

	private ContributionReportsForProjectOwnersId id;

	public ContributionReportsForProjectOwners() {
	}

	public ContributionReportsForProjectOwners(ContributionReportsForProjectOwnersId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "rewardId", column = @Column(name = "reward_id") ),
			@AttributeOverride(name = "projectOwnerId", column = @Column(name = "project_owner_id") ),
			@AttributeOverride(name = "rewardDescription", column = @Column(name = "reward_description") ),
			@AttributeOverride(name = "deliverAt", column = @Column(name = "deliver_at", length = 13) ),
			@AttributeOverride(name = "confirmedAt", column = @Column(name = "confirmed_at", length = 13) ),
			@AttributeOverride(name = "contributionValue", column = @Column(name = "contribution_value", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "serviceFee", column = @Column(name = "service_fee", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "userEmail", column = @Column(name = "user_email") ),
			@AttributeOverride(name = "cpf", column = @Column(name = "cpf") ),
			@AttributeOverride(name = "userName", column = @Column(name = "user_name") ),
			@AttributeOverride(name = "payerEmail", column = @Column(name = "payer_email") ),
			@AttributeOverride(name = "gateway", column = @Column(name = "gateway") ),
			@AttributeOverride(name = "anonymous", column = @Column(name = "anonymous") ),
			@AttributeOverride(name = "state", column = @Column(name = "state") ),
			@AttributeOverride(name = "waitingPayment", column = @Column(name = "waiting_payment") ),
			@AttributeOverride(name = "street", column = @Column(name = "street") ),
			@AttributeOverride(name = "complement", column = @Column(name = "complement") ),
			@AttributeOverride(name = "addressNumber", column = @Column(name = "address_number") ),
			@AttributeOverride(name = "neighbourhood", column = @Column(name = "neighbourhood") ),
			@AttributeOverride(name = "city", column = @Column(name = "city") ),
			@AttributeOverride(name = "addressState", column = @Column(name = "address_state") ),
			@AttributeOverride(name = "zipCode", column = @Column(name = "zip_code") ) })
	public ContributionReportsForProjectOwnersId getId() {
		return this.id;
	}

	public void setId(ContributionReportsForProjectOwnersId id) {
		this.id = id;
	}

}
