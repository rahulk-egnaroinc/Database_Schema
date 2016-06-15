package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectPostNotifications.
 * @see ew.ProjectPostNotifications
 * @author Hibernate Tools
 */
@Stateless
public class ProjectPostNotificationsHome {

	private static final Log log = LogFactory.getLog(ProjectPostNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectPostNotifications transientInstance) {
		log.debug("persisting ProjectPostNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectPostNotifications persistentInstance) {
		log.debug("removing ProjectPostNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectPostNotifications merge(ProjectPostNotifications detachedInstance) {
		log.debug("merging ProjectPostNotifications instance");
		try {
			ProjectPostNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectPostNotifications findById(int id) {
		log.debug("getting ProjectPostNotifications instance with id: " + id);
		try {
			ProjectPostNotifications instance = entityManager.find(ProjectPostNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
