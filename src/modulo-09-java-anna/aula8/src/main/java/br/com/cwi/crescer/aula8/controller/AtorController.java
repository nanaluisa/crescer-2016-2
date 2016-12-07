/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;

import br.com.cwi.crescer.aula8.entity.Ator;
import br.com.cwi.crescer.aula8.entity.Filme;
import br.com.cwi.crescer.aula8.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author anna.silva
 */
public class AtorController {
    @Autowired
    private AtorService service;

    @RequestMapping(value = "/ator.json", method = GET)
    public Iterable<Ator> list() {
        return service.listAll();
    }

    @RequestMapping(value = "/ator.json", method = POST)
    public Iterable<Ator> list(@RequestBody Ator ator) {
        service.add(ator);
        return service.listAll();
    }
}
