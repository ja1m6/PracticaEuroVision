package persistencias;
// Generated 6 feb 2023 20:24:59 by Hibernate Tools 5.4.33.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ResultadosComunidad.
 * @see persistencias.ResultadosComunidad
 * @author Hibernate Tools
 */
public class ResultadosComunidadHome {

	private static final Logger logger = Logger.getLogger(ResultadosComunidadHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ResultadosComunidad transientInstance) {
		logger.log(Level.INFO, "persisting ResultadosComunidad instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ResultadosComunidad instance) {
		logger.log(Level.INFO, "attaching dirty ResultadosComunidad instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(ResultadosComunidad instance) {
		logger.log(Level.INFO, "attaching clean ResultadosComunidad instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(ResultadosComunidad persistentInstance) {
		logger.log(Level.INFO, "deleting ResultadosComunidad instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public ResultadosComunidad merge(ResultadosComunidad detachedInstance) {
		logger.log(Level.INFO, "merging ResultadosComunidad instance");
		try {
			ResultadosComunidad result = (ResultadosComunidad) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public ResultadosComunidad findById(java.lang.String id) {
		logger.log(Level.INFO, "getting ResultadosComunidad instance with id: " + id);
		try {
			ResultadosComunidad instance = (ResultadosComunidad) sessionFactory.getCurrentSession()
					.get("persistencias.ResultadosComunidad", id);
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

	public List findByExample(ResultadosComunidad instance) {
		logger.log(Level.INFO, "finding ResultadosComunidad instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("persistencias.ResultadosComunidad")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
