package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Countries.
 * @see ew.Countries
 * @author Hibernate Tools
 */
@Stateless
public class CountriesHome {

	private static final Log log = LogFactory.getLog(CountriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Countries transientInstance) {
		log.debug("persisting Countries instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Countries persistentInstance) {
		log.debug("removing Countries instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Countries merge(Countries detachedInstance) {
		log.debug("merging Countries instance");
		try {
			Countries result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Countries findById(int id) {
		log.debug("getting Countries instance with id: " + id);
		try {
			Countries instance = entityManager.find(Countries.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
