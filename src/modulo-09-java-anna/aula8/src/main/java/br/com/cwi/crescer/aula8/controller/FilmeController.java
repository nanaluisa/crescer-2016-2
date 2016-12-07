/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula8.controller;



import br.com.cwi.crescer.aula8.entity.Filme;
import br.com.cwi.crescer.aula8.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author anna.silva
 */
public class FilmeController {
    @Autowired
    private FilmeService service;

    @RequestMapping(value = "/filme.json", method = GET)
    public Iterable<Filme> list() {
        return service.listAll();
    }

    @RequestMapping(value = "/filme.json", method = POST)
    public Iterable<Filme> list(@RequestBody Filme filme) {
        service.add(filme);
        return service.listAll();
    }
    
}
