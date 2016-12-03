package br.com.cwi.crescer.exercicioaula5.idioma;

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
@Table(name = "IDIOMA")
 public class Idioma implements Serializable{
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_IDIOMA")
    @SequenceGenerator(name = "SEQ_IDIOMA", sequenceName = "SEQ_IDIOMA", allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_IDIOMA")
    private Long idIdioma;
    
    @Basic(optional = false)
    @Column(name = "NM_IDIOMA")
    private String nomeIdioma;

    public Long getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Long idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNomeIdioma() {
        return nomeIdioma;
    }

    public void setNomeIdioma(String nomeIdioma) {
        this.nomeIdioma = nomeIdioma;
    }

    
}
