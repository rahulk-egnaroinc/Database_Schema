package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectAccountErrors.
 * @see gsrc1.ProjectAccountErrors
 * @author Hibernate Tools
 */
@Stateless
public class ProjectAccountErrorsHome {

	private static final Log log = LogFactory.getLog(ProjectAccountErrorsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectAccountErrors transientInstance) {
		log.debug("persisting ProjectAccountErrors instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectAccountErrors persistentInstance) {
		log.debug("removing ProjectAccountErrors instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectAccountErrors merge(ProjectAccountErrors detachedInstance) {
		log.debug("merging ProjectAccountErrors instance");
		try {
			ProjectAccountErrors result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectAccountErrors findById(ProjectAccountErrorsId id) {
		log.debug("getting ProjectAccountErrors instance with id: " + id);
		try {
			ProjectAccountErrors instance = entityManager.find(ProjectAccountErrors.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
