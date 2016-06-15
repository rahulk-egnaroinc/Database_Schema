package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class OauthProviders.
 * @see ew.OauthProviders
 * @author Hibernate Tools
 */
@Stateless
public class OauthProvidersHome {

	private static final Log log = LogFactory.getLog(OauthProvidersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OauthProviders transientInstance) {
		log.debug("persisting OauthProviders instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OauthProviders persistentInstance) {
		log.debug("removing OauthProviders instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OauthProviders merge(OauthProviders detachedInstance) {
		log.debug("merging OauthProviders instance");
		try {
			OauthProviders result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OauthProviders findById(int id) {
		log.debug("getting OauthProviders instance with id: " + id);
		try {
			OauthProviders instance = entityManager.find(OauthProviders.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
