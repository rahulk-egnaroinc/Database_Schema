package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectContributions.
 * @see gsrc1.ProjectContributions
 * @author Hibernate Tools
 */
@Stateless
public class ProjectContributionsHome {

	private static final Log log = LogFactory.getLog(ProjectContributionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectContributions transientInstance) {
		log.debug("persisting ProjectContributions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectContributions persistentInstance) {
		log.debug("removing ProjectContributions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectContributions merge(ProjectContributions detachedInstance) {
		log.debug("merging ProjectContributions instance");
		try {
			ProjectContributions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectContributions findById(ProjectContributionsId id) {
		log.debug("getting ProjectContributions instance with id: " + id);
		try {
			ProjectContributions instance = entityManager.find(ProjectContributions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
