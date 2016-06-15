package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserLinks.
 * @see ew.UserLinks
 * @author Hibernate Tools
 */
@Stateless
public class UserLinksHome {

	private static final Log log = LogFactory.getLog(UserLinksHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserLinks transientInstance) {
		log.debug("persisting UserLinks instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserLinks persistentInstance) {
		log.debug("removing UserLinks instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserLinks merge(UserLinks detachedInstance) {
		log.debug("merging UserLinks instance");
		try {
			UserLinks result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserLinks findById(int id) {
		log.debug("getting UserLinks instance with id: " + id);
		try {
			UserLinks instance = entityManager.find(UserLinks.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
