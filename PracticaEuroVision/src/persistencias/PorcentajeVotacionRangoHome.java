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
 * Home object for domain model class PorcentajeVotacionRango.
 * @see persistencias.PorcentajeVotacionRango
 * @author Hibernate Tools
 */
public class PorcentajeVotacionRangoHome {

	private static final Logger logger = Logger.getLogger(PorcentajeVotacionRangoHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PorcentajeVotacionRango transientInstance) {
		logger.log(Level.INFO, "persisting PorcentajeVotacionRango instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PorcentajeVotacionRango instance) {
		logger.log(Level.INFO, "attaching dirty PorcentajeVotacionRango instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(PorcentajeVotacionRango instance) {
		logger.log(Level.INFO, "attaching clean PorcentajeVotacionRango instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(PorcentajeVotacionRango persistentInstance) {
		logger.log(Level.INFO, "deleting PorcentajeVotacionRango instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public PorcentajeVotacionRango merge(PorcentajeVotacionRango detachedInstance) {
		logger.log(Level.INFO, "merging PorcentajeVotacionRango instance");
		try {
			PorcentajeVotacionRango result = (PorcentajeVotacionRango) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public PorcentajeVotacionRango findById(java.lang.String id) {
		logger.log(Level.INFO, "getting PorcentajeVotacionRango instance with id: " + id);
		try {
			PorcentajeVotacionRango instance = (PorcentajeVotacionRango) sessionFactory.getCurrentSession()
					.get("persistencias.PorcentajeVotacionRango", id);
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

	public List findByExample(PorcentajeVotacionRango instance) {
		logger.log(Level.INFO, "finding PorcentajeVotacionRango instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("persistencias.PorcentajeVotacionRango")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
