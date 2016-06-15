package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectPostsDetails.
 * @see gsrc1.ProjectPostsDetails
 * @author Hibernate Tools
 */
@Stateless
public class ProjectPostsDetailsHome {

	private static final Log log = LogFactory.getLog(ProjectPostsDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectPostsDetails transientInstance) {
		log.debug("persisting ProjectPostsDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectPostsDetails persistentInstance) {
		log.debug("removing ProjectPostsDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectPostsDetails merge(ProjectPostsDetails detachedInstance) {
		log.debug("merging ProjectPostsDetails instance");
		try {
			ProjectPostsDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectPostsDetails findById(ProjectPostsDetailsId id) {
		log.debug("getting ProjectPostsDetails instance with id: " + id);
		try {
			ProjectPostsDetails instance = entityManager.find(ProjectPostsDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
