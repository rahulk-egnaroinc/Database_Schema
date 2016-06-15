package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Contributions.
 * @see gsrc1.Contributions
 * @author Hibernate Tools
 */
@Stateless
public class ContributionsHome {

	private static final Log log = LogFactory.getLog(ContributionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Contributions transientInstance) {
		log.debug("persisting Contributions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Contributions persistentInstance) {
		log.debug("removing Contributions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Contributions merge(Contributions detachedInstance) {
		log.debug("merging Contributions instance");
		try {
			Contributions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Contributions findById(ContributionsId id) {
		log.debug("getting Contributions instance with id: " + id);
		try {
			Contributions instance = entityManager.find(Contributions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
