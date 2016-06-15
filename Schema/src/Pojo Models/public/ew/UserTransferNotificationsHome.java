package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserTransferNotifications.
 * @see ew.UserTransferNotifications
 * @author Hibernate Tools
 */
@Stateless
public class UserTransferNotificationsHome {

	private static final Log log = LogFactory.getLog(UserTransferNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserTransferNotifications transientInstance) {
		log.debug("persisting UserTransferNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserTransferNotifications persistentInstance) {
		log.debug("removing UserTransferNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserTransferNotifications merge(UserTransferNotifications detachedInstance) {
		log.debug("merging UserTransferNotifications instance");
		try {
			UserTransferNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserTransferNotifications findById(int id) {
		log.debug("getting UserTransferNotifications instance with id: " + id);
		try {
			UserTransferNotifications instance = entityManager.find(UserTransferNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
