package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectErrors.
 * @see ew.ProjectErrors
 * @author Hibernate Tools
 */
@Stateless
public class ProjectErrorsHome {

	private static final Log log = LogFactory.getLog(ProjectErrorsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectErrors transientInstance) {
		log.debug("persisting ProjectErrors instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectErrors persistentInstance) {
		log.debug("removing ProjectErrors instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectErrors merge(ProjectErrors detachedInstance) {
		log.debug("merging ProjectErrors instance");
		try {
			ProjectErrors result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectErrors findById(int id) {
		log.debug("getting ProjectErrors instance with id: " + id);
		try {
			ProjectErrors instance = entityManager.find(ProjectErrors.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
