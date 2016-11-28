/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula3;

import br.com.cwi.crescer.aula3.dao.IDao;
import entity.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author anna.silva
 */
public class PessoaDao implements IDao<Pessoa, Long> {

    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CRESCER");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void insert(Pessoa pessoa) {
        try {
            entityManager.getTransaction().begin();
            

            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();

            
            
            
            
         //   final Pessoa pessoa = new Pessoa();
            pessoa.setIdPessoa(1l);
            pessoa.setNmPessoa("Anna Luisa");

            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pessoa t) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa find(Long id) {

        //entityManager.find(Pessoa.class, ID);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> findAll() {
        return entityManager.createQuery("select p from Pessoa p").getResultList();
    }
    
    public List<Pessoa> findAll(String nome) {
        //com Hibernate
        final Session session = entityManager.unwrap(Session.class);
        final Criteria criteria = session.createCriteria(Pessoa.class);
        criteria.add(Restrictions.like )
        
        /* Com o 
        final Query query = entityManager.createQuery("select p from Pessoa p where p.nmPessoa = :nmPessoa");
        query.setParameter("nmPessoa", nmPessoa.toUpperCase());
        return query.getResultList();*/
    }
    
}
