package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectReminders.
 * @see gsrc1.ProjectReminders
 * @author Hibernate Tools
 */
@Stateless
public class ProjectRemindersHome {

	private static final Log log = LogFactory.getLog(ProjectRemindersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectReminders transientInstance) {
		log.debug("persisting ProjectReminders instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectReminders persistentInstance) {
		log.debug("removing ProjectReminders instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectReminders merge(ProjectReminders detachedInstance) {
		log.debug("merging ProjectReminders instance");
		try {
			ProjectReminders result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectReminders findById(ProjectRemindersId id) {
		log.debug("getting ProjectReminders instance with id: " + id);
		try {
			ProjectReminders instance = entityManager.find(ProjectReminders.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
