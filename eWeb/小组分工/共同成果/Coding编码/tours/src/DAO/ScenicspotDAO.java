package DAO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import Entity.Scenicspot;

/**
 * A data access object (DAO) providing persistence and search support for
 * Scenicspot entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see Session.Scenicspot
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ScenicspotDAO {
	private static final Logger log = LoggerFactory.getLogger(ScenicspotDAO.class);
	// property constants
	public static final String _SNAME = "SName";
	public static final String _SAIRQUALITY = "SAirquality";
	public static final String _SPOLLUTION = "SPollution";
	public static final String WIND_DIRECTION = "windDirection";
	public static final String COMFORT_DEGREE = "comfortDegree";

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

	public void save(Scenicspot transientInstance) {
		log.debug("saving Scenicspot instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Scenicspot persistentInstance) {
		log.debug("deleting Scenicspot instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Scenicspot findById(java.lang.String id) {
		log.debug("getting Scenicspot instance with id: " + id);
		try {
			Scenicspot instance = (Scenicspot) getCurrentSession().get("Entity.Scenicspot", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Scenicspot instance) {
		log.debug("finding Scenicspot instance by example");
		try {
			List results = getCurrentSession().createCriteria("Entity.Scenicspot").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Scenicspot instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Scenicspot as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySName(Object SName) {
		return findByProperty(_SNAME, SName);
	}

	public List findBySAirquality(Object SAirquality) {
		return findByProperty(_SAIRQUALITY, SAirquality);
	}

	public List findBySPollution(Object SPollution) {
		return findByProperty(_SPOLLUTION, SPollution);
	}

	public List findByWindDirection(Object windDirection) {
		return findByProperty(WIND_DIRECTION, windDirection);
	}

	public List findByComfortDegree(Object comfortDegree) {
		return findByProperty(COMFORT_DEGREE, comfortDegree);
	}

	public List findAll() {
		log.debug("finding all Scenicspot instances");
		try {
			String queryString = "from Scenicspot";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Scenicspot merge(Scenicspot detachedInstance) {
		log.debug("merging Scenicspot instance");
		try {
			Scenicspot result = (Scenicspot) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Scenicspot instance) {
		log.debug("attaching dirty Scenicspot instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Scenicspot instance) {
		log.debug("attaching clean Scenicspot instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ScenicspotDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ScenicspotDAO) ctx.getBean("ScenicspotDAO");
	}
}