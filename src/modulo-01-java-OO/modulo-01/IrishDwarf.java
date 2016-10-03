public class IrishDwarf{
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
    
    public IrishDwarf(){
        this(null, new DataTerceiraEra(1,1,1));
        status = Status.VIVO;
    }
    
    public IrishDwarf(String nome, DataTerceiraEra data){
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
        /* Quando eles tentarem a sorte e tiverem sucesso, ganharão 1000 * Soma de valores até a quantidade atual. 
         * Exemplo:
         * Se um dwarf irlandês possuir 3 chapéus e tiver sorte, 
         * ele ganhará 6000 unidades, que somadas às suas atuais, 
         * ficará 6003 chapéus.
        */
         
        boolean temSorte = getNumeroDaSorte() == -3333; 
        if (temSorte) { 
            // aumenta 1000 unidades para todos itens do inventario 
            //inventario.aumentarUnidadesDosItens(1000); 
            //Fatorial:
             int i = 0;
             int qtd = inventario.getItens().get(i).getQuantidade();
             int fat = qtd;
            while (qtd > 1){ 
                 fat = fat *(qtd-1); 
                 qtd--; 
                 i++;
            } 
            //aumentar 1000 * fatorial + qtd existente em cada item.
            int qtdFinal = fat * 1000;
            inventario.aumentarUnidadesDosItens(qtdFinal);
        } 
    }
}
