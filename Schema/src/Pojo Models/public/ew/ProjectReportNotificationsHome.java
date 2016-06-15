package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectReportNotifications.
 * @see ew.ProjectReportNotifications
 * @author Hibernate Tools
 */
@Stateless
public class ProjectReportNotificationsHome {

	private static final Log log = LogFactory.getLog(ProjectReportNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectReportNotifications transientInstance) {
		log.debug("persisting ProjectReportNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectReportNotifications persistentInstance) {
		log.debug("removing ProjectReportNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectReportNotifications merge(ProjectReportNotifications detachedInstance) {
		log.debug("merging ProjectReportNotifications instance");
		try {
			ProjectReportNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectReportNotifications findById(int id) {
		log.debug("getting ProjectReportNotifications instance with id: " + id);
		try {
			ProjectReportNotifications instance = entityManager.find(ProjectReportNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
