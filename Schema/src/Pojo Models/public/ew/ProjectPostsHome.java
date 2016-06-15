package ew;
// Generated 10 Jun, 2016 12:07:10 PM by Hibernate Tools 4.0.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ProjectPosts.
 * @see ew.ProjectPosts
 * @author Hibernate Tools
 */
@Stateless
public class ProjectPostsHome {

	private static final Log log = LogFactory.getLog(ProjectPostsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProjectPosts transientInstance) {
		log.debug("persisting ProjectPosts instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProjectPosts persistentInstance) {
		log.debug("removing ProjectPosts instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProjectPosts merge(ProjectPosts detachedInstance) {
		log.debug("merging ProjectPosts instance");
		try {
			ProjectPosts result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectPosts findById(int id) {
		log.debug("getting ProjectPosts instance with id: " + id);
		try {
			ProjectPosts instance = entityManager.find(ProjectPosts.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
