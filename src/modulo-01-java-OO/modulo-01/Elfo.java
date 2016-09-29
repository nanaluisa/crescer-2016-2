public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Status status;
        
    public Elfo(String n) {
        // Chamando construtor debaixo
        this(n, 42);
        status = Status.VIVO;
    }
    
    public Elfo(String nome, int quantidadeFlechas) {
        this.nome = nome;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", quantidadeFlechas >= 0 ? quantidadeFlechas : 42);
        status = Status.VIVO;
    }
    
    public void setNome(String n){
        nome = n;
    }
        
    public String getNome(){
        return nome;
    }
        
    public Item getArco(){
        return arco;
    }
    
    public Item getFlecha(){
        return flecha;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public void atirarFlecha(Dwarf dwarf){
      boolean temFlecha = flecha.getQuantidade() > 0;
      
      if(dwarf.getStatus() == Status.VIVO){
          if(temFlecha){
            flecha.setQuantidade(flecha.getQuantidade()-1);
            experiencia++;
            dwarf.perdeVida();
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

        boolean flechaNoSingular = this.flecha.getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia == 1;

        return String.format("%s possui %d %s e %d %s de experiência.",
            this.nome,
            this.flecha.getQuantidade(),
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
