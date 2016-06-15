package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectsInAnalysisByPeriods.
 * @see ew.ProjectsInAnalysisByPeriods
 * @author Hibernate Tools
 */
@Stateless
public class ProjectsInAnalysisByPeriodsHome {

	private static final Log log = LogFactory.getLog(ProjectsInAnalysisByPeriodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectsInAnalysisByPeriods transientInstance) {
		log.debug("persisting ProjectsInAnalysisByPeriods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectsInAnalysisByPeriods persistentInstance) {
		log.debug("removing ProjectsInAnalysisByPeriods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectsInAnalysisByPeriods merge(ProjectsInAnalysisByPeriods detachedInstance) {
		log.debug("merging ProjectsInAnalysisByPeriods instance");
		try {
			ProjectsInAnalysisByPeriods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectsInAnalysisByPeriods findById(ProjectsInAnalysisByPeriodsId id) {
		log.debug("getting ProjectsInAnalysisByPeriods instance with id: " + id);
		try {
			ProjectsInAnalysisByPeriods instance = entityManager.find(ProjectsInAnalysisByPeriods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
