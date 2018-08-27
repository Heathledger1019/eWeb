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

import Entity.Hotel;

/**
 * A data access object (DAO) providing persistence and search support for Hotel
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see Session.Hotel
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class HotelDAO {
	private static final Logger log = LoggerFactory.getLogger(HotelDAO.class);
	// property constants
	public static final String PASSWD = "passwd";
	public static final String NAME = "name";
	public static final String ADDRESS = "address";
	public static final String PROVE = "prove";
	public static final String CON_NAME = "conName";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";
	public static final String ISPASS = "ispass";
	public static final String NUMBER = "number";

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

	public void save(Hotel transientInstance) {
		log.debug("saving Hotel instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Hotel persistentInstance) {
		log.debug("deleting Hotel instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Hotel findById(java.lang.String id) {
		log.debug("getting Hotel instance with id: " + id);
		try {
			Hotel instance = (Hotel) getCurrentSession().get("Entity.Hotel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Hotel instance) {
		log.debug("finding Hotel instance by example");
		try {
			List results = getCurrentSession().createCriteria("Entity.Hotel").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Hotel instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Hotel as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPasswd(Object passwd) {
		return findByProperty(PASSWD, passwd);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByProve(Object prove) {
		return findByProperty(PROVE, prove);
	}

	public List findByConName(Object conName) {
		return findByProperty(CON_NAME, conName);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByIspass(Object ispass) {
		return findByProperty(ISPASS, ispass);
	}

	public List findByNumber(Object number) {
		return findByProperty(NUMBER, number);
	}

	public List findAll() {
		log.debug("finding all Hotel instances");
		try {
			String queryString = "from Hotel";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Hotel merge(Hotel detachedInstance) {
		log.debug("merging Hotel instance");
		try {
			Hotel result = (Hotel) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Hotel instance) {
		log.debug("attaching dirty Hotel instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Hotel instance) {
		log.debug("attaching clean Hotel instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HotelDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HotelDAO) ctx.getBean("HotelDAO");
	}
}