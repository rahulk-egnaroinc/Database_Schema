package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectContributionsPerRef.
 * @see gsrc1.ProjectContributionsPerRef
 * @author Hibernate Tools
 */
@Stateless
public class ProjectContributionsPerRefHome {

	private static final Log log = LogFactory.getLog(ProjectContributionsPerRefHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectContributionsPerRef transientInstance) {
		log.debug("persisting ProjectContributionsPerRef instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectContributionsPerRef persistentInstance) {
		log.debug("removing ProjectContributionsPerRef instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerRef merge(ProjectContributionsPerRef detachedInstance) {
		log.debug("merging ProjectContributionsPerRef instance");
		try {
			ProjectContributionsPerRef result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectContributionsPerRef findById(ProjectContributionsPerRefId id) {
		log.debug("getting ProjectContributionsPerRef instance with id: " + id);
		try {
			ProjectContributionsPerRef instance = entityManager.find(ProjectContributionsPerRef.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
