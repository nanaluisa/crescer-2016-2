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
    
    public Dwarf(){
        this(null, new DataTerceiraEra(1,1,1));
    }
    
    public Dwarf(String nome, DataTerceiraEra data){
        this.nome = nome;
        dataNascimento = new DataTerceiraEra(data.getDia(),data.getMes(), data.getAno());
    }
    
    public void perdeVida() {
       double sorte = this.getNumeroDaSorte();
       if(sorte < 0){
           experiencia +=2;
       }//else if(sorte >= 0 && sorte <= 100){
       if(sorte > 100){
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
            //ou simplesmente:
            //nSorte *= -33.0;
        }
        if(!dataNascimento.ehBissexto() &&("Seixas".equals(this.nome)||"Meireles".equals(this.nome))){
            return (nSorte * 33) % 100 ;
        }
        return nSorte;
    }
}