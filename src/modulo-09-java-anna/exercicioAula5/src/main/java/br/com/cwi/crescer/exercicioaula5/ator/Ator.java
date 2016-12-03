package br.com.cwi.crescer.exercicioaula5.ator;

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
@Table(name = "ATOR")
public class Ator implements Serializable
{
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_ATOR")
    @SequenceGenerator(name = "SEQ_ATOR", sequenceName = "SEQ_ATOR", allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_ATOR")
    private Long idAtor;
    
    @Basic(optional = false)
    @Column(name = "NM_ATOR")
    private String nomeAtor;

    
    public Long getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(Long idAtor) {
        this.idAtor = idAtor;
    }
    
    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }
    
    
}
