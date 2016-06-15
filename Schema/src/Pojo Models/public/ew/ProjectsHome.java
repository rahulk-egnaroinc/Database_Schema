package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Projects.
 * @see ew.Projects
 * @author Hibernate Tools
 */
@Stateless
public class ProjectsHome {

	private static final Log log = LogFactory.getLog(ProjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Projects transientInstance) {
		log.debug("persisting Projects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Projects persistentInstance) {
		log.debug("removing Projects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Projects merge(Projects detachedInstance) {
		log.debug("merging Projects instance");
		try {
			Projects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Projects findById(int id) {
		log.debug("getting Projects instance with id: " + id);
		try {
			Projects instance = entityManager.find(Projects.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
