package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectFinancials.
 * @see ew.ProjectFinancials
 * @author Hibernate Tools
 */
@Stateless
public class ProjectFinancialsHome {

	private static final Log log = LogFactory.getLog(ProjectFinancialsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectFinancials transientInstance) {
		log.debug("persisting ProjectFinancials instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectFinancials persistentInstance) {
		log.debug("removing ProjectFinancials instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectFinancials merge(ProjectFinancials detachedInstance) {
		log.debug("merging ProjectFinancials instance");
		try {
			ProjectFinancials result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectFinancials findById(ProjectFinancialsId id) {
		log.debug("getting ProjectFinancials instance with id: " + id);
		try {
			ProjectFinancials instance = entityManager.find(ProjectFinancials.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
