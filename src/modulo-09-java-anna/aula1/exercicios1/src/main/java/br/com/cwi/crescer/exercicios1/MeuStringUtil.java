package br.com.cwi.crescer.exercicios1;

import java.text.Normalizer;

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
    
    public static boolean validaString (String algo){
        return algo.isEmpty();
    }
    
    public static int numeroDeVogais(final String palavra){
        return palavra.toLowerCase().length() - palavra.toLowerCase().replaceAll("[aeiou]", "").length(); 
    }
    
    
    public static String invertePalavra(final String palavra){
         return new StringBuilder(palavra).reverse().toString(); 
    } 
   
    public static void verificaPolindromo(final String fraseOriginal){
        
        String frase = fraseOriginal.toLowerCase().replaceAll("\\s+", "");//tirar os espaços
        frase = normalize(frase); //tirar os acentos
        
        String reverterFrase = new StringBuilder(frase).reverse().toString();// invertendo a frase sem espaços.
        //String inverterFrase = new StringBuilder(fraseOriginal).reverse().toString();
            if (frase.equals(reverterFrase)){ //comparando se a frase s/ espaços é igual a frase invertida.
                System.out.println("É um palíndromo! ");
            }else{
                System.out.println("Não é um palíndromo! ");
            }
       
    }
    
    //retirar acentiação
     private static String normalize(String nome) { 
        return Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""); 
    }
    
    
    public static void main (String[] args){
        
        System.out.println("");
                
                
    
    } 
    
    
}
    
    

