package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BankAccounts.
 * @see gsrc1.BankAccounts
 * @author Hibernate Tools
 */
@Stateless
public class BankAccountsHome {

	private static final Log log = LogFactory.getLog(BankAccountsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BankAccounts transientInstance) {
		log.debug("persisting BankAccounts instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BankAccounts persistentInstance) {
		log.debug("removing BankAccounts instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BankAccounts merge(BankAccounts detachedInstance) {
		log.debug("merging BankAccounts instance");
		try {
			BankAccounts result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BankAccounts findById(BankAccountsId id) {
		log.debug("getting BankAccounts instance with id: " + id);
		try {
			BankAccounts instance = entityManager.find(BankAccounts.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
