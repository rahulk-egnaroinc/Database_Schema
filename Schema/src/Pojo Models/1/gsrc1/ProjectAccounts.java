package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectAccounts generated by hbm2java
 */
@Entity
@Table(name = "project_accounts", schema = "1")
public class ProjectAccounts implements java.io.Serializable {

	private ProjectAccountsId id;

	public ProjectAccounts() {
	}

	public ProjectAccounts(ProjectAccountsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id") ),
			@AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "userEmail", column = @Column(name = "user_email") ),
			@AttributeOverride(name = "bankName", column = @Column(name = "bank_name") ),
			@AttributeOverride(name = "bankCode", column = @Column(name = "bank_code") ),
			@AttributeOverride(name = "agency", column = @Column(name = "agency") ),
			@AttributeOverride(name = "agencyDigit", column = @Column(name = "agency_digit") ),
			@AttributeOverride(name = "account", column = @Column(name = "account") ),
			@AttributeOverride(name = "accountDigit", column = @Column(name = "account_digit") ),
			@AttributeOverride(name = "accountType", column = @Column(name = "account_type") ),
			@AttributeOverride(name = "ownerName", column = @Column(name = "owner_name") ),
			@AttributeOverride(name = "ownerDocument", column = @Column(name = "owner_document") ),
			@AttributeOverride(name = "stateInscription", column = @Column(name = "state_inscription") ),
			@AttributeOverride(name = "addressStreet", column = @Column(name = "address_street") ),
			@AttributeOverride(name = "addressNumber", column = @Column(name = "address_number") ),
			@AttributeOverride(name = "addressComplement", column = @Column(name = "address_complement") ),
			@AttributeOverride(name = "addressNeighbourhood", column = @Column(name = "address_neighbourhood") ),
			@AttributeOverride(name = "addressCity", column = @Column(name = "address_city") ),
			@AttributeOverride(name = "addressState", column = @Column(name = "address_state") ),
			@AttributeOverride(name = "addressZipCode", column = @Column(name = "address_zip_code") ),
			@AttributeOverride(name = "phoneNumber", column = @Column(name = "phone_number") ),
			@AttributeOverride(name = "errorReason", column = @Column(name = "error_reason") ),
			@AttributeOverride(name = "transferState", column = @Column(name = "transfer_state") ),
			@AttributeOverride(name = "transferLimitDate", column = @Column(name = "transfer_limit_date", length = 29) ) })
	public ProjectAccountsId getId() {
		return this.id;
	}

	public void setId(ProjectAccountsId id) {
		this.id = id;
	}

}
