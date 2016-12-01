package br.com.cwi.crescer.exercicioaula5.filme;

import br.com.cwi.crescer.exercicioaula5.classificacao.Classificacao;
import br.com.cwi.crescer.exercicioaula5.elenco.Elenco;
import br.com.cwi.crescer.exercicioaula5.genero.Genero;
import br.com.cwi.crescer.exercicioaula5.idioma.Idioma;

import java.util.Date;

/**
 *
 * @author anna.silva
 */
public class Filme {
    private String titulo;
    private Genero genero;
    private String diretor;
    private Date dataLancamento;
    private Elenco elenco;
    private Classificacao classificacao;
    private Idioma idioma;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    
    
}
