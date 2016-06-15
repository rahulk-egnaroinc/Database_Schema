package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CategoryFollowers.
 * @see gsrc1.CategoryFollowers
 * @author Hibernate Tools
 */
@Stateless
public class CategoryFollowersHome {

	private static final Log log = LogFactory.getLog(CategoryFollowersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CategoryFollowers transientInstance) {
		log.debug("persisting CategoryFollowers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CategoryFollowers persistentInstance) {
		log.debug("removing CategoryFollowers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CategoryFollowers merge(CategoryFollowers detachedInstance) {
		log.debug("merging CategoryFollowers instance");
		try {
			CategoryFollowers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CategoryFollowers findById(CategoryFollowersId id) {
		log.debug("getting CategoryFollowers instance with id: " + id);
		try {
			CategoryFollowers instance = entityManager.find(CategoryFollowers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
