package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Authorizations.
 * @see ew.Authorizations
 * @author Hibernate Tools
 */
@Stateless
public class AuthorizationsHome {

	private static final Log log = LogFactory.getLog(AuthorizationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Authorizations transientInstance) {
		log.debug("persisting Authorizations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Authorizations persistentInstance) {
		log.debug("removing Authorizations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Authorizations merge(Authorizations detachedInstance) {
		log.debug("merging Authorizations instance");
		try {
			Authorizations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Authorizations findById(int id) {
		log.debug("getting Authorizations instance with id: " + id);
		try {
			Authorizations instance = entityManager.find(Authorizations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
