package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PaymentNotifications.
 * @see ew.PaymentNotifications
 * @author Hibernate Tools
 */
@Stateless
public class PaymentNotificationsHome {

	private static final Log log = LogFactory.getLog(PaymentNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaymentNotifications transientInstance) {
		log.debug("persisting PaymentNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaymentNotifications persistentInstance) {
		log.debug("removing PaymentNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaymentNotifications merge(PaymentNotifications detachedInstance) {
		log.debug("merging PaymentNotifications instance");
		try {
			PaymentNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaymentNotifications findById(int id) {
		log.debug("getting PaymentNotifications instance with id: " + id);
		try {
			PaymentNotifications instance = entityManager.find(PaymentNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
