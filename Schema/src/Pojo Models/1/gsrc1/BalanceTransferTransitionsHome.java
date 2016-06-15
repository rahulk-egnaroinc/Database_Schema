package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BalanceTransferTransitions.
 * @see gsrc1.BalanceTransferTransitions
 * @author Hibernate Tools
 */
@Stateless
public class BalanceTransferTransitionsHome {

	private static final Log log = LogFactory.getLog(BalanceTransferTransitionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BalanceTransferTransitions transientInstance) {
		log.debug("persisting BalanceTransferTransitions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BalanceTransferTransitions persistentInstance) {
		log.debug("removing BalanceTransferTransitions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BalanceTransferTransitions merge(BalanceTransferTransitions detachedInstance) {
		log.debug("merging BalanceTransferTransitions instance");
		try {
			BalanceTransferTransitions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BalanceTransferTransitions findById(BalanceTransferTransitionsId id) {
		log.debug("getting BalanceTransferTransitions instance with id: " + id);
		try {
			BalanceTransferTransitions instance = entityManager.find(BalanceTransferTransitions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
