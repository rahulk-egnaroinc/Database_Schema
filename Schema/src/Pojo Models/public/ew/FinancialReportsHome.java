package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FinancialReports.
 * @see ew.FinancialReports
 * @author Hibernate Tools
 */
@Stateless
public class FinancialReportsHome {

	private static final Log log = LogFactory.getLog(FinancialReportsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FinancialReports transientInstance) {
		log.debug("persisting FinancialReports instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FinancialReports persistentInstance) {
		log.debug("removing FinancialReports instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FinancialReports merge(FinancialReports detachedInstance) {
		log.debug("merging FinancialReports instance");
		try {
			FinancialReports result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FinancialReports findById(FinancialReportsId id) {
		log.debug("getting FinancialReports instance with id: " + id);
		try {
			FinancialReports instance = entityManager.find(FinancialReports.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
