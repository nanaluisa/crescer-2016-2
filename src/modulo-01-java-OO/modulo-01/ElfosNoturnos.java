public class ElfosNoturnos extends Elfo{
    public ElfosNoturnos(String nome){
        super(nome);
    }
       
    public void atirarFlecha(Dwarf dwarf){
        super.atirarFlecha(dwarf);
        //adicionei +1 na experiência, pois como chamei o atirar flecha da super,
        //lá a experiencia já recebe 1, +2 do Elfo Noturno.
        experiencia += 2;
        vida -= (vida * 0.05);
        
        //boolean estaMorto == this.vida;
        //if (!estaMorto){        
            if(vida -0.5 == 0.0){
                status = Status.MORTO;
            }
       //}
    }
    
    /*
   
    
    
       double sorte = this.getNumeroDaSorte();
       boolean estaMorto = status.equals(status.MORTO);
       double vidaAposFlechada = this.vida - 0.5;
      
           double vidaAposFlechada = this.vida - 10.0;
           if (vidaAposFlechada == -0.1){
               status = Status.MORTO;
           }
           vida -= (vida*0.05);*/
}