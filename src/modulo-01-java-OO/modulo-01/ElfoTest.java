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
<<<<<<< HEAD
    
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
=======

    @Test
    public void elfoNasceCom42Flechas() {
        // Act
        Elfo elfoDoTeste = new Elfo("Elrond");
        // Assert
        assertEquals("Flechas", elfoDoTeste.getFlecha().getDescricao());
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
    }

    @Test
    public void elfoAtiraUmaFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(41, legolas.getFlecha().getQuantidade());
        assertEquals(1, legolas.getExperiencia());
    }

    @Test
    public void elfoAtiraDuasFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(40, legolas.getFlecha().getQuantidade());
        assertEquals(2, legolas.getExperiencia());
    }

    @Test
    public void elfoNaoAtiraFlecha() {
        // Arrange & Act
        Elfo legolas = new Elfo("Elfo");
        // Assert
        assertEquals(42, legolas.getFlecha().getQuantidade());
        assertEquals(0, legolas.getExperiencia());
    }

    @Test
    public void elfoAtira42Flechas() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(0, legolas.getFlecha().getQuantidade());
        assertEquals(42, legolas.getExperiencia());
    }

    @Test
    public void elfoAtira43Flechas() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(0, legolas.getFlecha().getQuantidade());
        assertEquals(42, legolas.getExperiencia());
    }

    @Test
    public void elfoAtiraFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        assertEquals(100, balin.getVida());
    }

    @Test
    public void elfoAtiraDuasFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(balin);
        assertEquals(90, balin.getVida());
    }

    @Test
    public void elfoAtiraUmaFlechaEmCadaDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        Dwarf gloin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(gloin);
        assertEquals(100, balin.getVida());
        assertEquals(100, gloin.getVida());
    }

    @Test
    public void elfoToStringComInformacoesIniciais() {
        Elfo legolas = new Elfo("Legolas");
        assertEquals("Legolas possui 42 flechas e 0 nível de experiência.",
            legolas.toString());

    }

    @Test
    public void elfoAtiraFlechaEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 41 flechas e 1 nível de experiência.",
            legolas.toString());

    }

    @Test
    public void elfoAtiraDuasFlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 40 flechas e 2 níveis de experiência.",
            legolas.toString());

    }
    
    @Test
    public void elfoAtira41FlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 1 flecha e 41 níveis de experiência.",
            legolas.toString());
    }
    
    @Test
    public void criarElfoInformandoFlechas() {
        Elfo elrond = new Elfo("Elrond", 56);
        assertEquals(56, elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoZeroFlechas() {
        Elfo elrond = new Elfo("Elrond", 0);
        assertEquals(0, elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoFlechasNegativas() {
        Elfo elrond = new Elfo("Elrond", -56);
        assertEquals(42, elrond.getFlecha().getQuantidade());
    }
}



>>>>>>> master
