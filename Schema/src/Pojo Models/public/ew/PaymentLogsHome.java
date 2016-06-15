package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PaymentLogs.
 * @see ew.PaymentLogs
 * @author Hibernate Tools
 */
@Stateless
public class PaymentLogsHome {

	private static final Log log = LogFactory.getLog(PaymentLogsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaymentLogs transientInstance) {
		log.debug("persisting PaymentLogs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaymentLogs persistentInstance) {
		log.debug("removing PaymentLogs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaymentLogs merge(PaymentLogs detachedInstance) {
		log.debug("merging PaymentLogs instance");
		try {
			PaymentLogs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaymentLogs findById(int id) {
		log.debug("getting PaymentLogs instance with id: " + id);
		try {
			PaymentLogs instance = entityManager.find(PaymentLogs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
