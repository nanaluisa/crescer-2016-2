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
        inventario.adicionarItem(new Item("Arco",1));
        //inventario = new Inventario(inventario.adicionarItem(new Item(item.getDescricao(),item.getQuantidade())));
        //itens.add(new Item(item.getDescricao(),item.getQuantidade()));
    }
            /*
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
            
            public int getQuantidade(){
                return quantidade;
            }
            
            public String getDescricao(){
                return descricao;
            }
        }
               */
    
    
    public void perderItem(Item item){
    
    }
    
    /*
       OK Permitir que Dwarves tenham UM inventário e 
       
       --> ganhem e percam itens de seu inventário.

        Sugestões (métodos para serem adicionados na classe Dwarf):
        
        adicionarItem(Item item)
        perderItem(Item item)
       
       */
    
}