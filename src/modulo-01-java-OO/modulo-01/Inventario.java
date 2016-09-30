import java.util.ArrayList;
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
    
    public void ordenarItens(){
        Item maiorQtd = itens.get(0); 
        for(int i = 1; i<itens.size(); i++){
            for(int j = i+1; j<itens.size()-1; j++){
                Item salva;
                if(maiorQtd.getQuantidade() < itens.get(j).getQuantidade()){
                    salva = itens.get(j);
                    //itens.get(j) = maiorQtd;
                    maiorQtd = salva;
                }
           }
        }
    }
    
    
    
}
