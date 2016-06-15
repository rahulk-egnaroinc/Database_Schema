package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserFollowNotifications.
 * @see ew.UserFollowNotifications
 * @author Hibernate Tools
 */
@Stateless
public class UserFollowNotificationsHome {

	private static final Log log = LogFactory.getLog(UserFollowNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserFollowNotifications transientInstance) {
		log.debug("persisting UserFollowNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserFollowNotifications persistentInstance) {
		log.debug("removing UserFollowNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserFollowNotifications merge(UserFollowNotifications detachedInstance) {
		log.debug("merging UserFollowNotifications instance");
		try {
			UserFollowNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserFollowNotifications findById(int id) {
		log.debug("getting UserFollowNotifications instance with id: " + id);
		try {
			UserFollowNotifications instance = entityManager.find(UserFollowNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
