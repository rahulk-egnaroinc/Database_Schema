package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CategoryNotifications.
 * @see ew.CategoryNotifications
 * @author Hibernate Tools
 */
@Stateless
public class CategoryNotificationsHome {

	private static final Log log = LogFactory.getLog(CategoryNotificationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CategoryNotifications transientInstance) {
		log.debug("persisting CategoryNotifications instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CategoryNotifications persistentInstance) {
		log.debug("removing CategoryNotifications instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CategoryNotifications merge(CategoryNotifications detachedInstance) {
		log.debug("merging CategoryNotifications instance");
		try {
			CategoryNotifications result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CategoryNotifications findById(int id) {
		log.debug("getting CategoryNotifications instance with id: " + id);
		try {
			CategoryNotifications instance = entityManager.find(CategoryNotifications.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
