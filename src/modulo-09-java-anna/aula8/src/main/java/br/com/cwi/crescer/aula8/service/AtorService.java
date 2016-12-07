/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.service;

import br.com.cwi.crescer.aula8.entity.Ator;
import br.com.cwi.crescer.aula8.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anna.silva
 */
@Service
public class AtorService {
    @Autowired
    private AtorRepository atorRepository;

    public Iterable<Ator> listAll() {
        return atorRepository.findAll();
    }

     public void add(Ator ator) {
        atorRepository.save(ator);
    }   
}
