package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Banks.
 * @see ew.Banks
 * @author Hibernate Tools
 */
@Stateless
public class BanksHome {

	private static final Log log = LogFactory.getLog(BanksHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Banks transientInstance) {
		log.debug("persisting Banks instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Banks persistentInstance) {
		log.debug("removing Banks instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Banks merge(Banks detachedInstance) {
		log.debug("merging Banks instance");
		try {
			Banks result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Banks findById(int id) {
		log.debug("getting Banks instance with id: " + id);
		try {
			Banks instance = entityManager.find(Banks.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
