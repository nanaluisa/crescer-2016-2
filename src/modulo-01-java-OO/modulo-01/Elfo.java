public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Status status;
    private Inventario inventario;
        
    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42);
        status = Status.VIVO;
    }
    
    public Elfo(String nome, int quantidadeFlechas) {
        this.nome = nome;
        //arco = new Item("Arco", 1);
        //flecha = new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42);
        this.inventario = new Inventario(); 
        this.inventario.adicionarItem(new Item("Arco", 1)); 
        this.inventario.adicionarItem(new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42)); 
        status = Status.VIVO;
    }
    
    public void setNome(String n){
        nome = n;
    }
        
    public String getNome(){
        return nome;
    }
        
    public Item getArco(){
        //return arco;
        return this.inventario.getItens().get(0); 
    }
    
    public Item getFlecha(){
        //return flecha;
        return this.inventario.getItens().get(1); 
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public void atirarFlecha(Dwarf dwarf){
      //boolean temFlecha = flecha.getQuantidade() > 0;
      int quantidadeFlechas = getFlecha().getQuantidade(); 
      boolean temFlecha = quantidadeFlechas > 0;
      
      if(dwarf.getStatus() == Status.VIVO){
          if(temFlecha){
            //flecha.setQuantidade(flecha.getQuantidade()-1);
            getFlecha().setQuantidade(quantidadeFlechas - 1); 
            experiencia++;
            dwarf.perderVida();
          }
      }
        
      
        /*public void atirarFlechaRefactory(){
          //atirarFlecha();
          experiencia++;
          flecha.setQuantidade(flecha.getQuantidade()-1);
         }*/
     
    }
    
    public String toString() {
        //return "<nome> possui <flechas> flechas e <exp> níveis de experiência.";
        boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia == 1;
        int quantidadeFlechas = this.getFlecha().getQuantidade(); 
        //boolean flechaNoSingular = this.flecha.getQuantidade() == 1;
        boolean flechaNoSingular = quantidadeFlechas == 1; 
        
        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            //this.flecha.getQuantidade(),
            quantidadeFlechas,
            // ?:
            flechaNoSingular ? "flecha" : "flechas",
            this.experiencia,
            experienciaNoSingular ? "nível" : "níveis"
        );
    }
   
    /*
     * public void atirarFlechaRefactory(){
      experiencia++;
      flecha.setQuantidade(flecha.getQuantidade()-1);
    }
    */

}
