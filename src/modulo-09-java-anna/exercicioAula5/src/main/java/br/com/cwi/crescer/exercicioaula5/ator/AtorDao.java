/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.exercicioaula5.ator;

import br.com.cwi.crescer.exercicioaula5.AbstractDao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author anna.silva
 */
public class AtorDao extends AbstractDao<Ator, Long> {

    final EntityManager entityManager;

    public AtorDao(EntityManager entityManager) {
        super(Ator.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Ator> findAll() {
        return this.getEntityManager().createQuery("select a from Ator a").getResultList();
    }
    
    
}
