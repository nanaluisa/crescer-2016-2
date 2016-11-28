package br.com.cwi.crescer.aula1.exercicios1;
import java.text.Normalizer;

/**
 * @author ANNA LUISA
 */
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
        //outra forma:
        //return algo == null || algo.trim().isEmpty();
    }
    
    public int numeroDeVogais(final String palavra){
        return palavra.toLowerCase().length() - palavra.toLowerCase().replaceAll("[aeiou]", "").length(); 
    }
    
    
    public String invertePalavra(final String palavra){
         return new StringBuilder(palavra).reverse().toString(); 
    } 
   
    public void verificaPolindromo(final String fraseOriginal){
        
        String frase = fraseOriginal.toLowerCase().replaceAll("\\s+", "");//tirar os espaços
        frase = normalize(frase); //tirar os acentos
        
        String reverterFrase = new StringBuilder(frase).reverse().toString();// invertendo a frase sem espaços.
        //String inverterFrase = new StringBuilder(fraseOriginal).reverse().toString();
            if (frase.equals(reverterFrase)){ //comparando se a frase s/ espaços é igual a frase invertida.
                System.out.println("É um palíndromo! ");
            }else{
                System.out.println("Não é um palíndromo! ");
            }
            
            /* outra forma de escrever o método.
            public boolean isPalindromo(final String string) {
                if (!isEmpty(string)) {
                    final String stringNormalizer = normalizer(string).replaceAll("\\s", "");
                    return stringNormalizer.equalsIgnoreCase(inverteString(stringNormalizer));
                }
                return false;
            }
            */
       
    }
    
    //retirar acentuação
    private String normalize(String nome) { 
        return Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", ""); 
    }
    
    //Menu. Finalizar.
    public static void main (String[] args){
        
        System.out.println("Validação de Strings: ");
        //validarString(input.nextLine());
        
                
    
    } 
    
    
}
