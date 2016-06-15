package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ReferralTotals.
 * @see gsrc1.ReferralTotals
 * @author Hibernate Tools
 */
@Stateless
public class ReferralTotalsHome {

	private static final Log log = LogFactory.getLog(ReferralTotalsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ReferralTotals transientInstance) {
		log.debug("persisting ReferralTotals instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ReferralTotals persistentInstance) {
		log.debug("removing ReferralTotals instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ReferralTotals merge(ReferralTotals detachedInstance) {
		log.debug("merging ReferralTotals instance");
		try {
			ReferralTotals result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ReferralTotals findById(ReferralTotalsId id) {
		log.debug("getting ReferralTotals instance with id: " + id);
		try {
			ReferralTotals instance = entityManager.find(ReferralTotals.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
