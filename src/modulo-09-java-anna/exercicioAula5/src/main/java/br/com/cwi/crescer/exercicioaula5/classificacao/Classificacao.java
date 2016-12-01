package br.com.cwi.crescer.exercicioaula5.classificacao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author anna.silva
 */
@Entity
@Table(name = "CLASSIFICACAO")
public class Classificacao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CLASSIFICACAO")
    @SequenceGenerator(name = "SEQ_CLASSIFICACAO", sequenceName = "SEQ_CLASSIFICACAO", allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_CLASSIFICACAO")
    private Long idClassificacao;
    
    @Basic(optional = false)
    @Column(name = "DESC_CLASSIFICACAO")
    private String descricao;
    
    @Basic(optional = false)
    @Column(name = "NM_IDADE")
    private Long idade;

    public Long getIdClassificacao() {
        return idClassificacao;
    }

    public void setIdClassificacao(Long idClassificacao) {
        this.idClassificacao = idClassificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    


}
