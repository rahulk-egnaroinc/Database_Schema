package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BankAccountsId generated by hbm2java
 */
@Embeddable
public class BankAccountsId implements java.io.Serializable {

	private Integer userId;
	private String bankName;
	private String bankCode;
	private String account;
	private String accountDigit;
	private String agency;
	private String agencyDigit;
	private String ownerName;
	private String ownerDocument;
	private Date createdAt;
	private Date updatedAt;

	public BankAccountsId() {
	}

	public BankAccountsId(Integer userId, String bankName, String bankCode, String account, String accountDigit,
			String agency, String agencyDigit, String ownerName, String ownerDocument, Date createdAt, Date updatedAt) {
		this.userId = userId;
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.account = account;
		this.accountDigit = accountDigit;
		this.agency = agency;
		this.agencyDigit = agencyDigit;
		this.ownerName = ownerName;
		this.ownerDocument = ownerDocument;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "bank_name")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "bank_code")
	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Column(name = "account")
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "account_digit")
	public String getAccountDigit() {
		return this.accountDigit;
	}

	public void setAccountDigit(String accountDigit) {
		this.accountDigit = accountDigit;
	}

	@Column(name = "agency")
	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	@Column(name = "agency_digit")
	public String getAgencyDigit() {
		return this.agencyDigit;
	}

	public void setAgencyDigit(String agencyDigit) {
		this.agencyDigit = agencyDigit;
	}

	@Column(name = "owner_name")
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Column(name = "owner_document")
	public String getOwnerDocument() {
		return this.ownerDocument;
	}

	public void setOwnerDocument(String ownerDocument) {
		this.ownerDocument = ownerDocument;
	}

	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "updated_at", length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BankAccountsId))
			return false;
		BankAccountsId castOther = (BankAccountsId) other;

		return ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
				&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getBankName() == castOther.getBankName()) || (this.getBankName() != null
						&& castOther.getBankName() != null && this.getBankName().equals(castOther.getBankName())))
				&& ((this.getBankCode() == castOther.getBankCode()) || (this.getBankCode() != null
						&& castOther.getBankCode() != null && this.getBankCode().equals(castOther.getBankCode())))
				&& ((this.getAccount() == castOther.getAccount()) || (this.getAccount() != null
						&& castOther.getAccount() != null && this.getAccount().equals(castOther.getAccount())))
				&& ((this.getAccountDigit() == castOther.getAccountDigit())
						|| (this.getAccountDigit() != null && castOther.getAccountDigit() != null
								&& this.getAccountDigit().equals(castOther.getAccountDigit())))
				&& ((this.getAgency() == castOther.getAgency()) || (this.getAgency() != null
						&& castOther.getAgency() != null && this.getAgency().equals(castOther.getAgency())))
				&& ((this.getAgencyDigit() == castOther.getAgencyDigit())
						|| (this.getAgencyDigit() != null && castOther.getAgencyDigit() != null
								&& this.getAgencyDigit().equals(castOther.getAgencyDigit())))
				&& ((this.getOwnerName() == castOther.getOwnerName()) || (this.getOwnerName() != null
						&& castOther.getOwnerName() != null && this.getOwnerName().equals(castOther.getOwnerName())))
				&& ((this.getOwnerDocument() == castOther.getOwnerDocument())
						|| (this.getOwnerDocument() != null && castOther.getOwnerDocument() != null
								&& this.getOwnerDocument().equals(castOther.getOwnerDocument())))
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this.getCreatedAt().equals(castOther.getCreatedAt())))
				&& ((this.getUpdatedAt() == castOther.getUpdatedAt()) || (this.getUpdatedAt() != null
						&& castOther.getUpdatedAt() != null && this.getUpdatedAt().equals(castOther.getUpdatedAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getBankName() == null ? 0 : this.getBankName().hashCode());
		result = 37 * result + (getBankCode() == null ? 0 : this.getBankCode().hashCode());
		result = 37 * result + (getAccount() == null ? 0 : this.getAccount().hashCode());
		result = 37 * result + (getAccountDigit() == null ? 0 : this.getAccountDigit().hashCode());
		result = 37 * result + (getAgency() == null ? 0 : this.getAgency().hashCode());
		result = 37 * result + (getAgencyDigit() == null ? 0 : this.getAgencyDigit().hashCode());
		result = 37 * result + (getOwnerName() == null ? 0 : this.getOwnerName().hashCode());
		result = 37 * result + (getOwnerDocument() == null ? 0 : this.getOwnerDocument().hashCode());
		result = 37 * result + (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		result = 37 * result + (getUpdatedAt() == null ? 0 : this.getUpdatedAt().hashCode());
		return result;
	}

}
