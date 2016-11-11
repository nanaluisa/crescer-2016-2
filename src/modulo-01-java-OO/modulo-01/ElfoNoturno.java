public class ElfoNoturno extends Elfo {   
    public ElfoNoturno(String nome) {
        super(nome);
    }

    public ElfoNoturno(String nome, int qtdFlechas) {
        super(nome, qtdFlechas);
    }

    /**
     * Atira flecha em um Dwarf ganhando triplo de experiência, mas perdendo 5% de vida.
     * Como a vida do Elfo é ponto flutuante (double) as divisões não são exatas, e embora elas tendam a 0 elas nunca chegarão a zero, ficando cada vez mais próximo, mas sempre com restos de divisão.
     * Por isto, para matar o elfo precisamos considerar apenas a parte inteira do número (convertendo para int) OU quando o número for MENOR que 1.
     * @param Dwarf Alvo que receberá flechada.
     */
    public void atirarFlecha(Dwarf dwarf) {
        if (status == Status.VIVO && getFlecha().getQuantidade() > 0) {
            super.atirarFlechas(dwarf, 3);
            this.vida *= 0.95;
            this.status = (int)this.vida == 0 ? Status.MORTO : this.status;
        }
    }

    /*    //adicionei +1 na experiência, pois como chamei o atirar flecha da super,lá a experiencia já recebe 1, 
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
    }*/
}