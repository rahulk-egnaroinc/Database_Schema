package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tags.
 * @see ew.Tags
 * @author Hibernate Tools
 */
@Stateless
public class TagsHome {

	private static final Log log = LogFactory.getLog(TagsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tags transientInstance) {
		log.debug("persisting Tags instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tags persistentInstance) {
		log.debug("removing Tags instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tags merge(Tags detachedInstance) {
		log.debug("merging Tags instance");
		try {
			Tags result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tags findById(int id) {
		log.debug("getting Tags instance with id: " + id);
		try {
			Tags instance = entityManager.find(Tags.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
