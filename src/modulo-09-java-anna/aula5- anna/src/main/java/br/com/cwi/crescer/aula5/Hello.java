package br.com.cwi.crescer.aula5;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author anna.silva
 */
@ManagedBean
@ViewScoped
//"Controller"
public class Hello {
    
    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoas = new ArrayList<>();
    
    
//    private String helloWorld = "Hello World!";
//
//    public String getHelloWorld() {
//        return helloWorld;
//    }
//
//    public void setHelloWorld(String helloWorld) {
//        this.helloWorld = helloWorld;
//    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
