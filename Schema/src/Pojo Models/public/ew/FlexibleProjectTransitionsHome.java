package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FlexibleProjectTransitions.
 * @see ew.FlexibleProjectTransitions
 * @author Hibernate Tools
 */
@Stateless
public class FlexibleProjectTransitionsHome {

	private static final Log log = LogFactory.getLog(FlexibleProjectTransitionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FlexibleProjectTransitions transientInstance) {
		log.debug("persisting FlexibleProjectTransitions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FlexibleProjectTransitions persistentInstance) {
		log.debug("removing FlexibleProjectTransitions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FlexibleProjectTransitions merge(FlexibleProjectTransitions detachedInstance) {
		log.debug("merging FlexibleProjectTransitions instance");
		try {
			FlexibleProjectTransitions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FlexibleProjectTransitions findById(int id) {
		log.debug("getting FlexibleProjectTransitions instance with id: " + id);
		try {
			FlexibleProjectTransitions instance = entityManager.find(FlexibleProjectTransitions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
