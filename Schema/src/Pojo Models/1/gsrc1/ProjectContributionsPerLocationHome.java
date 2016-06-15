package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectContributionsPerLocation.
 * @see gsrc1.ProjectContributionsPerLocation
 * @author Hibernate Tools
 */
@Stateless
public class ProjectContributionsPerLocationHome {

	private static final Log log = LogFactory.getLog(ProjectContributionsPerLocationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectContributionsPerLocation transientInstance) {
		log.debug("persisting ProjectContributionsPerLocation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectContributionsPerLocation persistentInstance) {
		log.debug("removing ProjectContributionsPerLocation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerLocation merge(ProjectContributionsPerLocation detachedInstance) {
		log.debug("merging ProjectContributionsPerLocation instance");
		try {
			ProjectContributionsPerLocation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerLocation findById(ProjectContributionsPerLocationId id) {
		log.debug("getting ProjectContributionsPerLocation instance with id: " + id);
		try {
			ProjectContributionsPerLocation instance = entityManager.find(ProjectContributionsPerLocation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
