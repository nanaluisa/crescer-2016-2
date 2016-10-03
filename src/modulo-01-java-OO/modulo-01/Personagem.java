public class Personagem {
    protected String nome;
    protected Inventario inventario;
    protected Status status;
    protected int experiencia;
     
    public Personagem(String nome){
        this.nome = nome;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
    }
    
    public void setNome(String n){
        nome = n;
    }
    
     public String getNome() {
        return this.nome;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public Inventario getInventario(){
        return inventario;
    }
    
}
