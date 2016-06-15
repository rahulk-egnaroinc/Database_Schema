package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Balances.
 * @see gsrc1.Balances
 * @author Hibernate Tools
 */
@Stateless
public class BalancesHome {

	private static final Log log = LogFactory.getLog(BalancesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Balances transientInstance) {
		log.debug("persisting Balances instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Balances persistentInstance) {
		log.debug("removing Balances instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Balances merge(Balances detachedInstance) {
		log.debug("merging Balances instance");
		try {
			Balances result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Balances findById(BalancesId id) {
		log.debug("getting Balances instance with id: " + id);
		try {
			Balances instance = entityManager.find(Balances.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
