package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserCredits.
 * @see gsrc1.UserCredits
 * @author Hibernate Tools
 */
@Stateless
public class UserCreditsHome {

	private static final Log log = LogFactory.getLog(UserCreditsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserCredits transientInstance) {
		log.debug("persisting UserCredits instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserCredits persistentInstance) {
		log.debug("removing UserCredits instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserCredits merge(UserCredits detachedInstance) {
		log.debug("merging UserCredits instance");
		try {
			UserCredits result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserCredits findById(UserCreditsId id) {
		log.debug("getting UserCredits instance with id: " + id);
		try {
			UserCredits instance = entityManager.find(UserCredits.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
