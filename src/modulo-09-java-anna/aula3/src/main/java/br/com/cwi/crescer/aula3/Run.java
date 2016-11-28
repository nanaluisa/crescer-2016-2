/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula3;

import entity.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anna.silva
 */
public class Run {

    public static void main(String[] args) {
        // Criando um EntityManager
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CRESCER");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        final PessoaDao pessoaDao = new PessoaDao(entityManager);

        final Pessoa pessoa = new Pessoa();
        //pessoa.setIdPessoa(1l);
        pessoa.setNmPessoa("Anna Luisa");

        //pessoaDao.insert(insert);

        //final Pessoa pessoa = pessoaDao.find(1l);
        System.out.println(pessoa.getNmPessoa());
        pessoaDao.delete(pessoa);

        entityManager.close();
        entityManagerFactory.close();
    }
}

/*
        if (entityManager.isOpen()) {
            entityManager.getTransaction().begin();
            try {
                final Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(1l);
                pessoa.setNmPessoa("Anna Luisa");

                entityManager.persist(pessoa);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                entityManager.getTransaction().rollback();
            }

            
            final Pessoa pessoa = entityManager.find(Pessoa.class, 1l);
            System.out.println(pessoa.getNmPessoa());
        }
        
        
        
        
        entityManager.close();
        entityManagerFactory.close();

    }
}*/
