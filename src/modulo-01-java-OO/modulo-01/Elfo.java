public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
              
    public Elfo(String n){
        //chamando o construtor de baixo.
        this(n,42);
    }
       
    public Elfo(String n, int quantFlechas){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas",quantFlechas >=0 ? quantFlechas : 42 );
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
            
    public void atirarFlecha(Dwarf dwarf){
      boolean temFlecha = flecha.getQuantidade() > 0;
      if(temFlecha){
        flecha.setQuantidade(flecha.getQuantidade()-1);
        experiencia++;
        dwarf.perdeVida();
      }
    
         /*public void atirarFlechaRefactory(){
          //atirarFlecha();
          experiencia++;
          flecha.setQuantidade(flecha.getQuantidade()-1);
         }*/
        
          //if(flecha.getQuantidade() >0){
            //if(alvo.equalsIgnoreCase("Dwarf") ||alvo.equalsIgnoreCase("Dwarves") ){
             // dwarf.setVida(dwarf.getVida()-10);  
            //}
           //}
    }
    
    
    public String toString(){
         boolean flechaNoSingular = this.flecha.getQuantidade() == 1;
         boolean experienciaNoSingular = this.experiencia == 0 || this.experiencia ==1;
         
        return String.format("%s possui %d %s e %d %s de experiência.",
        this.nome,
        this.flecha.getQuantidade(),
        flechaNoSingular ? "flecha" : "flechas",
        this.experiencia,
        experienciaNoSingular ? "nível" : "níveis");
        /*
         * Método efatorado acima.
        return this.nome + " possui " + this.flecha.getQuantidade()+ 
        " flechas e " + this.experiencia + " níveis de experiência.";
        */
    }
    
    
    
    
    
    
    
}