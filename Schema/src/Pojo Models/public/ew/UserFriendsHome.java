package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserFriends.
 * @see ew.UserFriends
 * @author Hibernate Tools
 */
@Stateless
public class UserFriendsHome {

	private static final Log log = LogFactory.getLog(UserFriendsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserFriends transientInstance) {
		log.debug("persisting UserFriends instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserFriends persistentInstance) {
		log.debug("removing UserFriends instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserFriends merge(UserFriends detachedInstance) {
		log.debug("merging UserFriends instance");
		try {
			UserFriends result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserFriends findById(int id) {
		log.debug("getting UserFriends instance with id: " + id);
		try {
			UserFriends instance = entityManager.find(UserFriends.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
