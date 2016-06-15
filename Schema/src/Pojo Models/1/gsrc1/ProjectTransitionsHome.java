package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectTransitions.
 * @see gsrc1.ProjectTransitions
 * @author Hibernate Tools
 */
@Stateless
public class ProjectTransitionsHome {

	private static final Log log = LogFactory.getLog(ProjectTransitionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectTransitions transientInstance) {
		log.debug("persisting ProjectTransitions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectTransitions persistentInstance) {
		log.debug("removing ProjectTransitions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectTransitions merge(ProjectTransitions detachedInstance) {
		log.debug("merging ProjectTransitions instance");
		try {
			ProjectTransitions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectTransitions findById(ProjectTransitionsId id) {
		log.debug("getting ProjectTransitions instance with id: " + id);
		try {
			ProjectTransitions instance = entityManager.find(ProjectTransitions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
