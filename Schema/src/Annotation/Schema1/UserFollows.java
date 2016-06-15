package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserFollows generated by hbm2java
 */
@Entity
@Table(name = "user_follows", schema = "1")
public class UserFollows implements java.io.Serializable {

	private UserFollowsId id;

	public UserFollows() {
	}

	public UserFollows(UserFollowsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "followId", column = @Column(name = "follow_id") ),
			@AttributeOverride(name = "source", column = @Column(name = "source") ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29) ) })
	public UserFollowsId getId() {
		return this.id;
	}

	public void setId(UserFollowsId id) {
		this.id = id;
	}

}
