package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectAccounts.
 * @see ew.ProjectAccounts
 * @author Hibernate Tools
 */
@Stateless
public class ProjectAccountsHome {

	private static final Log log = LogFactory.getLog(ProjectAccountsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectAccounts transientInstance) {
		log.debug("persisting ProjectAccounts instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectAccounts persistentInstance) {
		log.debug("removing ProjectAccounts instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectAccounts merge(ProjectAccounts detachedInstance) {
		log.debug("merging ProjectAccounts instance");
		try {
			ProjectAccounts result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectAccounts findById(int id) {
		log.debug("getting ProjectAccounts instance with id: " + id);
		try {
			ProjectAccounts instance = entityManager.find(ProjectAccounts.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
