package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PaymentTransfers.
 * @see ew.PaymentTransfers
 * @author Hibernate Tools
 */
@Stateless
public class PaymentTransfersHome {

	private static final Log log = LogFactory.getLog(PaymentTransfersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaymentTransfers transientInstance) {
		log.debug("persisting PaymentTransfers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaymentTransfers persistentInstance) {
		log.debug("removing PaymentTransfers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaymentTransfers merge(PaymentTransfers detachedInstance) {
		log.debug("merging PaymentTransfers instance");
		try {
			PaymentTransfers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaymentTransfers findById(int id) {
		log.debug("getting PaymentTransfers instance with id: " + id);
		try {
			PaymentTransfers instance = entityManager.find(PaymentTransfers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
