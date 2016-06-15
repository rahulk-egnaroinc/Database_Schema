package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ContributionReportsForProjectOwners.
 * @see gsrc1.ContributionReportsForProjectOwners
 * @author Hibernate Tools
 */
@Stateless
public class ContributionReportsForProjectOwnersHome {

	private static final Log log = LogFactory.getLog(ContributionReportsForProjectOwnersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ContributionReportsForProjectOwners transientInstance) {
		log.debug("persisting ContributionReportsForProjectOwners instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ContributionReportsForProjectOwners persistentInstance) {
		log.debug("removing ContributionReportsForProjectOwners instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ContributionReportsForProjectOwners merge(ContributionReportsForProjectOwners detachedInstance) {
		log.debug("merging ContributionReportsForProjectOwners instance");
		try {
			ContributionReportsForProjectOwners result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ContributionReportsForProjectOwners findById(ContributionReportsForProjectOwnersId id) {
		log.debug("getting ContributionReportsForProjectOwners instance with id: " + id);
		try {
			ContributionReportsForProjectOwners instance = entityManager.find(ContributionReportsForProjectOwners.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
