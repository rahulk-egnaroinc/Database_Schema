package gsrc1;
// Generated 10 Jun, 2016 11:57:11 AM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TeamMembers.
 * @see gsrc1.TeamMembers
 * @author Hibernate Tools
 */
@Stateless
public class TeamMembersHome {

	private static final Log log = LogFactory.getLog(TeamMembersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TeamMembers transientInstance) {
		log.debug("persisting TeamMembers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TeamMembers persistentInstance) {
		log.debug("removing TeamMembers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TeamMembers merge(TeamMembers detachedInstance) {
		log.debug("merging TeamMembers instance");
		try {
			TeamMembers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TeamMembers findById(TeamMembersId id) {
		log.debug("getting TeamMembers instance with id: " + id);
		try {
			TeamMembers instance = entityManager.find(TeamMembers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
