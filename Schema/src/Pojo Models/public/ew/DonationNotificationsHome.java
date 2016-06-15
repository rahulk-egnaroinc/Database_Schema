package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DonationNotifications.
 * @see ew.DonationNotifications
 * @author Hibernate Tools
 */
@Stateless
public class DonationNotificationsHome {

	private static final Log log = LogFactory.getLog(DonationNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DonationNotifications transientInstance) {
		log.debug("persisting DonationNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DonationNotifications persistentInstance) {
		log.debug("removing DonationNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DonationNotifications merge(DonationNotifications detachedInstance) {
		log.debug("merging DonationNotifications instance");
		try {
			DonationNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DonationNotifications findById(int id) {
		log.debug("getting DonationNotifications instance with id: " + id);
		try {
			DonationNotifications instance = entityManager.find(DonationNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
