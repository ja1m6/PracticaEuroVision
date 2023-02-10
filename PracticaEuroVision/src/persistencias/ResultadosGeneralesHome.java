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
 * Home object for domain model class ResultadosGenerales.
 * @see persistencias.ResultadosGenerales
 * @author Hibernate Tools
 */
public class ResultadosGeneralesHome {

	private static final Logger logger = Logger.getLogger(ResultadosGeneralesHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ResultadosGenerales transientInstance) {
		logger.log(Level.INFO, "persisting ResultadosGenerales instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ResultadosGenerales instance) {
		logger.log(Level.INFO, "attaching dirty ResultadosGenerales instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(ResultadosGenerales instance) {
		logger.log(Level.INFO, "attaching clean ResultadosGenerales instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(ResultadosGenerales persistentInstance) {
		logger.log(Level.INFO, "deleting ResultadosGenerales instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public ResultadosGenerales merge(ResultadosGenerales detachedInstance) {
		logger.log(Level.INFO, "merging ResultadosGenerales instance");
		try {
			ResultadosGenerales result = (ResultadosGenerales) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public ResultadosGenerales findById(java.lang.String id) {
		logger.log(Level.INFO, "getting ResultadosGenerales instance with id: " + id);
		try {
			ResultadosGenerales instance = (ResultadosGenerales) sessionFactory.getCurrentSession()
					.get("persistencias.ResultadosGenerales", id);
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

	public List findByExample(ResultadosGenerales instance) {
		logger.log(Level.INFO, "finding ResultadosGenerales instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("persistencias.ResultadosGenerales")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
