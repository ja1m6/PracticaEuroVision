package persistencias;
// Generated 10 feb 2023 0:50:55 by Hibernate Tools 5.4.33.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class PorcentajesRangoEdad.
 * @see persistencias.PorcentajesRangoEdad
 * @author Hibernate Tools
 */
public class PorcentajesRangoEdadHome {

	private static final Logger logger = Logger.getLogger(PorcentajesRangoEdadHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PorcentajesRangoEdad transientInstance) {
		logger.log(Level.INFO, "persisting PorcentajesRangoEdad instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PorcentajesRangoEdad instance) {
		logger.log(Level.INFO, "attaching dirty PorcentajesRangoEdad instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(PorcentajesRangoEdad instance) {
		logger.log(Level.INFO, "attaching clean PorcentajesRangoEdad instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(PorcentajesRangoEdad persistentInstance) {
		logger.log(Level.INFO, "deleting PorcentajesRangoEdad instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public PorcentajesRangoEdad merge(PorcentajesRangoEdad detachedInstance) {
		logger.log(Level.INFO, "merging PorcentajesRangoEdad instance");
		try {
			PorcentajesRangoEdad result = (PorcentajesRangoEdad) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public PorcentajesRangoEdad findById(java.lang.String id) {
		logger.log(Level.INFO, "getting PorcentajesRangoEdad instance with id: " + id);
		try {
			PorcentajesRangoEdad instance = (PorcentajesRangoEdad) sessionFactory.getCurrentSession()
					.get("persistencias.PorcentajesRangoEdad", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(PorcentajesRangoEdad instance) {
		logger.log(Level.INFO, "finding PorcentajesRangoEdad instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("persistencias.PorcentajesRangoEdad")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
