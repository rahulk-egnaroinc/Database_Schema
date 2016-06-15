package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectDetails.
 * @see gsrc1.ProjectDetails
 * @author Hibernate Tools
 */
@Stateless
public class ProjectDetailsHome {

	private static final Log log = LogFactory.getLog(ProjectDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectDetails transientInstance) {
		log.debug("persisting ProjectDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectDetails persistentInstance) {
		log.debug("removing ProjectDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectDetails merge(ProjectDetails detachedInstance) {
		log.debug("merging ProjectDetails instance");
		try {
			ProjectDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectDetails findById(ProjectDetailsId id) {
		log.debug("getting ProjectDetails instance with id: " + id);
		try {
			ProjectDetails instance = entityManager.find(ProjectDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
