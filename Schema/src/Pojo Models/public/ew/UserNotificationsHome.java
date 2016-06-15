package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserNotifications.
 * @see ew.UserNotifications
 * @author Hibernate Tools
 */
@Stateless
public class UserNotificationsHome {

	private static final Log log = LogFactory.getLog(UserNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserNotifications transientInstance) {
		log.debug("persisting UserNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserNotifications persistentInstance) {
		log.debug("removing UserNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserNotifications merge(UserNotifications detachedInstance) {
		log.debug("merging UserNotifications instance");
		try {
			UserNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserNotifications findById(int id) {
		log.debug("getting UserNotifications instance with id: " + id);
		try {
			UserNotifications instance = entityManager.find(UserNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
