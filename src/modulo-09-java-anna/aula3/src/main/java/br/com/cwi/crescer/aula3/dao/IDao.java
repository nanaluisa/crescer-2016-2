package br.com.cwi.crescer.aula3.dao;

import java.util.List;

/**
 *
 * @author anna.silva
 * @param <T>
 * @param <ID>
 */
public interface IDao<T, ID> {
    
    void insert (T t);
    
    void delete(T t);
  
    T find (ID id);
    
    List<T> findAll();
    
    
    
}