import java.util.*;
public class Exercito implements Estrategia{
    ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
    
    public ArrayList<Elfo> getElfosAlistados(){
        return elfosAlistados;
    }    
    
    public void addElfosValidos(Elfo elfo) {//throws NaoPodeAlistarException{
         boolean podeAlistar;
         boolean validos = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
         //outra maneira para verificar se o obj é uma instancia
         //podeAdicionar = elfo.getClass().getName().equals("ElfoVerde") || elfo.getClass().getName().equals("ElfoNoturno")
        podeAlistar = validos ? elfosAlistados.add(elfo) : false;
         
        /*
         if(!validos){
             throw new NaoPodeAlistarException();
         }
         
         elfosAlistados.add(elfo);*/
    }
    
    public Elfo buscarElfoPorNome(String nomeProcurado){
        for(Elfo elfo : elfosAlistados){
            if (nomeProcurado.equals(elfo.getNome())){
                return elfo;
            }
        }
        return null;       
    } 
    
    public ArrayList<Elfo> buscarElfoPorStatus(Status status){
        ArrayList<Elfo> resultado = new ArrayList<Elfo>();
        for(Elfo elfo : elfosAlistados){
            if (elfo.getStatus() == status){
                resultado.add(elfo);
            }
        }
        return resultado;
    }     
    
    
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
        ArrayList<Elfo> ordemAtaque = new ArrayList<Elfo>();
         //for(int i=0; i< atacantes.size(); i++){
            //add primeiro os vivos e os Verdes
            for(int j = 0; j< atacantes.size(); j++){
                if(atacantes.get(j).getStatus().equals("VIVO") && atacantes.get(j) instanceof ElfoVerde ){
                    ordemAtaque.add(elfosAlistados.get(j));
                }
            }      
            //add depois os vivos e os Noturnos
            for(int j = 0; j< atacantes.size(); j++){
                if(atacantes.get(j).getStatus().equals("VIVO") && atacantes.get(j) instanceof ElfoNoturno ){
                    ordemAtaque.add(elfosAlistados.get(j));
                }
            }
            /* Percorrer os alistados e verificar condiçoes para ataque, caso tudo OK, coloca na lista.
             * 
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
