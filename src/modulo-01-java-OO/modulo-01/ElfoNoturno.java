public class ElfoNoturno extends Elfo{
    public ElfoNoturno(String nome){
        super(nome);
    }
       
    public void atirarFlecha(Dwarf dwarf){
        super.atirarFlecha(dwarf);
        //adicionei +1 na experiência, pois como chamei o atirar flecha da super,lá a experiencia já recebe 1, 
        // e aqui recebe +2 do Elfo Noturno.
        experiencia += 2;
        this.vida -= (vida * 0.05);
                //outras formas de calcular a vida:
                //double qtdVidaAPerder = this.vida * 0.05; 
                //double qtdVidaAPerder = this.vida * 5/100; 
                //this.vida -= qtdVidaAPerder; 
                //this.vida *= 0.95; 
        
        this.status = this.vida < 1 ? Status.MORTO : this.status;//ternary operator para verificação do status.
        //this.status = (int)this.vida == 0 ? Status.MORTO : this.status;
    }
}