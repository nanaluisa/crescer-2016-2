package br.com.cwi.crescer.aula8;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author anna.silva
 */
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    
//    @Override
//    @Query("select p from Pessoa p where p.nome ...")
    @Override
    public Iterable<Pessoa> findAll();
    
    @Override
    public Pessoa save(Pessoa pessoa);
    
    @Override
    public void delete(Pessoa pessoa);
    
    
}
