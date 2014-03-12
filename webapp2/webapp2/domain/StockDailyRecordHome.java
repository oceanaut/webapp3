package webapp2.domain;

// Generated 12.Mar.2014 15:13:08 by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class StockDailyRecord.
 * @see webapp2.domain.StockDailyRecord
 * @author Hibernate Tools
 */
public class StockDailyRecordHome {

	private static final Log log = LogFactory
			.getLog(StockDailyRecordHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(StockDailyRecord transientInstance) {
		log.debug("persisting StockDailyRecord instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(StockDailyRecord instance) {
		log.debug("attaching dirty StockDailyRecord instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StockDailyRecord instance) {
		log.debug("attaching clean StockDailyRecord instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(StockDailyRecord persistentInstance) {
		log.debug("deleting StockDailyRecord instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StockDailyRecord merge(StockDailyRecord detachedInstance) {
		log.debug("merging StockDailyRecord instance");
		try {
			StockDailyRecord result = (StockDailyRecord) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StockDailyRecord findById(java.lang.Integer id) {
		log.debug("getting StockDailyRecord instance with id: " + id);
		try {
			StockDailyRecord instance = (StockDailyRecord) sessionFactory
					.getCurrentSession().get("webapp2.domain.StockDailyRecord",
							id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StockDailyRecord instance) {
		log.debug("finding StockDailyRecord instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("webapp2.domain.StockDailyRecord")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
