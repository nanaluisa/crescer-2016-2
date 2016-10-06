import java.util.HashMap;
import java.util.Map;
public class BatalhaoEspecial{
    //public static void main (String args[]){
       //Map<String,String> example = new HashMap<String,String>();
        HashMap<String,Elfo> batalhao; 
         
        public BatalhaoEspecial(){
           batalhao = new HashMap<String,Elfo>();
        } 
        
        public HashMap getBatalhao(){
            return batalhao;
        }
        
        public void alistar(Elfo elfo){
             boolean validos = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
             if(validos){
                batalhao.put(elfo.getNome(), elfo);
             }
        }
       
         public Elfo buscar(String nome){
            
             batalhao.get(nome);
             return null;
             /*
             for(Elfo elfo : elfosAlistados){
                if (nomeProcurado.equals(elfo.getNome())){
                    return elfo;
                }
            }
            return null;    */   
        } 
        
        /*public ArrayList<Elfo> buscar(Status status){
            
            batalhao.get
            
            ArrayList<Elfo> resultado = new ArrayList<Elfo>();
            for(Elfo elfo : elfosAlistados){
                if (elfo.getStatus() == status){
                    resultado.add(elfo);
                }
            }
            return resultado;
        }
        */
       
       /* Batalhão Especial
            Crie um batalhão especial de elfos, extremamente organizado e muito mais ágil em suas tarefas. 
            Implemente as mesmas funcionalidades que o Exército de elfos atual, ou seja, os métodos abaixo:
            
       +/-  Elfo[] getContingente()
        OK  void alistar(Elfo elfo)
            Elfo buscar(String nome)
            ArrayList<Elfo> buscar(Status status)   
           
       
        
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
             */
    //}
 
}
