package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectTotals.
 * @see gsrc1.ProjectTotals
 * @author Hibernate Tools
 */
@Stateless
public class ProjectTotalsHome {

	private static final Log log = LogFactory.getLog(ProjectTotalsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectTotals transientInstance) {
		log.debug("persisting ProjectTotals instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectTotals persistentInstance) {
		log.debug("removing ProjectTotals instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectTotals merge(ProjectTotals detachedInstance) {
		log.debug("merging ProjectTotals instance");
		try {
			ProjectTotals result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectTotals findById(ProjectTotalsId id) {
		log.debug("getting ProjectTotals instance with id: " + id);
		try {
			ProjectTotals instance = entityManager.find(ProjectTotals.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
