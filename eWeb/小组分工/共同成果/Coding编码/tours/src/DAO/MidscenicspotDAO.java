package DAO;

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

import Entity.Midscenicspot;

/**
 * A data access object (DAO) providing persistence and search support for
 * Midscenicspot entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see Session.Midscenicspot
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class MidscenicspotDAO {
	private static final Logger log = LoggerFactory.getLogger(MidscenicspotDAO.class);
	// property constants
	public static final String _MNAME = "MName";

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

	public void save(Midscenicspot transientInstance) {
		log.debug("saving Midscenicspot instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Midscenicspot persistentInstance) {
		log.debug("deleting Midscenicspot instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Midscenicspot findById(java.lang.String id) {
		log.debug("getting Midscenicspot instance with id: " + id);
		try {
			Midscenicspot instance = (Midscenicspot) getCurrentSession().get("Entity.Midscenicspot", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Midscenicspot instance) {
		log.debug("finding Midscenicspot instance by example");
		try {
			List results = getCurrentSession().createCriteria("Entity.Midscenicspot").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Midscenicspot instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Midscenicspot as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMName(Object MName) {
		return findByProperty(_MNAME, MName);
	}

	public List findAll() {
		log.debug("finding all Midscenicspot instances");
		try {
			String queryString = "from Midscenicspot";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Midscenicspot merge(Midscenicspot detachedInstance) {
		log.debug("merging Midscenicspot instance");
		try {
			Midscenicspot result = (Midscenicspot) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Midscenicspot instance) {
		log.debug("attaching dirty Midscenicspot instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Midscenicspot instance) {
		log.debug("attaching clean Midscenicspot instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MidscenicspotDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MidscenicspotDAO) ctx.getBean("MidscenicspotDAO");
	}
}