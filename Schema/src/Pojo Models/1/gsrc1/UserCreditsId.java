package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserCreditsId generated by hbm2java
 */
@Embeddable
public class UserCreditsId implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private BigDecimal credits;

	public UserCreditsId() {
	}

	public UserCreditsId(Integer id, Integer userId, BigDecimal credits) {
		this.id = id;
		this.userId = userId;
		this.credits = credits;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "credits", precision = 131089, scale = 0)
	public BigDecimal getCredits() {
		return this.credits;
	}

	public void setCredits(BigDecimal credits) {
		this.credits = credits;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserCreditsId))
			return false;
		UserCreditsId castOther = (UserCreditsId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& ((this.getCredits() == castOther.getCredits()) || (this.getCredits() != null
						&& castOther.getCredits() != null && this.getCredits().equals(castOther.getCredits())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + (getCredits() == null ? 0 : this.getCredits().hashCode());
		return result;
	}

}
