public class NaoPodeAlistarException extends Exception{
    
    public NaoPodeAlistarException(){
        super("Não foi possível alistar o Elfo informado, pois somente Elfos Verdes e Noturnos são válidos.");
    }
    
    
    public NaoPodeAlistarException(String erro){
        super(erro);
    }
    
}
