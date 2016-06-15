package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Donations.
 * @see ew.Donations
 * @author Hibernate Tools
 */
@Stateless
public class DonationsHome {

	private static final Log log = LogFactory.getLog(DonationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Donations transientInstance) {
		log.debug("persisting Donations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Donations persistentInstance) {
		log.debug("removing Donations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Donations merge(Donations detachedInstance) {
		log.debug("merging Donations instance");
		try {
			Donations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Donations findById(int id) {
		log.debug("getting Donations instance with id: " + id);
		try {
			Donations instance = entityManager.find(Donations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
