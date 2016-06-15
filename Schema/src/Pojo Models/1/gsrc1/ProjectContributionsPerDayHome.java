package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectContributionsPerDay.
 * @see gsrc1.ProjectContributionsPerDay
 * @author Hibernate Tools
 */
@Stateless
public class ProjectContributionsPerDayHome {

	private static final Log log = LogFactory.getLog(ProjectContributionsPerDayHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectContributionsPerDay transientInstance) {
		log.debug("persisting ProjectContributionsPerDay instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectContributionsPerDay persistentInstance) {
		log.debug("removing ProjectContributionsPerDay instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerDay merge(ProjectContributionsPerDay detachedInstance) {
		log.debug("merging ProjectContributionsPerDay instance");
		try {
			ProjectContributionsPerDay result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerDay findById(ProjectContributionsPerDayId id) {
		log.debug("getting ProjectContributionsPerDay instance with id: " + id);
		try {
			ProjectContributionsPerDay instance = entityManager.find(ProjectContributionsPerDay.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
