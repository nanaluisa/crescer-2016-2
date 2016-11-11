public class ExercitoNaoAtingiuException extends Exception {

    public ExercitoNaoAtingiuException(){
        super("ContingenteDesproporcionalException");
    }
    
    public ExercitoNaoAtingiuException(String erro) {
        super(erro);
    }
}