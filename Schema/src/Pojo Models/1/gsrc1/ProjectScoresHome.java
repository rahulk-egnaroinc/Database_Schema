package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectScores.
 * @see gsrc1.ProjectScores
 * @author Hibernate Tools
 */
@Stateless
public class ProjectScoresHome {

	private static final Log log = LogFactory.getLog(ProjectScoresHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectScores transientInstance) {
		log.debug("persisting ProjectScores instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectScores persistentInstance) {
		log.debug("removing ProjectScores instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectScores merge(ProjectScores detachedInstance) {
		log.debug("merging ProjectScores instance");
		try {
			ProjectScores result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectScores findById(ProjectScoresId id) {
		log.debug("getting ProjectScores instance with id: " + id);
		try {
			ProjectScores instance = entityManager.find(ProjectScores.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
