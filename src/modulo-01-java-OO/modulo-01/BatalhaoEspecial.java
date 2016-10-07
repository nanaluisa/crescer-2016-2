import java.util.HashMap;
import java.util.ArrayList;
public class BatalhaoEspecial implements IExercito{
        //public static void main (String args[]){
       //Map<String,String> example = new HashMap<String,String>();
        //private HashMap<String,Elfo> batalhao; 
        private HashMap<String,ArrayList<Elfo>> batalhao; 
        private HashMap<Status,ArrayList<Elfo>> agruparStatus;  
        
        public BatalhaoEspecial(){
           batalhao = new HashMap<>();
        } 
        
        public Elfo[] getBatalhao(){
            ArrayList<Elfo> resultado = new ArrayList<>();
            for(ArrayList<Elfo> listas : batalhao.values()){
                resultado.addAll(listas);
            }
            
            return batalhao.values().toArray(new Elfo[batalhao.size()]);  
        }
                
        /*public HashMap getBatalhao(){
            return batalhao;
        }*/
        
        public void alistar(Elfo elfo){ 
             boolean validos = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
             if(validos){
                //batalhao.put(elfo.getNome(), elfo);
             }
        }
       
        public Elfo buscar(String nome){
            //return batalhao.get(nome);
            
            /*
             * Não precisa do contains, pois isso já faz parte do método get, retornar null se não houver.
             * 
             Elfo busca;
              if (batalhao.containsKey(nome)){
                   busca = batalhao.get(nome);
                   return busca;
             }
             return null;
             */
            return null;
        } 
        
        public ArrayList<Elfo> buscar(Status status){
            /*
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
               return null;
           
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
    }
 
}
