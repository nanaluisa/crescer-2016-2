<<<<<<< HEAD
public class Dwarf{
   private int vida = 110;
      
   public void perdeVida(){
       vida -= 10;
   }
   
   /*public Dwarf(){
       vida = 110;
   }*/ 
    
   public int getVida(){
       return vida;
   }
      
   /*
        Elfos caçam Dwarves!

        Permitir que Elfos atirem flechas em Dwarves (anões)! 
        Lembrem-se que um Dwarf nasce com 110 unidades de vida 
        e perde 10 a cada flechada.   
    */
}
=======
public class Dwarf {
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int experiencia;
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
    }
    
    public Dwarf(String nome, DataTerceiraEra data){
        this.nome = nome;
        dataNascimento = new DataTerceiraEra(data.getDia(),data.getMes(), data.getAno());
    }
    
    public void perderVida() {
       double sorte = getNumeroDaSorte();
       if(sorte < 0){
           experiencia ++;
       }else if(sorte >= 0 && sorte <= 100){
           
       }else{
           vida -= 10;
      }
    }

    public int getVida() {
        return vida;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public double getNumeroDaSorte(){
        double nSorte = 101.0;
        if(dataNascimento.ehBissexto() && this.vida >= 80 && this.vida <= 90){
            return nSorte * (-33);
        }
        if(!dataNascimento.ehBissexto() && this.nome.equalsIgnoreCase("Seixas") || this.nome.equalsIgnoreCase("Meireles")){
            return (nSorte * 33) % 100 ;
        }
        return nSorte;
    }
}
>>>>>>> master
