public class ElfoVerde extends Elfo{
   
    public ElfoVerde(String nome) {
        super(nome);
    }
    
    public void setItensElfo(int quantidadeFlechas){
        this.inventario.adicionarItem(new Item("Espada de aço valiriano", 0));
        this.inventario.adicionarItem(new Item("Arco e Flecha de Vidro", quantidadeFlechas));
    }
       
    public Item getEspadaDeAco(){
        return this.inventario.getItens().get(0); 
    }
    
    public Item getArcoEFlechaVidro(){
        return this.inventario.getItens().get(1); 
    }
    
    public void atirarFlecha(Dwarf dwarf){
        super.atirarFlecha(dwarf);
        //adicionei +1 na experiência, pois como chamei o atirar flecha da super,
        //lá a experiencia já recebe 1, +1 do Elfo Verde.
        experiencia += 1;
    }
    
    
    
    /*
    Elfos Verdes

    O novo patch do jogo permitirá o uso de Elfos Verdes! 
    Eles ganham o dobro de experiência que os elfos normais ganham ao 
    atirar uma flecha e só podem ter itens com as seguintes descrições:
    
    "Espada de aço valiriano"
    "Arco e Flecha de Vidro"
    Não se preocupe com os elfos normais, com a chegada dos Elfos Verdes eles 
    não ficarão extintos.   
        */
    
    
    
       
       
}
