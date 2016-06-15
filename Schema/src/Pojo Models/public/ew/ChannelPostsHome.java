package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChannelPosts.
 * @see ew.ChannelPosts
 * @author Hibernate Tools
 */
@Stateless
public class ChannelPostsHome {

	private static final Log log = LogFactory.getLog(ChannelPostsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChannelPosts transientInstance) {
		log.debug("persisting ChannelPosts instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChannelPosts persistentInstance) {
		log.debug("removing ChannelPosts instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChannelPosts merge(ChannelPosts detachedInstance) {
		log.debug("merging ChannelPosts instance");
		try {
			ChannelPosts result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChannelPosts findById(int id) {
		log.debug("getting ChannelPosts instance with id: " + id);
		try {
			ChannelPosts instance = entityManager.find(ChannelPosts.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
