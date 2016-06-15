package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ContributionDetails.
 * @see gsrc1.ContributionDetails
 * @author Hibernate Tools
 */
@Stateless
public class ContributionDetailsHome {

	private static final Log log = LogFactory.getLog(ContributionDetailsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ContributionDetails transientInstance) {
		log.debug("persisting ContributionDetails instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ContributionDetails persistentInstance) {
		log.debug("removing ContributionDetails instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ContributionDetails merge(ContributionDetails detachedInstance) {
		log.debug("merging ContributionDetails instance");
		try {
			ContributionDetails result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ContributionDetails findById(ContributionDetailsId id) {
		log.debug("getting ContributionDetails instance with id: " + id);
		try {
			ContributionDetails instance = entityManager.find(ContributionDetails.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
