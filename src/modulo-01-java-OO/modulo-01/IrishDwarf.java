public class IrishDwarf{
    private int vida;
    private DataTerceiraEra dataNascimento;
    private String nome;
    private int experiencia;
    private Status status;
    private Inventario inventario;
    
       
    {
        vida = 110;
        inventario = new Inventario();
        //status = Status.VIVO;
    }

    public IrishDwarf() {
        this(null, new DataTerceiraEra(1,1,1));
        status = Status.VIVO;
    }

    public IrishDwarf(String nome, DataTerceiraEra dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.status = Status.VIVO;
        this.inventario = new Inventario();
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
       //=======
        //boolean estaMorto = status.equals(Status.MORTO);
        // sai do método
       /*if (estaMorto) {
            return;
        }*/

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
       //>>>>>>> master
    }

    public int getVida() {
        return vida;
    }
    //<<<<<<< HEAD
    
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
       
    public String getNome() {
        return this.nome;
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
    
    //Dwarf com muita sorte!
    public void tentarSorte() {
        boolean temSorte = getNumeroSorte() == -3333; 
        
        int somaFat =1;
        int valor = 0;//inv.getInventario().getQuantidade(); 
        
        for(int i = 0; i < 8; i++){
            somaFat *= i;
        }
        
        //inventario.get(0).getQuantidade();
        //int somaFat = 0;
        inventario.getItens();//.getQuantidade();
        for(int i = 0; i<itens.size(); i++){
            int somaEste = item.getQuantidade();           
            
            //somaFat *= i;
         }
        //Soma de valores até a quantidade atual.
        /*
         * int fat = 1;
                int valor = 5; //ou qualquer outro valor que queira calcular;
                for( int i = 2; i <= valor; i++ )
                { 
                     fat *= i;
                    }
            }
         * 
        ganharão 1000 * Soma de valores até a quantidade atual. Exemplo:

        Se um dwarf irlandês possuir 3 chapéus e tiver sorte, ele ganhará 6000 unidades, que somadas às
        suas atuais, ficará 6003 chapéus.
        
            fatorial:
            int i, Fat = 4;
    
    	  for (i=1;i<=Fat;i+1){
    
    		Fat=Fat*i;
    
    	     	}System.out.print(Fat);
    
    		}
    	}
    
            */
       
        if (temSorte) {
            // aumenta 1000 unidades para todos itens do inventario
            inventario.aumentarUnidadesDosItens(1000 * somaFat);
        }
        
    }
}
