/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;


import br.com.cwi.crescer.aula8.entity.Classificacao;
import br.com.cwi.crescer.aula8.service.ClassificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author anna.silva
 */
public class ClassificacaoController {
    @Autowired
    private ClassificacaoService service;

    @RequestMapping(value = "/classificacao.json", method = GET)
    public Iterable<Classificacao> list() {
        return service.listAll();
    }

    @RequestMapping(value = "/classificacao.json", method = POST)
    public Iterable<Classificacao> list(@RequestBody Classificacao classificacao) {
        service.add(classificacao);
        return service.listAll();
    }
}
