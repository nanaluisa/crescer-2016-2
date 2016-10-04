import java.util.ArrayList;
public class Inventario{
  private ArrayList<Item> itens;  
  //private Item item;
  private int itemAtual;
  public Inventario(){
      itens = new ArrayList<>();
  }
  
  public ArrayList<Item> getItens(){
      return itens;
  }
  
  public int getItemAtual(){
      return itemAtual;
  }
  
  public void adicionarItem(Item item){
     itens.add(item);
  }
    
  
  public void removerItem(Item item){
      itens.remove(item);
  }
  
  /*public String getDescricoesItens(){
     for(int i=0; i<itens.size();i++){
         Item itemImprimir = itens.get(i);
         itemImprimir.getDescricao();
         return itemImprimir.getDescricao() + " , ";
     }
  
     return ".";
  } */
    
  public String getDescricoesItens() { 
        //"Adaga,Escudo,Bracelete" 
        // String resultado = ""; 
         StringBuilder resultado = new StringBuilder("");
        for (int i = 0; i < itens.size(); i++) { 
            Item itemAtual = itens.get(i); 
            //resultado += String.format("%s,", itemAtual.getDescricao()); 
        
            resultado.append(String.format("%s,", itemAtual.getDescricao())); 
        } 
 
        //Outras formas de fazer:
        
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
 
        /*for (Item itemAtual : itens) { 
            resultado += String.format("%s,", itemAtual.getDescricao()); 
        } */
 
        
        //return resultado.isEmpty() ? resultado : resultado.substring(0, resultado.length() - 1); 
        return resultado.length() == 0 ? resultado.toString() : resultado.substring(0, resultado.length() - 1); 
  } 
    
  public void aumentarUnidadesDosItens(int unidades) { 
       for (Item item : itens) { 
           item.aumentarUnidades(unidades); 
       } 
  } 
    
  public Item getItemComMaiorQuantidade() { 
        // maiorAteAgora = 0 
        // percorro todos os itens verificando se existe alguém maior que o até agora 
        // caso existir, atualiza a variável 
        // retorna no final 
      int indice = 0, maiorQtdAteAgora = 0; 
         
      for (int i = 0; i < itens.size(); i++) { 
          int qtdAtual = itens.get(i).getQuantidade(); 
          if (qtdAtual > maiorQtdAteAgora) { 
              maiorQtdAteAgora = qtdAtual; 
              indice = i; 
          } 
      } 
         
      boolean temItens = !itens.isEmpty(); 
      return temItens ? itens.get(indice) : null; 
   }
   /*
  public void ordenarItens(){
        Item salva;
       for(int i = 0; i < itens.size()-1; i++){ 
            for(int j = i+1; j < itens.size(); j++){ 
                //Item indMaiorQtd = itens.get(0);
                if(itens.get(j).getQuantidade() < itens.get(i).getQuantidade()){ 
                    salva = itens.get(j); 
                    //comentei os comandos abaixo, pois está dando erro no .get(j) e .get(i).
                    //itens.get(j) = itens.get(i); 
                    //itens.get(i) = salva; 
                } 
           } 
        } 
  }
  */
   public void ordenarItens() { 
        ordenarItens(TipoOrdenacao.ASCENDENTE);  
    } 
  
  public void ordenarItens(TipoOrdenacao tipoOrdenacao) { 
        if (tipoOrdenacao == TipoOrdenacao.ASCENDENTE) { 
            // Versão mais estável do Bubblesort - Melhor caso O(n), Pior caso O(n^2) 
            // homenagem ao do-while: para forçar entrada na lógica 
            boolean posicoesSendoTrocadas; 
            boolean ascendente = tipoOrdenacao == TipoOrdenacao.ASCENDENTE; 
            do { 
                posicoesSendoTrocadas = false; 
                for (int j = 0; j < this.itens.size() - 1; j++) { 
                    Item itemAtual = this.itens.get(j); 
                    Item proximo = this.itens.get(j + 1); 
                    //se precisaTrocar for ascendente, faz a lógica ascendente, se não, faz a lógica descendente
                    //retirando o else if com repetição de código.
                    boolean precisaTrocar = ascendente ? 
                                itemAtual.getQuantidade() > proximo.getQuantidade(): 
                                itemAtual.getQuantidade() < proximo.getQuantidade();
 
                    if (precisaTrocar) { 
                        this.itens.set(j, proximo); 
                        this.itens.set(j + 1, itemAtual); 
                        posicoesSendoTrocadas = true; 
                    } 
                } 
            } while (posicoesSendoTrocadas); 
        } 
    } 
} 
 
