import java.util.ArrayList;
public class Exercito{
    ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
    
    public ArrayList<Elfo> getElfosAlistados(){
        return elfosAlistados;
    }    
    
    public void addElfosValidos(Elfo elfo){
         boolean podeAlistar;
         boolean validos = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
         //<condição> ? <operação 1> : <operação 2>;
         podeAlistar = validos ? elfosAlistados.add(elfo) : false;
    }
    
    public Elfo buscarElfoPorNome(String nomeProcurado){
        boolean achei;
        for(int i= 0; i < elfosAlistados.size();i++){
            if(elfosAlistados.get(i).getNome().equals(nomeProcurado)){
                Elfo elfoAchado = elfosAlistados.get(i);
                return elfoAchado;
            }
        }
        return null;
    } 
    
    /*Crie um exército de Elfos que pode:
       - Alistar um elfo, desde que ele seja um ElfoVerde ou ElfoNoturno.
       - Buscar um elfo pelo nome.
        OBS: exército é uma nova abstração no jogo, portanto crie uma nova...   CLASSE? LISTA?
        OBS: quando alistamos alguém em um contingente quer dizer que aquela pessoa entrou na lista, ou seja...
        
        ------------------------------------------------------------------------
        
        Exercício 2

        Pesquisando por Elfos
        Crie uma forma de obter os elfos com determinado Status passado por parâmetro.
        Sugestão de assinatura:
        //ArrayList<Elfo> buscar(Status status)
            */
    public void adicionarItem(Item item) {         
        String[] validas = getNomesValidos();
        
    }
    //this.status = this.vida < 1 ? Status.MORTO : this.status;
    private String[] getNomesValidos() { 
        return new String[] {  
            "Espada de aço valiriano",  
            "Arco e Flecha de Vidro" 
        }; 
    } 
    
}
