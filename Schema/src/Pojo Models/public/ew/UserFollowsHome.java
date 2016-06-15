package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserFollows.
 * @see ew.UserFollows
 * @author Hibernate Tools
 */
@Stateless
public class UserFollowsHome {

	private static final Log log = LogFactory.getLog(UserFollowsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserFollows transientInstance) {
		log.debug("persisting UserFollows instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserFollows persistentInstance) {
		log.debug("removing UserFollows instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserFollows merge(UserFollows detachedInstance) {
		log.debug("merging UserFollows instance");
		try {
			UserFollows result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserFollows findById(int id) {
		log.debug("getting UserFollows instance with id: " + id);
		try {
			UserFollows instance = entityManager.find(UserFollows.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
