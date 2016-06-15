package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Recommendations.
 * @see gsrc1.Recommendations
 * @author Hibernate Tools
 */
@Stateless
public class RecommendationsHome {

	private static final Log log = LogFactory.getLog(RecommendationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Recommendations transientInstance) {
		log.debug("persisting Recommendations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Recommendations persistentInstance) {
		log.debug("removing Recommendations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Recommendations merge(Recommendations detachedInstance) {
		log.debug("merging Recommendations instance");
		try {
			Recommendations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Recommendations findById(RecommendationsId id) {
		log.debug("getting Recommendations instance with id: " + id);
		try {
			Recommendations instance = entityManager.find(Recommendations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
