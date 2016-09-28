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
        Elfo elfoDoTeste = new Elfo(nomeEsperado);
        //Assert    
        assertEquals(nomeEsperado, elfoDoTeste.getNome());
    }

    @Test
    public void elfoNasceComArco(){
        //Arrange
        //Item arco = new Item("Arco",1);
        int nPadrao = 1;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfinho");
        //Assert    
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao());
        assertEquals(nPadrao, elfoDoTeste.getArco().getQuantidade());
    }
    
    @Test
    public void elfoNasceCom42Flechas(){
        //Arrange
        int nPadrao = 42;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elf");
        //Assert    
        assertEquals("Flechas", elfoDoTeste.getFlecha().getDescricao());
        assertEquals(nPadrao, elfoDoTeste.getFlecha().getQuantidade());
    
    }
    
    @Test
    public void elfoAtira1Flecha(){
        //Arrange
        Elfo elfoDoTeste = new Elfo ("Elf");
        //Act
         elfoDoTeste.atirarFlecha(new Dwarf());
        //Assert    
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
    }
    
    @Test
    public void elfoAtira2Flechas(){
        //Arrange
        Elfo elfoDoTeste = new Elfo ("Elf");
        //Act
         elfoDoTeste.atirarFlecha(new Dwarf());
         elfoDoTeste.atirarFlecha(new Dwarf());
        //Assert    
        assertEquals(40, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(2, elfoDoTeste.getExperiencia());
    }
    
    @Test
    public void elfoAtira1FlechaEmUmDwarf(){
        //Arrange
        Elfo elfoDoTeste = new Elfo ("Elf");
        //Act
        Dwarf balin = new Dwarf();
        elfoDoTeste.atirarFlecha(balin);
        //Assert    
        assertEquals(41, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(1, elfoDoTeste.getExperiencia());
        assertEquals(100, balin.getVida());
    }
    
    
     @Test
    public void elfoNaoAtiraFlechas(){
        Elfo elfoDoTeste = new Elfo ("Elfii");
        //Assert    
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(0, elfoDoTeste.getExperiencia());
    }
    
     @Test
    public void exibeDadosDoElfo(){
        Elfo elfo = new Elfo ("Legolas");
        //Assert   
        assertEquals("Legolas possui 42 flechas e 0 nível de experiência.", elfo.toString());       
    }
    
    @Test
    public void criarElfoCom5Flechas(){
        Elfo elfo = new Elfo ("Elfo", 5);
        //Assert   
        assertEquals("Elfo", elfo.getNome());       
        assertEquals(5, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoCom50Flechas(){
        Elfo elfo = new Elfo ("Elfo", 50);
              
        //Assert   
        assertEquals("Elfo", elfo.getNome());       
        assertEquals(5420, elfo.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoCom500Flechas(){
        Elfo elfo = new Elfo ("Elfo", 500);
              
        //Assert   
        assertEquals("Elfo", elfo.getNome());       
        assertEquals(42, elfo.getFlecha().getQuantidade());
    }
    
    
    
    
    /*@Test
    public void elfoAtira4Flechas(){
        //Arrange
        Elfo elfoDoTeste = new Elfo ("Elf");
        int nflechasRestantes = 38;
        int n = 4;
        //Act
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha();
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
    }*/
    /*
    @Test
    public void elfoNaoAtiraFlechas() {
        //Arrange
        int nflechasRestantes = 42;
        int n = 0;
        int exp = 0;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
        for(int i=0; i< n; i++){
            elfoDoTeste.atirarFlecha(new Dwarf());
        }
        //Assert    
        assertEquals(nflechasRestantes, elfoDoTeste.getFlecha().getQuantidade());
        assertEquals(exp, elfoDoTeste.getExperiencia());
    }
    /*
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
    /*
    @Test
    public void elfoAtiraUmaFlechaNoDwarf(){
        //Arrange
        String alvoEsperado = "Dwarf";
        int nflechasRestantes = 41;
        int nFlechasAtiradas = 1;
        int exp = 1;
        int vidaDwarf = 100;
        //Act
        Elfo elfoDoTeste = new Elfo ("Elfii");
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
        Elfo elfoDoTeste = new Elfo ("Elfii");
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
        Elfo elfoDoTeste = new Elfo ("Elfii");
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