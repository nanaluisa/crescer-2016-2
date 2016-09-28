public class Elfo{
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Dwarves dwarf;
    private CestoDeLembas nLembas;
        
    public Elfo(String n, int nLembas){
        nome = n;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas",42);
        dwarf = new Dwarves();
        this.nLembas = new CestoDeLembas(nLembas);
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
        
    public Dwarves getVidaDwarf(){
        return dwarf;
    }
    
    public CestoDeLembas getLembas(){
          return nLembas; 
      }
    
    public void atirarFlecha(String alvo){
      if(flecha.getQuantidade() >0){
        flecha.setQuantidade(flecha.getQuantidade()-1);
        experiencia++;
        if(alvo.equalsIgnoreCase("Dwarf") ||alvo.equalsIgnoreCase("Dwarves") ){
          dwarf.setVida(dwarf.getVida()-10);  
        }
      }
    }
    
    /*public void atirarFlechaRefactory(){
      //atirarFlecha();
      experiencia++;
      flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
}