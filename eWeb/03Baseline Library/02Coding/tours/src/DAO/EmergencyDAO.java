package DAO;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import Entity.Emergency;

/**
 * A data access object (DAO) providing persistence and search support for
 * Emergency entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see Session.Emergency
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class EmergencyDAO {
	private static final Logger log = LoggerFactory.getLogger(EmergencyDAO.class);
	// property constants
	public static final String CONTENT = "content";
	public static final String PHOTO = "photo";
	public static final String TITLE = "title";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Emergency transientInstance) {
		log.debug("saving Emergency instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Emergency persistentInstance) {
		log.debug("deleting Emergency instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Emergency findById(java.lang.String id) {
		log.debug("getting Emergency instance with id: " + id);
		try {
			Emergency instance = (Emergency) getCurrentSession().get("Entity.Emergency", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Emergency instance) {
		log.debug("finding Emergency instance by example");
		try {
			List results = getCurrentSession().createCriteria("Entity.Emergency").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Emergency instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Emergency as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByPhoto(Object photo) {
		return findByProperty(PHOTO, photo);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findAll() {
		log.debug("finding all Emergency instances");
		try {
			String queryString = "from Emergency";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Emergency merge(Emergency detachedInstance) {
		log.debug("merging Emergency instance");
		try {
			Emergency result = (Emergency) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Emergency instance) {
		log.debug("attaching dirty Emergency instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Emergency instance) {
		log.debug("attaching clean Emergency instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmergencyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmergencyDAO) ctx.getBean("EmergencyDAO");
	}
}