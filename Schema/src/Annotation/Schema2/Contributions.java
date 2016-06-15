package src1;
// Generated 13 Jun, 2016 5:41:20 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contributions generated by hbm2java
 */
@Entity
@Table(name = "contributions", schema = "api_updates")
public class Contributions implements java.io.Serializable {

	private ContributionsId id;
	private Integer contributionId;
	private Integer userId;
	private Integer rewardId;

	public Contributions() {
	}

	public Contributions(ContributionsId id) {
		this.id = id;
	}

	public Contributions(ContributionsId id, Integer contributionId, Integer userId, Integer rewardId) {
		this.id = id;
		this.contributionId = contributionId;
		this.userId = userId;
		this.rewardId = rewardId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "transactionId", column = @Column(name = "transaction_id", nullable = false) ),
			@AttributeOverride(name = "updatedAt", column = @Column(name = "updated_at", nullable = false, length = 29) ) })
	public ContributionsId getId() {
		return this.id;
	}

	public void setId(ContributionsId id) {
		this.id = id;
	}

	@Column(name = "contribution_id")
	public Integer getContributionId() {
		return this.contributionId;
	}

	public void setContributionId(Integer contributionId) {
		this.contributionId = contributionId;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "reward_id")
	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
	}

}
