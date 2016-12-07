/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.service;

import br.com.cwi.crescer.aula8.entity.Classificacao;
import br.com.cwi.crescer.aula8.repository.ClassificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anna.silva
 */
@Service
public class ClassificacaoService {
   @Autowired
    private ClassificacaoRepository classificacaoRepository;

    public Iterable<Classificacao> listAll() {
        return classificacaoRepository.findAll();
    }

    public void add(Classificacao classificacao) {
        classificacaoRepository.save(classificacao);
    }
}
