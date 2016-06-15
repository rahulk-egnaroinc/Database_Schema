package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChannelsSubscribers.
 * @see ew.ChannelsSubscribers
 * @author Hibernate Tools
 */
@Stateless
public class ChannelsSubscribersHome {

	private static final Log log = LogFactory.getLog(ChannelsSubscribersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChannelsSubscribers transientInstance) {
		log.debug("persisting ChannelsSubscribers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChannelsSubscribers persistentInstance) {
		log.debug("removing ChannelsSubscribers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChannelsSubscribers merge(ChannelsSubscribers detachedInstance) {
		log.debug("merging ChannelsSubscribers instance");
		try {
			ChannelsSubscribers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChannelsSubscribers findById(int id) {
		log.debug("getting ChannelsSubscribers instance with id: " + id);
		try {
			ChannelsSubscribers instance = entityManager.find(ChannelsSubscribers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
