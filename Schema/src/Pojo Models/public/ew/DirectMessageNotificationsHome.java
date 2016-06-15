package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DirectMessageNotifications.
 * @see ew.DirectMessageNotifications
 * @author Hibernate Tools
 */
@Stateless
public class DirectMessageNotificationsHome {

	private static final Log log = LogFactory.getLog(DirectMessageNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DirectMessageNotifications transientInstance) {
		log.debug("persisting DirectMessageNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DirectMessageNotifications persistentInstance) {
		log.debug("removing DirectMessageNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DirectMessageNotifications merge(DirectMessageNotifications detachedInstance) {
		log.debug("merging DirectMessageNotifications instance");
		try {
			DirectMessageNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DirectMessageNotifications findById(int id) {
		log.debug("getting DirectMessageNotifications instance with id: " + id);
		try {
			DirectMessageNotifications instance = entityManager.find(DirectMessageNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
