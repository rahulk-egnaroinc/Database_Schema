package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OauthProviders generated by hbm2java
 */
public class OauthProviders implements java.io.Serializable {

	private int id;
	private String name;
	private String key;
	private String secret;
	private String scope;
	private Integer order;
	private Date createdAt;
	private Date updatedAt;
	private String strategy;
	private String path;
	private Set<Authorizations> authorizationses = new HashSet<Authorizations>(0);

	public OauthProviders() {
	}

	public OauthProviders(int id, String name, String key, String secret) {
		this.id = id;
		this.name = name;
		this.key = key;
		this.secret = secret;
	}

	public OauthProviders(int id, String name, String key, String secret, String scope, Integer order, Date createdAt,
			Date updatedAt, String strategy, String path, Set<Authorizations> authorizationses) {
		this.id = id;
		this.name = name;
		this.key = key;
		this.secret = secret;
		this.scope = scope;
		this.order = order;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.strategy = strategy;
		this.path = path;
		this.authorizationses = authorizationses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<Authorizations> getAuthorizationses() {
		return this.authorizationses;
	}

	public void setAuthorizationses(Set<Authorizations> authorizationses) {
		this.authorizationses = authorizationses;
	}

}
