package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ChannelPartners.
 * @see ew.ChannelPartners
 * @author Hibernate Tools
 */
@Stateless
public class ChannelPartnersHome {

	private static final Log log = LogFactory.getLog(ChannelPartnersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ChannelPartners transientInstance) {
		log.debug("persisting ChannelPartners instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ChannelPartners persistentInstance) {
		log.debug("removing ChannelPartners instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ChannelPartners merge(ChannelPartners detachedInstance) {
		log.debug("merging ChannelPartners instance");
		try {
			ChannelPartners result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ChannelPartners findById(int id) {
		log.debug("getting ChannelPartners instance with id: " + id);
		try {
			ChannelPartners instance = entityManager.find(ChannelPartners.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
