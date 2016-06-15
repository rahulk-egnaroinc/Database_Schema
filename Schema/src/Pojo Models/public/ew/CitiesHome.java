package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cities.
 * @see ew.Cities
 * @author Hibernate Tools
 */
@Stateless
public class CitiesHome {

	private static final Log log = LogFactory.getLog(CitiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cities transientInstance) {
		log.debug("persisting Cities instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cities persistentInstance) {
		log.debug("removing Cities instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cities merge(Cities detachedInstance) {
		log.debug("merging Cities instance");
		try {
			Cities result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cities findById(int id) {
		log.debug("getting Cities instance with id: " + id);
		try {
			Cities instance = entityManager.find(Cities.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
