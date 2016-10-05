import java.util.*;
public class ElfoVerde extends Elfo{
   
    public ElfoVerde(String nome) {
        super(nome);
        //this.inventario.getItens().clear();
    }
    
    public ElfoVerde(String nome, int qtdFlechas) {
        super(nome, qtdFlechas);
        //this.inventario.getItens().clear();
    }
        
    public void atirarFlecha(Dwarf dwarf){
        super.atirarFlecha(dwarf);
        //adicionei +1 na experiência, pois como chamei o atirar flecha da super,
        //lá a experiencia já recebe 1, e aqui recebe +1 do Elfo Verde.
        this.experiencia += 1;
    }
    
    public void adicionarItem(Item item) {         
        String[] validas = getNomesValidos();
    }
    
    private String[] getNomesValidos() { 
        return new String[] {  
            "Espada de aço valiriano",  
            "Arco e Flecha de Vidro" 
        }; 
    } 
    
    
    
    /* Outra Forma de add itens.
    public void adicionarItem(Item item){
        //criar um array "normal"/fixo com os itens validos;
        String[] validas = new String[]{
            "Espada de aço valiriano",
            "Arco e Flecha de Vidro"
        };
        boolean podeAdicionar = item != null && new ArrayList<>(Arrays.asList(validas)).contains(item.getDescricao()); 
 
        if (podeAdicionar) { 
            super.adicionarItem(item); 
        }
        
    }*/
}
