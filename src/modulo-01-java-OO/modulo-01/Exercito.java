import java.util.ArrayList;
public class Exercito{
    ArrayList<Elfo> elfosAlistados = new ArrayList<Elfo>();
    
    public ArrayList<Elfo> getElfosAlistados(){
        return elfosAlistados;
    }    
    
    public void addElfosValidos(Elfo elfo){
         boolean podeAlistar;
         boolean validos = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
         //outra maneira para verificar se o obj é uma instancia
         //podeAdicionar = elfo.getClass().getName().equals("ElfoVerde") || elfo.getClass().getName().equals("ElfoNoturno")
         podeAlistar = validos ? elfosAlistados.add(elfo) : false;
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
    
}
