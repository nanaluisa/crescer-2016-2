package br.com.cwi.crescer.exercicioaula5.elenco;

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
public class ElencoDao extends AbstractDao<Elenco, Long> {

    @PersistenceContext(unitName = "crescer")
    private EntityManager entityManager;

    public ElencoDao() {
        super(Elenco.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Elenco> findAll() {
        return this.getEntityManager().createQuery("select e from Elenco e").getResultList();
    }
}
