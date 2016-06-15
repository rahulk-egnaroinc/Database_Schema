package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Channels.
 * @see ew.Channels
 * @author Hibernate Tools
 */
@Stateless
public class ChannelsHome {

	private static final Log log = LogFactory.getLog(ChannelsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Channels transientInstance) {
		log.debug("persisting Channels instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Channels persistentInstance) {
		log.debug("removing Channels instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Channels merge(Channels detachedInstance) {
		log.debug("merging Channels instance");
		try {
			Channels result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Channels findById(int id) {
		log.debug("getting Channels instance with id: " + id);
		try {
			Channels instance = entityManager.find(Channels.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
