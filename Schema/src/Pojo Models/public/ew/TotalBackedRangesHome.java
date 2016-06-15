package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TotalBackedRanges.
 * @see ew.TotalBackedRanges
 * @author Hibernate Tools
 */
@Stateless
public class TotalBackedRangesHome {

	private static final Log log = LogFactory.getLog(TotalBackedRangesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TotalBackedRanges transientInstance) {
		log.debug("persisting TotalBackedRanges instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TotalBackedRanges persistentInstance) {
		log.debug("removing TotalBackedRanges instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TotalBackedRanges merge(TotalBackedRanges detachedInstance) {
		log.debug("merging TotalBackedRanges instance");
		try {
			TotalBackedRanges result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TotalBackedRanges findById(String id) {
		log.debug("getting TotalBackedRanges instance with id: " + id);
		try {
			TotalBackedRanges instance = entityManager.find(TotalBackedRanges.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
