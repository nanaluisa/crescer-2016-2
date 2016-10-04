public class Item{
    private String descricao;
    private int quantidade;
    
    public Item(String descricao, int quantidade){
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    public void setQuantidade(int novaQuantidade){
        quantidade = novaQuantidade;
    }
    
    public void aumentarUnidades(int unidades) {
        quantidade += unidades;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
     public void aumentarUnidadesDosItens(int unidades){ 
        quantidade += unidades; 
    }
    
    @Override
    public boolean equals(Object obj){
        Item comp = (Item)obj;
        //aqui eu defino o MEU método de igualdade.
        //originalmente o Java compara pelo equals a Identidade(Referencia), não o conteúdo.
        return  
        this.descricao.equals(comp.descricao)&& 
        this.quantidade == comp.quantidade;
        //posso acessar o campo privado pq é do mesmo tipo(descricao e quantidade).
        // Se não teria que acessar pelo get.
    }
    
    
    
}