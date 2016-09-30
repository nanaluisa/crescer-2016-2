import java.util.ArrayList;
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
