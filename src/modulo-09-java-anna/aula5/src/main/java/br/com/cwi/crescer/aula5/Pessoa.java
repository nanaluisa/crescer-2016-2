package br.com.cwi.crescer.aula5;

/**
 *
 * @author anna.silva
 */
public class Pessoa {

    private String nome;

    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "O nome da pessoa é: " + this.getNome() + " " + this.getSobrenome();
    }
}


