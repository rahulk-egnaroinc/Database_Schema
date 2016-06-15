package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ContributionReports.
 * @see gsrc1.ContributionReports
 * @author Hibernate Tools
 */
@Stateless
public class ContributionReportsHome {

	private static final Log log = LogFactory.getLog(ContributionReportsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ContributionReports transientInstance) {
		log.debug("persisting ContributionReports instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ContributionReports persistentInstance) {
		log.debug("removing ContributionReports instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ContributionReports merge(ContributionReports detachedInstance) {
		log.debug("merging ContributionReports instance");
		try {
			ContributionReports result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ContributionReports findById(ContributionReportsId id) {
		log.debug("getting ContributionReports instance with id: " + id);
		try {
			ContributionReports instance = entityManager.find(ContributionReports.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
