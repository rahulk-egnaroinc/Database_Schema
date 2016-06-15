package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Moments.
 * @see ew.Moments
 * @author Hibernate Tools
 */
@Stateless
public class MomentsHome {

	private static final Log log = LogFactory.getLog(MomentsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Moments transientInstance) {
		log.debug("persisting Moments instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Moments persistentInstance) {
		log.debug("removing Moments instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Moments merge(Moments detachedInstance) {
		log.debug("merging Moments instance");
		try {
			Moments result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Moments findById(int id) {
		log.debug("getting Moments instance with id: " + id);
		try {
			Moments instance = entityManager.find(Moments.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
