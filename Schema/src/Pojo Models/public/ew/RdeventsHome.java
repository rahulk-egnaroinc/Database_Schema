package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Rdevents.
 * @see ew.Rdevents
 * @author Hibernate Tools
 */
@Stateless
public class RdeventsHome {

	private static final Log log = LogFactory.getLog(RdeventsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Rdevents transientInstance) {
		log.debug("persisting Rdevents instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Rdevents persistentInstance) {
		log.debug("removing Rdevents instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Rdevents merge(Rdevents detachedInstance) {
		log.debug("merging Rdevents instance");
		try {
			Rdevents result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Rdevents findById(int id) {
		log.debug("getting Rdevents instance with id: " + id);
		try {
			Rdevents instance = entityManager.find(Rdevents.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
