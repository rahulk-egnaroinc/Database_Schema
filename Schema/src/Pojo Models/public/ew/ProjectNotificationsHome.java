package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectNotifications.
 * @see ew.ProjectNotifications
 * @author Hibernate Tools
 */
@Stateless
public class ProjectNotificationsHome {

	private static final Log log = LogFactory.getLog(ProjectNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectNotifications transientInstance) {
		log.debug("persisting ProjectNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectNotifications persistentInstance) {
		log.debug("removing ProjectNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectNotifications merge(ProjectNotifications detachedInstance) {
		log.debug("merging ProjectNotifications instance");
		try {
			ProjectNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectNotifications findById(int id) {
		log.debug("getting ProjectNotifications instance with id: " + id);
		try {
			ProjectNotifications instance = entityManager.find(ProjectNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
