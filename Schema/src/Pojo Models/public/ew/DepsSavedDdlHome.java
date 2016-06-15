package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DepsSavedDdl.
 * @see ew.DepsSavedDdl
 * @author Hibernate Tools
 */
@Stateless
public class DepsSavedDdlHome {

	private static final Log log = LogFactory.getLog(DepsSavedDdlHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DepsSavedDdl transientInstance) {
		log.debug("persisting DepsSavedDdl instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DepsSavedDdl persistentInstance) {
		log.debug("removing DepsSavedDdl instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DepsSavedDdl merge(DepsSavedDdl detachedInstance) {
		log.debug("merging DepsSavedDdl instance");
		try {
			DepsSavedDdl result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DepsSavedDdl findById(int id) {
		log.debug("getting DepsSavedDdl instance with id: " + id);
		try {
			DepsSavedDdl instance = entityManager.find(DepsSavedDdl.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
