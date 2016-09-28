import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CestoDeLembasTest{
    @Test
    public void criarCestoComUmPao(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(1);
        //Act
        
               
        //Assert    
        // assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    
    
    
    @Test
    public void elfoDivide2Lembas(){
        //Arrange
        int lembasEsperadas = 2;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
               
        //Assert    
        // assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide7Lembas(){
        //Arrange
        int lembasEsperadas = 7;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
               
        //Assert    
        //assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide100Lembas(){
        //Arrange
        int lembasEsperadas = 100;
        boolean respostaEsperada = true;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
               
        //Assert    
        //assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide101Lembas(){
        //Arrange
        int lembasEsperadas = 101;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
               
        //Assert    
        //assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide10Lembas(){
        //Arrange
        int lembasEsperadas = 10;
        boolean respostaEsperada = true;
        int p1Esperado = 4;
        int p2Esperado = 6;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
        
               
        //Assert    
        //assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
        //assertEquals(p1Esperado, elfoDoTeste.getLembas().getP1());
        //assertEquals(p2Esperado, elfoDoTeste.getLembas().getP2());
        
    }
    
}
