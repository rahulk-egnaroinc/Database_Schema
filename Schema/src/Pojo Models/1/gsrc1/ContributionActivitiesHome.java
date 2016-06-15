package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ContributionActivities.
 * @see gsrc1.ContributionActivities
 * @author Hibernate Tools
 */
@Stateless
public class ContributionActivitiesHome {

	private static final Log log = LogFactory.getLog(ContributionActivitiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ContributionActivities transientInstance) {
		log.debug("persisting ContributionActivities instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ContributionActivities persistentInstance) {
		log.debug("removing ContributionActivities instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ContributionActivities merge(ContributionActivities detachedInstance) {
		log.debug("merging ContributionActivities instance");
		try {
			ContributionActivities result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ContributionActivities findById(ContributionActivitiesId id) {
		log.debug("getting ContributionActivities instance with id: " + id);
		try {
			ContributionActivities instance = entityManager.find(ContributionActivities.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
