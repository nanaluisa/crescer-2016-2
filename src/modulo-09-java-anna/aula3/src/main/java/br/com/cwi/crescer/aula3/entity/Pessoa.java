package br.com.cwi.crescer.aula3.entity;

/**
 * @author ANNA LUISA
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "PESSOA")
public class Pessoa implements Serializable {

    @Id // Identifica a PK
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PESSOA") 
    @SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "SEQ_PESSOA", allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_PESSOA")
    private Long idPessoa;

   
    @Basic(optional = false) 
    @Column(name = "NM_PESSOA") 
    private String nmPessoa; 
    
    @Column(name = "DT_NASCIMENTO", nullable = true) 
    @Temporal(DATE) 
    @Basic(optional = true) 
    private Date dtNascimento; 
 
//    @OneToMany(cascade = ALL) 
//    private List<Filho> filhos; 
     
    public Long getIdPessoa() { 
        return idPessoa; 
    } 
 
    public void setIdPessoa(Long idPessoa) { 
        this.idPessoa = idPessoa; 
    } 
 
    public String getNmPessoa() { 
        return nmPessoa; 
    } 
 
    public void setNmPessoa(String nmPessoa) { 
        this.nmPessoa = nmPessoa; 
    } 
 
    public Date getDtNascimento() { 
        return dtNascimento; 
    } 
 
    public void setDtNascimento(Date dtNascimento) { 
        this.dtNascimento = dtNascimento; 
    } 
    /*
    public List<Filho> getFilhos() { 
        return filhos; 
    } 
 
    public void setFilhos(List<Filho> filhos) { 
        this.filhos = filhos; 
    } 
    */



}






 
   
     
    
     
     

