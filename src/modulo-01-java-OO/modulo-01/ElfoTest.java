import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest{
    @Test
    public void elfoNasceComNome(){
        //Arrange
        String nomeEsperado = "Bruce Wayne";
        //Act
        Elfo elfoDoTeste = new Elfo(nomeEsperado,2);
        //Assert    
        assertEquals(nomeEsperado, elfoDoTeste.getNome());
    }

    @Test
    public void elfoNasceComArco(){
        //Arrange
        //Item arco = new Item("Arco",1);
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfinho",2);
        //Assert    
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao());
        
    }
    
    @Test
    public void elfoNasceComFlechas(){
        //Arrange
        int nPadrao = 42;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",2);
        //Assert    
        assertEquals(nPadrao, elfoDoTeste.getFlecha().getQuantidade());
    
    }
    /*
    @Test
    public void elfoAtiraFlechasN4(){
        //Arrange
        int nflechasRestantes = 38;
        int n = 4;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha();
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoNaoAtiraFlechas(){
        //Arrange
        int nflechasRestantes = 42;
        int n = 0;
        int exp = 0;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha();
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
    }
    
    @Test
    public void elfoAtiraFlechasN42(){
        //Arrange
        int nflechasRestantes = 0;
        int n = 42;
        int exp = 42;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha();
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
    }
    */
    
    @Test
    public void elfoAtiraUmaFlechaNoDwarf(){
        //Arrange
        String alvoEsperado = "Dwarf";
        int nflechasRestantes = 41;
        int nFlechasAtiradas = 1;
        int exp = 1;
        int vidaDwarf = 100;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii",4);
        for(int i=0; i< nFlechasAtiradas; i++){
            elfoDoTeste.atirarFlecha(alvoEsperado);
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
        //assertEquals(alvoEsperado, elfoDoTeste.);
        assertEquals(vidaDwarf, elfoDoTeste.getVidaDwarf().getVida());
    }
    
    @Test
    public void elfoErraFlechaNoDwarfTresVezes(){
        //Arrange
        String alvoEsperado = "haha";
        int nflechasRestantes = 39;
        int nFlechasAtiradas = 3;
        int exp = 3;
        int vidaDwarf = 110;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii",4);
        for(int i=0; i< nFlechasAtiradas; i++){
            elfoDoTeste.atirarFlecha(alvoEsperado);
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
        //assertEquals(alvoEsperado, elfoDoTeste.);
        assertEquals(vidaDwarf, elfoDoTeste.getVidaDwarf().getVida());
    }
    
    @Test
    public void elfoErraFlechaNoDwarfTresVezesAcertaQuatro(){
        //Arrange
        String alvoErrado = "haha";
        String alvoEsperado = "Dwarf";
        
        int nflechasRestantes = 35;
        int nFlechasNoAlvo = 4;
        int nFlechasAcertadas = 3;
        int exp = 7;
        int vidaDwarf = 70;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii",4);
        for(int i=0; i< nFlechasNoAlvo; i++){
            elfoDoTeste.atirarFlecha(alvoEsperado);
        }
        
        for(int i=0; i< nFlechasAcertadas; i++){
             elfoDoTeste.atirarFlecha(alvoErrado);
        }
       
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
        //assertEquals(alvoEsperado, elfoDoTeste.);
        assertEquals(vidaDwarf, elfoDoTeste.getVidaDwarf().getVida());
    }
    
    @Test
    public void elfoDivide2Lembas(){
        //Arrange
        int lembasEsperadas = 2;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",2);
               
        //Assert    
        assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide7Lembas(){
        //Arrange
        int lembasEsperadas = 7;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",7);
               
        //Assert    
        assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide100Lembas(){
        //Arrange
        int lembasEsperadas = 100;
        boolean respostaEsperada = true;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",100);
               
        //Assert    
        assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide101Lembas(){
        //Arrange
        int lembasEsperadas = 101;
        boolean respostaEsperada = false;
        
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",101);
               
        //Assert    
        assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
      
    }
    
    @Test
    public void elfoDivide10Lembas(){
        //Arrange
        int lembasEsperadas = 10;
        boolean respostaEsperada = true;
        int p1Esperado = 4;
        int p2Esperado = 6;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf",10);
        
               
        //Assert    
        assertEquals(respostaEsperada, elfoDoTeste.getLembas().podeDividirEmPares());
        assertEquals(p1Esperado, elfoDoTeste.getLembas().getP1());
        assertEquals(p2Esperado, elfoDoTeste.getLembas().getP2());
        
    }
    
    
    /*
    @Test
    public void elfoAtiraFlechasN100(){
        //Arrange
        int nflechasRestantes = -58;
        int n = 100;
        int exp = 100;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha();
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
    }
    */
}