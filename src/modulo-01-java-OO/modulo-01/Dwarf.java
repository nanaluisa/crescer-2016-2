public class Dwarf {
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int experiencia;
    private Status status;
    private Inventario inventario;
    
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
        inventario = new Inventario();
    }
    
    public Dwarf(){
        this(null, new DataTerceiraEra(1,1,1));
        status = Status.VIVO;
    }
    
    public Dwarf(String nome, DataTerceiraEra data){
        this.nome = nome;
        dataNascimento = new DataTerceiraEra(data.getDia(),data.getMes(), data.getAno());
        status = Status.VIVO;
    }
    
    public void perderVida() {
       double sorte = this.getNumeroDaSorte();
       boolean estaMorto = status.equals(status.MORTO);
       if(!estaMorto){
       if(sorte < 0){
           this.experiencia +=2;
       }
       if(sorte > 100){
           int vidaAposFlechada = this.vida -10;
           if (vidaAposFlechada == 0){
               status = Status.MORTO;
           }
           vida -= 10;
       }
      }
    }

    public int getVida() {
        return vida;
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
    
    public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    
     public void tentarSorte() { 
        boolean temSorte = getNumeroDaSorte() == -3333; 
        if (temSorte) { 
            // aumenta 1000 unidades para todos itens do inventario 
            inventario.aumentarUnidadesDosItens(1000); 
        } 
    }
    
}