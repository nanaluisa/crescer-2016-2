package br.com.cwi.crescer.exercicios1;

/**
 *Classe MeuStringUtil que tem as definições abaixo:
   * Possui um metodo que valide se String é vazia.
   * Possui um metodo que conte o nº de vogais da String (a,e,i,o,u).
   * Possui um metodo que inverta uma String.
   * Possui um metodo que identifique um palíndromo.("ovo", "Ame a ema", "A sogra má e amargosa")
   * Criar um metodo main, que informe os recursos disponíveis ao usuário. 
 *Exercício 1 Modulo Java Crescer 2016-2.
 * @author ANNA LUISA
 */
public class MeuStringUtil {
    
    public boolean validaString (String algo){
        return algo.isEmpty();
    }
    
    public int numeroDeVogais(final String palavra){
        return palavra.toLowerCase().length() - palavra.toLowerCase().replaceAll("[aeiou]", "").length(); 
    }
    
    
    public String invertePalavra(final String palavra){
        
//        char[] array = new char[s.length()]; 
//        for (int i = s.length(); i > 0; i--) { 
//            array[s.length() - i] = s.toCharArray()[i - 1]; 
//        } 
//        return new String(array); 
        // Usando a forma simples. 
        return new StringBuilder(palavra).reverse().toString(); 
    } 
    
}
    
    

