public class IrishDwarf extends Dwarf{
       
    public IrishDwarf(){
        this(null, new DataTerceiraEra(1,1,1));
        status = Status.VIVO;
    }
    
    public IrishDwarf(String nome, DataTerceiraEra data){
        super(nome,data);
    }
        
     public void tentarSorte() { 
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
