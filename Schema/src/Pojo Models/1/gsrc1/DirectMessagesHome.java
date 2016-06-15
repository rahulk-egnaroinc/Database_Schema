package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DirectMessages.
 * @see gsrc1.DirectMessages
 * @author Hibernate Tools
 */
@Stateless
public class DirectMessagesHome {

	private static final Log log = LogFactory.getLog(DirectMessagesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DirectMessages transientInstance) {
		log.debug("persisting DirectMessages instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DirectMessages persistentInstance) {
		log.debug("removing DirectMessages instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DirectMessages merge(DirectMessages detachedInstance) {
		log.debug("merging DirectMessages instance");
		try {
			DirectMessages result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DirectMessages findById(DirectMessagesId id) {
		log.debug("getting DirectMessages instance with id: " + id);
		try {
			DirectMessages instance = entityManager.find(DirectMessages.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
