package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Taggings.
 * @see ew.Taggings
 * @author Hibernate Tools
 */
@Stateless
public class TaggingsHome {

	private static final Log log = LogFactory.getLog(TaggingsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Taggings transientInstance) {
		log.debug("persisting Taggings instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Taggings persistentInstance) {
		log.debug("removing Taggings instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Taggings merge(Taggings detachedInstance) {
		log.debug("merging Taggings instance");
		try {
			Taggings result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Taggings findById(int id) {
		log.debug("getting Taggings instance with id: " + id);
		try {
			Taggings instance = entityManager.find(Taggings.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
