package br.com.cwi.crescer.exercicioaula5.ator;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author anna.silva
 */
@ManagedBean
@ViewScoped
public class AtorDominio {

    @EJB
    private AtorBean atorBean;

    private Ator ator;
    private List<Ator> atores;

    @PostConstruct
    public void init() {
        this.ator = new Ator();
        this.atores = atorBean.findAll();
        this.atores.sort((a, b) -> a.getIdAtor().compareTo(b.getIdAtor()));
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionar() {
        atorBean.insert(ator);
        this.init();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Teste", "teste"));
    }

}
