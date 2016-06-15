package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RewardDetails.
 * @see gsrc1.RewardDetails
 * @author Hibernate Tools
 */
@Stateless
public class RewardDetailsHome {

	private static final Log log = LogFactory.getLog(RewardDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RewardDetails transientInstance) {
		log.debug("persisting RewardDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RewardDetails persistentInstance) {
		log.debug("removing RewardDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RewardDetails merge(RewardDetails detachedInstance) {
		log.debug("merging RewardDetails instance");
		try {
			RewardDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RewardDetails findById(RewardDetailsId id) {
		log.debug("getting RewardDetails instance with id: " + id);
		try {
			RewardDetails instance = entityManager.find(RewardDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
