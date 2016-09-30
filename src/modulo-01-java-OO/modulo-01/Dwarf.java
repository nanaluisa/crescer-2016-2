public class Dwarf {
<<<<<<< HEAD
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int experiencia;
    private Status status;
    private Inventario inventario;
    
=======
    private int vida, experiencia;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private Status status; //= Status.VIVO;
    private Inventario inventario;

>>>>>>> master
    // java type initializer
    // vai ser replicado para cada construtor
    {
        vida = 110;
<<<<<<< HEAD
        inventario = new Inventario();
=======
        //status = Status.VIVO;
    }

    public Dwarf() {
        this(null, new DataTerceiraEra(1,1,1));
    }

    public Dwarf(String nome, DataTerceiraEra dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
>>>>>>> master
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
<<<<<<< HEAD
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
=======
        boolean estaMorto = status.equals(Status.MORTO);
        // sai do método
        if (estaMorto) {
            return;
        }

        double numero = this.getNumeroSorte();
        if (numero < 0) {
            this.experiencia += 2;
        }
        if (numero > 100) {
            int vidaAposFlechada = this.vida - 10;
            if (vidaAposFlechada == 0) {
                status = Status.MORTO;
            }
            if (vida > 0) {
                vida = vidaAposFlechada;
            }
        }
>>>>>>> master
    }

    public int getVida() {
        return vida;
    }
<<<<<<< HEAD
    
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
=======

    public int getExperiencia() {
        return experiencia;
    }

    public String getNome() {
        return this.nome;
    }

    public Status getStatus() {
        return status;
    }
    
    public Inventario getInventario() {
        return inventario;
    }

    public DataTerceiraEra getDataNascimento() {
        return this.dataNascimento;
    }

    public double getNumeroSorte() {
        double resultado = 101.;
        boolean ehBissexto = dataNascimento.ehBissexto();

        if (ehBissexto && this.vida >= 80 && this.vida <= 90) {
            resultado *= -33.0;
        }
        //if (!dataNascimento.ehBissexto() && this.nome != null && (this.nome.equals("Seixas") || this.nome.equals("Meireles"))) {
        if (!ehBissexto && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))) {
            resultado = resultado * 33 % 100;
        }

        return resultado;
    }
    
    public void adicionarItem(Item item) {
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item) {
        this.inventario.removerItem(item);
    }
    
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333;
        if (temSorte) {
            // aumenta 1000 unidades para todos itens do inventario
            inventario.aumentarUnidadesDosItens(1000);
        }
    }
}
>>>>>>> master
