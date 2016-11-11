import java.util.List;
public interface Estrategia{
   List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes);    
   List<Elfo> getOrdemDeAtaqueIntercalada(List<Elfo> atacantes) throws ExercitoNaoAtingiuException;
}


