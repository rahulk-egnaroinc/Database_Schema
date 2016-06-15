package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * ContributionReportsForProjectOwnersId generated by hbm2java
 */
public class ContributionReportsForProjectOwnersId implements java.io.Serializable {

	private Integer projectId;
	private Integer rewardId;
	private Integer projectOwnerId;
	private String rewardDescription;
	private Date deliverAt;
	private Date confirmedAt;
	private BigDecimal contributionValue;
	private BigDecimal serviceFee;
	private String userEmail;
	private String cpf;
	private String userName;
	private String payerEmail;
	private String gateway;
	private Boolean anonymous;
	private String state;
	private Boolean waitingPayment;
	private String street;
	private String complement;
	private String addressNumber;
	private String neighbourhood;
	private String city;
	private String addressState;
	private String zipCode;

	public ContributionReportsForProjectOwnersId() {
	}

	public ContributionReportsForProjectOwnersId(Integer projectId, Integer rewardId, Integer projectOwnerId,
			String rewardDescription, Date deliverAt, Date confirmedAt, BigDecimal contributionValue,
			BigDecimal serviceFee, String userEmail, String cpf, String userName, String payerEmail, String gateway,
			Boolean anonymous, String state, Boolean waitingPayment, String street, String complement,
			String addressNumber, String neighbourhood, String city, String addressState, String zipCode) {
		this.projectId = projectId;
		this.rewardId = rewardId;
		this.projectOwnerId = projectOwnerId;
		this.rewardDescription = rewardDescription;
		this.deliverAt = deliverAt;
		this.confirmedAt = confirmedAt;
		this.contributionValue = contributionValue;
		this.serviceFee = serviceFee;
		this.userEmail = userEmail;
		this.cpf = cpf;
		this.userName = userName;
		this.payerEmail = payerEmail;
		this.gateway = gateway;
		this.anonymous = anonymous;
		this.state = state;
		this.waitingPayment = waitingPayment;
		this.street = street;
		this.complement = complement;
		this.addressNumber = addressNumber;
		this.neighbourhood = neighbourhood;
		this.city = city;
		this.addressState = addressState;
		this.zipCode = zipCode;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
	}

	public Integer getProjectOwnerId() {
		return this.projectOwnerId;
	}

	public void setProjectOwnerId(Integer projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
	}

	public String getRewardDescription() {
		return this.rewardDescription;
	}

	public void setRewardDescription(String rewardDescription) {
		this.rewardDescription = rewardDescription;
	}

	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
	}

	public Date getConfirmedAt() {
		return this.confirmedAt;
	}

	public void setConfirmedAt(Date confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public BigDecimal getContributionValue() {
		return this.contributionValue;
	}

	public void setContributionValue(BigDecimal contributionValue) {
		this.contributionValue = contributionValue;
	}

	public BigDecimal getServiceFee() {
		return this.serviceFee;
	}

	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPayerEmail() {
		return this.payerEmail;
	}

	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getWaitingPayment() {
		return this.waitingPayment;
	}

	public void setWaitingPayment(Boolean waitingPayment) {
		this.waitingPayment = waitingPayment;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return this.complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getAddressNumber() {
		return this.addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getNeighbourhood() {
		return this.neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressState() {
		return this.addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ContributionReportsForProjectOwnersId))
			return false;
		ContributionReportsForProjectOwnersId castOther = (ContributionReportsForProjectOwnersId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getRewardId() == castOther.getRewardId()) || (this.getRewardId() != null
						&& castOther.getRewardId() != null && this.getRewardId().equals(castOther.getRewardId())))
				&& ((this.getProjectOwnerId() == castOther.getProjectOwnerId())
						|| (this.getProjectOwnerId() != null && castOther.getProjectOwnerId() != null
								&& this.getProjectOwnerId().equals(castOther.getProjectOwnerId())))
				&& ((this.getRewardDescription() == castOther.getRewardDescription())
						|| (this.getRewardDescription() != null && castOther.getRewardDescription() != null
								&& this.getRewardDescription().equals(castOther.getRewardDescription())))
				&& ((this.getDeliverAt() == castOther.getDeliverAt()) || (this.getDeliverAt() != null
						&& castOther.getDeliverAt() != null && this.getDeliverAt().equals(castOther.getDeliverAt())))
				&& ((this.getConfirmedAt() == castOther.getConfirmedAt())
						|| (this.getConfirmedAt() != null && castOther.getConfirmedAt() != null
								&& this.getConfirmedAt().equals(castOther.getConfirmedAt())))
				&& ((this.getContributionValue() == castOther.getContributionValue())
						|| (this.getContributionValue() != null && castOther.getContributionValue() != null
								&& this.getContributionValue().equals(castOther.getContributionValue())))
				&& ((this.getServiceFee() == castOther.getServiceFee()) || (this.getServiceFee() != null
						&& castOther.getServiceFee() != null && this.getServiceFee().equals(castOther.getServiceFee())))
				&& ((this.getUserEmail() == castOther.getUserEmail()) || (this.getUserEmail() != null
						&& castOther.getUserEmail() != null && this.getUserEmail().equals(castOther.getUserEmail())))
				&& ((this.getCpf() == castOther.getCpf()) || (this.getCpf() != null && castOther.getCpf() != null
						&& this.getCpf().equals(castOther.getCpf())))
				&& ((this.getUserName() == castOther.getUserName()) || (this.getUserName() != null
						&& castOther.getUserName() != null && this.getUserName().equals(castOther.getUserName())))
				&& ((this.getPayerEmail() == castOther.getPayerEmail()) || (this.getPayerEmail() != null
						&& castOther.getPayerEmail() != null && this.getPayerEmail().equals(castOther.getPayerEmail())))
				&& ((this.getGateway() == castOther.getGateway()) || (this.getGateway() != null
						&& castOther.getGateway() != null && this.getGateway().equals(castOther.getGateway())))
				&& ((this.getAnonymous() == castOther.getAnonymous()) || (this.getAnonymous() != null
						&& castOther.getAnonymous() != null && this.getAnonymous().equals(castOther.getAnonymous())))
				&& ((this.getState() == castOther.getState()) || (this.getState() != null
						&& castOther.getState() != null && this.getState().equals(castOther.getState())))
				&& ((this.getWaitingPayment() == castOther.getWaitingPayment())
						|| (this.getWaitingPayment() != null && castOther.getWaitingPayment() != null
								&& this.getWaitingPayment().equals(castOther.getWaitingPayment())))
				&& ((this.getStreet() == castOther.getStreet()) || (this.getStreet() != null
						&& castOther.getStreet() != null && this.getStreet().equals(castOther.getStreet())))
				&& ((this.getComplement() == castOther.getComplement()) || (this.getComplement() != null
						&& castOther.getComplement() != null && this.getComplement().equals(castOther.getComplement())))
				&& ((this.getAddressNumber() == castOther.getAddressNumber())
						|| (this.getAddressNumber() != null && castOther.getAddressNumber() != null
								&& this.getAddressNumber().equals(castOther.getAddressNumber())))
				&& ((this.getNeighbourhood() == castOther.getNeighbourhood())
						|| (this.getNeighbourhood() != null && castOther.getNeighbourhood() != null
								&& this.getNeighbourhood().equals(castOther.getNeighbourhood())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
						&& this.getCity().equals(castOther.getCity())))
				&& ((this.getAddressState() == castOther.getAddressState())
						|| (this.getAddressState() != null && castOther.getAddressState() != null
								&& this.getAddressState().equals(castOther.getAddressState())))
				&& ((this.getZipCode() == castOther.getZipCode()) || (this.getZipCode() != null
						&& castOther.getZipCode() != null && this.getZipCode().equals(castOther.getZipCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getRewardId() == null ? 0 : this.getRewardId().hashCode());
		result = 37 * result + (getProjectOwnerId() == null ? 0 : this.getProjectOwnerId().hashCode());
		result = 37 * result + (getRewardDescription() == null ? 0 : this.getRewardDescription().hashCode());
		result = 37 * result + (getDeliverAt() == null ? 0 : this.getDeliverAt().hashCode());
		result = 37 * result + (getConfirmedAt() == null ? 0 : this.getConfirmedAt().hashCode());
		result = 37 * result + (getContributionValue() == null ? 0 : this.getContributionValue().hashCode());
		result = 37 * result + (getServiceFee() == null ? 0 : this.getServiceFee().hashCode());
		result = 37 * result + (getUserEmail() == null ? 0 : this.getUserEmail().hashCode());
		result = 37 * result + (getCpf() == null ? 0 : this.getCpf().hashCode());
		result = 37 * result + (getUserName() == null ? 0 : this.getUserName().hashCode());
		result = 37 * result + (getPayerEmail() == null ? 0 : this.getPayerEmail().hashCode());
		result = 37 * result + (getGateway() == null ? 0 : this.getGateway().hashCode());
		result = 37 * result + (getAnonymous() == null ? 0 : this.getAnonymous().hashCode());
		result = 37 * result + (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result + (getWaitingPayment() == null ? 0 : this.getWaitingPayment().hashCode());
		result = 37 * result + (getStreet() == null ? 0 : this.getStreet().hashCode());
		result = 37 * result + (getComplement() == null ? 0 : this.getComplement().hashCode());
		result = 37 * result + (getAddressNumber() == null ? 0 : this.getAddressNumber().hashCode());
		result = 37 * result + (getNeighbourhood() == null ? 0 : this.getNeighbourhood().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getAddressState() == null ? 0 : this.getAddressState().hashCode());
		result = 37 * result + (getZipCode() == null ? 0 : this.getZipCode().hashCode());
		return result;
	}

}
