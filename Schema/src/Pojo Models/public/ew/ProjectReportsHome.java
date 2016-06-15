package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectReports.
 * @see ew.ProjectReports
 * @author Hibernate Tools
 */
@Stateless
public class ProjectReportsHome {

	private static final Log log = LogFactory.getLog(ProjectReportsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectReports transientInstance) {
		log.debug("persisting ProjectReports instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectReports persistentInstance) {
		log.debug("removing ProjectReports instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectReports merge(ProjectReports detachedInstance) {
		log.debug("merging ProjectReports instance");
		try {
			ProjectReports result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectReports findById(int id) {
		log.debug("getting ProjectReports instance with id: " + id);
		try {
			ProjectReports instance = entityManager.find(ProjectReports.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
