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
     * @return Elfo Objeto Elfo completo que foi encontrado. Caso não encontre, retorna nulo. Caso tenha conflito de nomes, retorna o primeiro.
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
         ArrayList<Elfo> ordemAtaque = new ArrayList<Elfo>();
            //add primeiro os Verdes vivos.
         for(int i = 0; i< atacantes.size(); i++){
             if(atacantes.get(i).getStatus().equals("VIVO") && atacantes.get(i) instanceof ElfoVerde ){
                 ordemAtaque.add(contingente.get(i));
             }
         }      
            //add depois os Noturnos vivos.
         for(int i = 0; i< atacantes.size(); i++){
             if(atacantes.get(i).getStatus().equals("VIVO") && atacantes.get(i) instanceof ElfoNoturno ){
                 ordemAtaque.add(contingente.get(i));
             }
         }
                /* Percorrer os alistados e verificar condiçoes para ataque, caso tudo OK, coloca na lista.
                 * 
                    Exercício 1
                Noturnos por último!
                Crie uma estratégia concreta que ordene o contingente de ataque com os seguintes critérios:
                
                Somente elfos vivos atacarão.
                Primeiro sempre atacam os Elfos Verdes.
                Elfos Noturnos atacam por último.
                Importante:
                Não crie várias listas para cada tipo de Elfos, faça bom uso do polimorfismo!
                   
                */
                     
         return ordemAtaque;
    }
        
    
    
    
    public List<Elfo> getOrdemDeAtaqueIntercalada(List<Elfo> atacantes){
        int contVerdes = 0;
        int contNoturnos = 0;
            
        //contabilizando o Exército:
        for(int i = 0; i< atacantes.size(); i++){
          //boolean verde = atacantes.get(i) instanceof ElfoVerde ? contVerdes++ : contNoturnos++;
          if(atacantes.get(i)instanceof ElfoVerde){
              contVerdes++;
          }else {
              contNoturnos ++;
          }
        }
            
            //int cont = atacantes.size()/2;
        boolean contEquals = contVerdes == contNoturnos;
            //contVerdes.equals(contNoturnos);
        if(!contEquals){
            System.out.println("ContingenteDesproporcionalException");
        }
            
            //for()
            
            
            return null;
        }
        
        
        /*Ataque intercalado
    
            Crie mais uma estratégia concreta de ataque onde:
            
            Somente elfos vivos atacarão e, para facilitar a vida do general, a composição do pelotão de ataque deve ter 
            obrigatoriamente 50% de Elfos Verdes e 50% de Elfos Noturnos. Em caso contrário, lance um erro do tipo 
            "ContingenteDesproporcionalException".
            Os ataques ocorrerão de forma intercalada e contínua entre os tipos de elfos.
            Se um Elfo Verde começa atacando, o próximo ataque deve ser feito por um Elfo Noturno.
            Se um Elfo Noturno começa atacando, o próximo ataque deve ser feito por um Elfo Verde.
            Importante:
            
            Não crie várias listas para cada tipo de Elfos, faça bom uso do polimorfismo!
           
           */
    
        
    
    
}
