/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.service;

import br.com.cwi.crescer.aula8.entity.Filme;
import br.com.cwi.crescer.aula8.entity.Genero;
import br.com.cwi.crescer.aula8.repository.FilmeRepository;
import br.com.cwi.crescer.aula8.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anna.silva
 */
@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public Iterable<Genero> listAll() {
        return generoRepository.findAll();
    }

    public void add(Genero genero) {
        generoRepository.save(genero);
    }
}
