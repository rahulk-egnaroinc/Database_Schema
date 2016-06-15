package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RedactorAssets.
 * @see ew.RedactorAssets
 * @author Hibernate Tools
 */
@Stateless
public class RedactorAssetsHome {

	private static final Log log = LogFactory.getLog(RedactorAssetsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RedactorAssets transientInstance) {
		log.debug("persisting RedactorAssets instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RedactorAssets persistentInstance) {
		log.debug("removing RedactorAssets instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RedactorAssets merge(RedactorAssets detachedInstance) {
		log.debug("merging RedactorAssets instance");
		try {
			RedactorAssets result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RedactorAssets findById(int id) {
		log.debug("getting RedactorAssets instance with id: " + id);
		try {
			RedactorAssets instance = entityManager.find(RedactorAssets.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
