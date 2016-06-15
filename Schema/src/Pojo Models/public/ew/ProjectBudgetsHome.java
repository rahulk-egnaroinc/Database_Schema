package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectBudgets.
 * @see ew.ProjectBudgets
 * @author Hibernate Tools
 */
@Stateless
public class ProjectBudgetsHome {

	private static final Log log = LogFactory.getLog(ProjectBudgetsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectBudgets transientInstance) {
		log.debug("persisting ProjectBudgets instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectBudgets persistentInstance) {
		log.debug("removing ProjectBudgets instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectBudgets merge(ProjectBudgets detachedInstance) {
		log.debug("merging ProjectBudgets instance");
		try {
			ProjectBudgets result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectBudgets findById(int id) {
		log.debug("getting ProjectBudgets instance with id: " + id);
		try {
			ProjectBudgets instance = entityManager.find(ProjectBudgets.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
