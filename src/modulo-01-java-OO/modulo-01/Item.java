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
    
<<<<<<< HEAD
    public int getQuantidade(){
=======
    public void aumentarUnidades(int unidades) {
        quantidade += unidades;
    }
    
    public int getQuantidade() {
>>>>>>> master
        return quantidade;
    }
    
    public String getDescricao(){
        return descricao;
    }
}