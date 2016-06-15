package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FlexibleProjectStates.
 * @see ew.FlexibleProjectStates
 * @author Hibernate Tools
 */
@Stateless
public class FlexibleProjectStatesHome {

	private static final Log log = LogFactory.getLog(FlexibleProjectStatesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FlexibleProjectStates transientInstance) {
		log.debug("persisting FlexibleProjectStates instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FlexibleProjectStates persistentInstance) {
		log.debug("removing FlexibleProjectStates instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FlexibleProjectStates merge(FlexibleProjectStates detachedInstance) {
		log.debug("merging FlexibleProjectStates instance");
		try {
			FlexibleProjectStates result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FlexibleProjectStates findById(String id) {
		log.debug("getting FlexibleProjectStates instance with id: " + id);
		try {
			FlexibleProjectStates instance = entityManager.find(FlexibleProjectStates.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
