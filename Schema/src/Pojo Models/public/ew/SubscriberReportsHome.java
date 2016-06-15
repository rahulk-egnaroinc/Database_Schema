package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class SubscriberReports.
 * @see ew.SubscriberReports
 * @author Hibernate Tools
 */
@Stateless
public class SubscriberReportsHome {

	private static final Log log = LogFactory.getLog(SubscriberReportsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(SubscriberReports transientInstance) {
		log.debug("persisting SubscriberReports instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(SubscriberReports persistentInstance) {
		log.debug("removing SubscriberReports instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public SubscriberReports merge(SubscriberReports detachedInstance) {
		log.debug("merging SubscriberReports instance");
		try {
			SubscriberReports result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SubscriberReports findById(SubscriberReportsId id) {
		log.debug("getting SubscriberReports instance with id: " + id);
		try {
			SubscriberReports instance = entityManager.find(SubscriberReports.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
