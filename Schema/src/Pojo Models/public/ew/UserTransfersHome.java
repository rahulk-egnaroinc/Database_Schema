package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserTransfers.
 * @see ew.UserTransfers
 * @author Hibernate Tools
 */
@Stateless
public class UserTransfersHome {

	private static final Log log = LogFactory.getLog(UserTransfersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserTransfers transientInstance) {
		log.debug("persisting UserTransfers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserTransfers persistentInstance) {
		log.debug("removing UserTransfers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserTransfers merge(UserTransfers detachedInstance) {
		log.debug("merging UserTransfers instance");
		try {
			UserTransfers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserTransfers findById(int id) {
		log.debug("getting UserTransfers instance with id: " + id);
		try {
			UserTransfers instance = entityManager.find(UserTransfers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
