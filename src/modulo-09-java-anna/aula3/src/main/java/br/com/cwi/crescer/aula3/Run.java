/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula3;


import br.com.cwi.crescer.aula3.entity.Pessoa;
//import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anna.silva
 */
public class Run {

    public static void main(String[] args) {
//        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRESCER"); 
//        final EntityManager em = emf.createEntityManager(); 
// 
//        final PessoaDao pessoaDao; 
//        pessoaDao = new PessoaDao(em);
// 
//        final Pessoa pessoa = new Pessoa(); 
////        pessoa.setNmPessoa("Carlos"); 
// 
//        final ArrayList<Filho> filhos = new ArrayList<>(); 
//        pessoa.setFilhos(filhos); 
//        final Filho filho = new Filho(); 
//        filho.setNmPessoa("teste 1"); 
//        filhos.add(filho); 
//         
////        for (int i = 0; i < 10; i++) { 
////            filhos.add(filho); 
////        } 
//        pessoaDao.insert(pessoa); 
// 
//        pessoaDao.findByPessoa(pessoa).forEach(p -> System.out.println(p.getNmPessoa())); 
//        em.close(); 
//        emf.close(); 
// 
//    } 
// 
//} 

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
