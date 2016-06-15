package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeamTotals.
 * @see gsrc1.TeamTotals
 * @author Hibernate Tools
 */
@Stateless
public class TeamTotalsHome {

	private static final Log log = LogFactory.getLog(TeamTotalsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeamTotals transientInstance) {
		log.debug("persisting TeamTotals instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeamTotals persistentInstance) {
		log.debug("removing TeamTotals instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeamTotals merge(TeamTotals detachedInstance) {
		log.debug("merging TeamTotals instance");
		try {
			TeamTotals result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeamTotals findById(TeamTotalsId id) {
		log.debug("getting TeamTotals instance with id: " + id);
		try {
			TeamTotals instance = entityManager.find(TeamTotals.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
