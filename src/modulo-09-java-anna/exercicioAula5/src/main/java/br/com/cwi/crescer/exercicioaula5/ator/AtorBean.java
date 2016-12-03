package br.com.cwi.crescer.exercicioaula5.ator;

import br.com.cwi.crescer.exercicioaula5.AbstractDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anna.silva
 */
@Stateless
public class AtorBean extends AbstractDao<Ator, Long>{

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;
    
    public AtorBean() {
        super(Ator.class);
    }

    @Override
    public EntityManager getEntityManager() {
         return this.entityManager;
    }

    
    @Override
    public List<Ator> findAll() {
        return this.getEntityManager().createQuery("select a from Ator a").getResultList();
    }
    
}
