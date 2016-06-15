package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DbheroDataclips.
 * @see ew.DbheroDataclips
 * @author Hibernate Tools
 */
@Stateless
public class DbheroDataclipsHome {

	private static final Log log = LogFactory.getLog(DbheroDataclipsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DbheroDataclips transientInstance) {
		log.debug("persisting DbheroDataclips instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DbheroDataclips persistentInstance) {
		log.debug("removing DbheroDataclips instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DbheroDataclips merge(DbheroDataclips detachedInstance) {
		log.debug("merging DbheroDataclips instance");
		try {
			DbheroDataclips result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DbheroDataclips findById(int id) {
		log.debug("getting DbheroDataclips instance with id: " + id);
		try {
			DbheroDataclips instance = entityManager.find(DbheroDataclips.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
