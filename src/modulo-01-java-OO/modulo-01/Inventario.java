import java.util.ArrayList;
<<<<<<< HEAD
public class Inventario{
  private ArrayList <Item> itens;  
  //private Item item;
  private int itemAtual;
  public Inventario(){
      itens = new ArrayList<>();
  }
  
  public ArrayList get(int index){
      return itens;
  }
  
  public int getItemAtual(){
      return itemAtual;
  }
  
  public void adicionarItem(Item item){
     itens.add(new Item(item.getDescricao(),item.getQuantidade()));
     /*
     for (int i = 0; i < itens.size(); i++) { 
         Item itemAtual = itens.get(i); 
         System.out.println(itemAtual.getDescricao()); 
     } */
     itemAtual++;   
  }
    
  
  public void removerItem(Item item){
      //varrendo o array até encontrar o item que deseja remover!
      for(int i=0; i<itens.size();i++){
         Item itemRemover = itens.get(i);
         if(itemRemover.getDescricao().equals(item.getDescricao())){
             itens.remove(i);
             itemAtual--; 
             break;
         }
      }
  }
  
  public String getDescricoesItens(){
     for(int i=0; i<itens.size();i++){
         Item itemImprimir = itens.get(i);
         itemImprimir.getDescricao();
         return itemImprimir.getDescricao() + " , ";
     }
  
     return ".";
  } 
    
  }
=======

public class Inventario {
    private ArrayList<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public String getDescricoesItens() {
        //"Adaga,Escudo,Bracelete"
        String resultado = "";

        /*for (int i = 0; i < itens.size(); i++) {
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        }*/

        /*int i = 0;
        while (i < itens.size()) {
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        i++;
        }*/

        /*int i = 0;
        do {
        Item itemAtual = itens.get(i);
        resultado += String.format("%s,", itemAtual.getDescricao());
        i++;
        } while (i < itens.size());*/

        for (Item itemAtual : itens) {
            resultado += String.format("%s,", itemAtual.getDescricao());
        }

        return resultado.isEmpty() ? resultado : resultado.substring(0, resultado.length() - 1);
    }
    
    public void aumentarUnidadesDosItens(int unidades) {
        for (Item item : itens) {
            item.aumentarUnidades(unidades);
        }
    }
}

>>>>>>> master
