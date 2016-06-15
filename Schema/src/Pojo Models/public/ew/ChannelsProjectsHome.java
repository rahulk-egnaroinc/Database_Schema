package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChannelsProjects.
 * @see ew.ChannelsProjects
 * @author Hibernate Tools
 */
@Stateless
public class ChannelsProjectsHome {

	private static final Log log = LogFactory.getLog(ChannelsProjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChannelsProjects transientInstance) {
		log.debug("persisting ChannelsProjects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChannelsProjects persistentInstance) {
		log.debug("removing ChannelsProjects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChannelsProjects merge(ChannelsProjects detachedInstance) {
		log.debug("merging ChannelsProjects instance");
		try {
			ChannelsProjects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChannelsProjects findById(int id) {
		log.debug("getting ChannelsProjects instance with id: " + id);
		try {
			ChannelsProjects instance = entityManager.find(ChannelsProjects.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
