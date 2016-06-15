package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FlexibleProjects.
 * @see ew.FlexibleProjects
 * @author Hibernate Tools
 */
@Stateless
public class FlexibleProjectsHome {

	private static final Log log = LogFactory.getLog(FlexibleProjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FlexibleProjects transientInstance) {
		log.debug("persisting FlexibleProjects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FlexibleProjects persistentInstance) {
		log.debug("removing FlexibleProjects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FlexibleProjects merge(FlexibleProjects detachedInstance) {
		log.debug("merging FlexibleProjects instance");
		try {
			FlexibleProjects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FlexibleProjects findById(int id) {
		log.debug("getting FlexibleProjects instance with id: " + id);
		try {
			FlexibleProjects instance = entityManager.find(FlexibleProjects.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
