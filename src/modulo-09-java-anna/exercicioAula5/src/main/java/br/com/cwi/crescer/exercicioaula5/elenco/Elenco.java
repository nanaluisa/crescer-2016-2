package br.com.cwi.crescer.exercicioaula5.elenco;

import br.com.cwi.crescer.exercicioaula5.ator.Ator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author anna.silva
 */
public class Elenco {
    
    private String nome;
    
    private List<Ator> atores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    public void adicionar() {
//        atorBean.insert(ator);
//        this.init();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Teste", "teste"));
    }

    
}
