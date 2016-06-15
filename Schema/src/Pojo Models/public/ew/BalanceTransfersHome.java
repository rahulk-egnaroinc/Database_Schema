package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BalanceTransfers.
 * @see ew.BalanceTransfers
 * @author Hibernate Tools
 */
@Stateless
public class BalanceTransfersHome {

	private static final Log log = LogFactory.getLog(BalanceTransfersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BalanceTransfers transientInstance) {
		log.debug("persisting BalanceTransfers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BalanceTransfers persistentInstance) {
		log.debug("removing BalanceTransfers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BalanceTransfers merge(BalanceTransfers detachedInstance) {
		log.debug("merging BalanceTransfers instance");
		try {
			BalanceTransfers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BalanceTransfers findById(int id) {
		log.debug("getting BalanceTransfers instance with id: " + id);
		try {
			BalanceTransfers instance = entityManager.find(BalanceTransfers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
