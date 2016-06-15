package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CreditCards.
 * @see ew.CreditCards
 * @author Hibernate Tools
 */
@Stateless
public class CreditCardsHome {

	private static final Log log = LogFactory.getLog(CreditCardsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CreditCards transientInstance) {
		log.debug("persisting CreditCards instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CreditCards persistentInstance) {
		log.debug("removing CreditCards instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CreditCards merge(CreditCards detachedInstance) {
		log.debug("merging CreditCards instance");
		try {
			CreditCards result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CreditCards findById(int id) {
		log.debug("getting CreditCards instance with id: " + id);
		try {
			CreditCards instance = entityManager.find(CreditCards.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
