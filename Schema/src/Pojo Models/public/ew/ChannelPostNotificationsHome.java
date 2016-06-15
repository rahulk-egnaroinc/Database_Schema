package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChannelPostNotifications.
 * @see ew.ChannelPostNotifications
 * @author Hibernate Tools
 */
@Stateless
public class ChannelPostNotificationsHome {

	private static final Log log = LogFactory.getLog(ChannelPostNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChannelPostNotifications transientInstance) {
		log.debug("persisting ChannelPostNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChannelPostNotifications persistentInstance) {
		log.debug("removing ChannelPostNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChannelPostNotifications merge(ChannelPostNotifications detachedInstance) {
		log.debug("merging ChannelPostNotifications instance");
		try {
			ChannelPostNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChannelPostNotifications findById(int id) {
		log.debug("getting ChannelPostNotifications instance with id: " + id);
		try {
			ChannelPostNotifications instance = entityManager.find(ChannelPostNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
