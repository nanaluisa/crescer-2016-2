import java.util.List;
public interface Estrategia{
   List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes);    
   List<Elfo> getOrdemDeAtaqueIntercalada(List<Elfo> atacantes); 
   
    /*  Importante
      Para os exercícios abaixo, o cliente pediu que fossem criadas estratégias de ataque para os
      exércitos. 
      Ou seja, crie um contrato de estratégias que permita ordenar o contingente de ataque com 
      diferentes estilos de guerra, a partir do método:
        
        Sugestão:
        List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes, List<Dwarf> alvos)
    */
}

