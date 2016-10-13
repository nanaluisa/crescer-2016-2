import java.util.*;

public class ExercitoDeElfos implements Exercito, Estrategia {
    private ArrayList<Elfo> contingente;

    public ExercitoDeElfos() {
        contingente = new ArrayList<>();
    }

    public Elfo[] getContingente() {
        return contingente.toArray(new Elfo[contingente.size()]);
    }

    public void alistar(Elfo elfo) throws NaoPodeAlistarException {
        //Outras formas:
        //String nomeClasse = elfo.getClass().getName();
        //Class clazz = elfo.getClass();
        boolean podeAlistar = 
            //nomeClasse.equals("ElfoVerde") || nomeClasse.equals("ElfoNoturno");
            //clazz == ElfoVerde.class || clazz == ElfoNoturno.class;
            elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;

        if (!podeAlistar) {
            throw new NaoPodeAlistarException();
        }
        contingente.add(elfo);
    }

    /**
     * Busca um elfo no contingente de acordo com seu nome
     * 
     * @param String nome Nome do elfo a ser procurado. Ex: "Legolas"
     * @return Elfo Objeto Elfo completo que foi encontrado. Caso não encontre, retorna nulo. Caso tenha conflito de nomes, 
     * retorna o primeiro.
     */
    public Elfo buscar(String nome) {

        // Java 8: contingente.filter(elfo -> nome.equals(elfo.getNome()))[0];
        // C# 3: contingente.FirstOrDefault(elfo => elfo.Nome == nome);
        // ES 2015 / ES6: contingente.filter(elfo => nome == elfo.nome)[0];
        // JS 5: contingente.filter(function(elfo) { return elfo.nome == nome })[0];
        // Ruby: contingente.filter_by { |x| x.nome == nome }

        for (Elfo elfo : contingente) {
            if (nome.equals(elfo.getNome())) {
                return elfo;
            }
        }
        return null;
    }

    public List<Elfo> buscar(Status status) {
        // C#: return contingente.Where(x => x.Status == status);
        ArrayList<Elfo> resultado = new ArrayList<>();

        for (Elfo elfo : contingente) {
            if (elfo.getStatus() == status) {
                resultado.add(elfo);
            }
        }

        return resultado;
    }

    public void atacar() {
        System.out.println("Exército normal atacando");
    }
    
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
         List<Elfo> ordemAtaque = new ArrayList<Elfo>();
         
         //add primeiro os Verdes vivos.
         for(int i = 0; i< atacantes.size(); i++){
             if(atacantes.get(i) instanceof ElfoVerde && atacantes.get(i).getStatus().equals(Status.VIVO)){
                 ordemAtaque.add(atacantes.get(i)) ;
             }
         }      
         //add depois os Noturnos vivos.
         for(int i = 0; i< atacantes.size(); i++){
             if(atacantes.get(i) instanceof ElfoNoturno && atacantes.get(i).getStatus().equals(Status.VIVO)){
                 ordemAtaque.add(atacantes.get(i));
             }
         }
         return ordemAtaque;
         /* Percorrer os alistados e verificar condiçoes para ataque, caso tudo OK, coloca na lista.
                 * 
                    Exercício 1
                Noturnos por último!
                Crie uma estratégia concreta que ordene o contingente de ataque com os seguintes critérios:
                
         OK       Somente elfos vivos atacarão.
         OK       Primeiro sempre atacam os Elfos Verdes.
         OK       Elfos Noturnos atacam por último.
                Importante:
                Não crie várias listas para cada tipo de Elfos, faça bom uso do polimorfismo!
                   
                */
    }
        
    public List<Elfo> getOrdemDeAtaqueIntercalada(List<Elfo> atacantes) throws ExercitoNaoAtingiuExeption{
        return null;
    }
        
        /*Ataque intercalado
    
            Crie mais uma estratégia concreta de ataque onde:
            
         OK   Somente elfos vivos atacarão e,
    outro método?   para facilitar a vida do general, a composição do pelotão de ataque deve ter 
          OK          obrigatoriamente 50% de Elfos Verdes e 50% de Elfos Noturnos. Em caso contrário, lance um erro do tipo 
                    "ContingenteDesproporcionalException".
           
            Os ataques ocorrerão de forma intercalada e contínua entre os tipos de elfos.
            Se um Elfo Verde começa atacando, o próximo ataque deve ser feito por um Elfo Noturno.
          
            //dois ifs verificando quem começa e assim ordenar a chamada!
           
            Se um Elfo Noturno começa atacando, o próximo ataque deve ser feito por um Elfo Verde.
            Importante:
            
            Não crie várias listas para cada tipo de Elfos, faça bom uso do polimorfismo!
           
           */
    
          
          
          
          
          
          
          
          
          /*
                      Estratégia little mumu
            
            Crie mais uma estratégia concreta de ataque onde:
            
            Somente elfos vivos e com flechas atacarão.
            No máximo 30% do total do pelotão de ataque pode ser composto por Elfos noturnos.
            Considere apenas a parte inteira dos 30% (vide exemplo abaixo).
            Considere apenas os elfos aptos a atirar para calcular os 30% (ou seja, aqueles que estão vivos e com flechas).
            Ordene o pelotão por quantidade de flechas descendente (maior quantidade para as menores).
            Ex:
            
            [
              { nome: "Noturno 1", flechas: 3 },
              { nome: "Noturno 2", flechas: 12 },
              { nome: "Verde 1", flechas: 0 },
              { nome: "Verde 2", flechas: 40 },
              { nome: "Verde 3", flechas: 50 }
            ]
            Elfos aptos: 4 ("Verde 1" está sem flechas)
            30% de elfos aptos: 4*0.3 = 1.2
            Parte inteira: 1 (ou seja, apenas um elfo noturno estará no pelotão)   
             
             
          */
        
    
    
}
